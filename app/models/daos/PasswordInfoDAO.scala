package models.daos

import java.util.NoSuchElementException
import javax.inject.Inject

import com.mohiva.play.silhouette.api.LoginInfo
import com.mohiva.play.silhouette.api.util.PasswordInfo
import com.mohiva.play.silhouette.impl.daos.DelegableAuthInfoDAO
import com.mohiva.play.silhouette.impl.providers.OAuth1Info
import models.daos.drivers.Neo4J
import org.anormcypher.{Cypher, Neo4jREST}
import play.api.libs.concurrent.Execution.Implicits._
import play.api.libs.functional.syntax._
import play.api.libs.json._
import play.api.libs.ws.WSResponse
import utils.UserCreateException

import scala.collection.mutable
import scala.concurrent.Future

/**
 * The DAO to store the password information.
 */
class PasswordInfoDAO @Inject() (neo: Neo4J)  extends DelegableAuthInfoDAO[PasswordInfo] {


  implicit val PasswordInfoWrites: Writes[PasswordInfo] = (
    (JsPath \ "hasher").write[String] and
      (JsPath \ "password").write[String] and
      (JsPath \ "salt").writeNullable[String]
    )(unlift(PasswordInfo.unapply))

  implicit val OAuth1InfoReads: Reads[PasswordInfo] = (
    (JsPath \ "hasher").read[String] and
      (JsPath \ "password").read[String] and
      (JsPath \ "salt").readNullable[String]
    )(PasswordInfo)

  /**
   * Finds the auth info which is linked with the specified login info.
   *
   * @param loginInfo The linked login info.
   * @return The retrieved auth info or None if no auth info could be retrieved for the given login info.
   */
  def find(loginInfo: LoginInfo): Future[Option[PasswordInfo]] = {
    neo.cypher("MATCH (n:User)-[:HAS_PASSWORD_INFO]->(o) WHERE n.loginInfo = {loginInfo} RETURN o", Json.obj(
      "loginInfo" -> JsString(loginInfo.providerID + ":" + loginInfo.providerKey)
    )).map(parseNeoPasswordInfo)
  }

  /**
   * Adds new auth info for the given login info.
   *
   * @param loginInfo The login info for which the auth info should be added.
   * @param authInfo The auth info to add.
   * @return The added auth info.
   */
  def add(loginInfo: LoginInfo, authInfo: PasswordInfo): Future[PasswordInfo] = {
    neo.cypher(
      """MATCH (n:User) WHERE n.loginInfo = {loginInfo}
         CREATE (n)-[:HAS_PASSWORD_INFO]->(o:PasswordInfo {props})
         RETURN o
      """,
      Json.obj(
        "loginInfo" -> JsString(loginInfo.providerID + ":" + loginInfo.providerKey),
        "props" -> writeNeoPasswordInfo(authInfo)
      )
    ).map(res => authInfo)
  }

  /**
   * Updates the auth info for the given login info.
   *
   * @param loginInfo The login info for which the auth info should be updated.
   * @param authInfo The auth info to update.
   * @return The updated auth info.
   */
  def update(loginInfo: LoginInfo, authInfo: PasswordInfo): Future[PasswordInfo] = {
    neo.cypher(
      """
        MATCH (n:User)-[:HAS_PASSWORD_INFO]->(o) WHERE n.loginInfo = {loginInfo}
        SET n = {props} RETURN o
      """,
      Json.obj(
        "loginInfo" -> JsString(loginInfo.providerID + ":" + loginInfo.providerKey),
        "props" -> writeNeoPasswordInfo(authInfo)
      )
    ).map(res => authInfo)
  }

  /**
   * Saves the auth info for the given login info.
   *
   * This method either adds the auth info if it doesn't exists or it updates the auth info
   * if it already exists.
   *
   * @param loginInfo The login info for which the auth info should be saved.
   * @param authInfo The auth info to save.
   * @return The saved auth info.
   */
  def save(loginInfo: LoginInfo, authInfo: PasswordInfo): Future[PasswordInfo] = {
    find(loginInfo).flatMap {
      case Some(_) => update(loginInfo, authInfo)
      case None => add(loginInfo, authInfo)
    }
  }

  /**
   * Removes the auth info for the given login info.
   *
   * @param loginInfo The login info for which the auth info should be removed.
   * @return A future to wait for the process to be completed.
   */
  def remove(loginInfo: LoginInfo): Future[Unit] = {
    neo.cypher(
      """
        MATCH (n:User)-[r:HAS_PASSWORD_INFO]->(o) WHERE n.loginInfo = {loginInfo}
        DELETE r,o
      """,
      Json.obj(
        "loginInfo" -> JsString(loginInfo.providerID + ":" + loginInfo.providerKey)
      )
    ).map(res => Unit)
  }

  /**
   * Parses a WsResponse to get a unique PasswordInfo out of it.
   *
   * @param response response object
   * @return The parsed PasswordInfo.
   */
  def parseNeoPasswordInfo(response: WSResponse) = (((Json.parse(response.body) \ "results")(0) \ "data")(0) \ "row")(0).asOpt[PasswordInfo]

  def writeNeoPasswordInfo(authInfo: PasswordInfo) = {
    val jsonAuth = Json.toJson(authInfo)
    val params = (jsonAuth \ "params").asOpt[JsValue]

    params match {
      case None => jsonAuth
      case Some(p) => (jsonAuth.as[JsObject] - "params") ++ Json.obj("params" -> Json.stringify(p))
    }
  }
}