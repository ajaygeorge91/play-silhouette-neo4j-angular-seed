package models.daos

import javax.inject.Inject

import com.mohiva.play.silhouette.api.LoginInfo
import com.mohiva.play.silhouette.impl.daos.DelegableAuthInfoDAO
import com.mohiva.play.silhouette.impl.providers.OAuth1Info
import models.daos.drivers.Neo4J

import play.api.libs.concurrent.Execution.Implicits._
import play.api.libs.functional.syntax._
import play.api.libs.json._
import play.api.libs.ws.WSResponse

import scala.concurrent.Future

/**
 * The DAO to store the OAuth1 information.
 *
 * Note: Not thread safe, demo only.
 */
class OAuth1InfoDAO @Inject() (neo: Neo4J)  extends DelegableAuthInfoDAO[OAuth1Info] {


  implicit val OAuth1InfoWrites: Writes[OAuth1Info] = (
    (JsPath \ "token").write[String] and
    (JsPath \ "secret").write[String]
    )(unlift(OAuth1Info.unapply))

  implicit val OAuth1InfoReads: Reads[OAuth1Info] = (
    (JsPath \ "token").read[String] and
    (JsPath \ "secret").read[String]
    )(OAuth1Info)

  /**
   * Finds the auth info which is linked with the specified login info.
   *
   * @param loginInfo The linked login info.
   * @return The retrieved auth info or None if no auth info could be retrieved for the given login info.
   */
  def find(loginInfo: LoginInfo): Future[Option[OAuth1Info]] = {
    neo.cypher("MATCH (n:User)-[:HAS_OAUTH2_INFO]->(o) WHERE n.loginInfo = {loginInfo} RETURN o", Json.obj(
      "loginInfo" -> JsString(loginInfo.providerID + ":" + loginInfo.providerKey)
    )).map(parseNeoOAuth1Info)
  }

  /**
   * Adds new auth info for the given login info.
   *
   * @param loginInfo The login info for which the auth info should be added.
   * @param authInfo The auth info to add.
   * @return The added auth info.
   */
  def add(loginInfo: LoginInfo, authInfo: OAuth1Info): Future[OAuth1Info] = {
    neo.cypher(
      """MATCH (n:User) WHERE n.loginInfo = {loginInfo}
         CREATE (n)-[:HAS_OAUTH2_INFO]->(o:Oauth2Info {props})
         RETURN o
      """,
      Json.obj(
        "loginInfo" -> JsString(loginInfo.providerID + ":" + loginInfo.providerKey),
        "props" -> writeNeoOAuth1Info(authInfo)
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
  def update(loginInfo: LoginInfo, authInfo: OAuth1Info): Future[OAuth1Info] = {
    neo.cypher(
      """
        MATCH (n:User)-[:HAS_OAUTH2_INFO]->(o) WHERE n.loginInfo = {loginInfo}
        SET n = {props} RETURN o
      """,
      Json.obj(
        "loginInfo" -> JsString(loginInfo.providerID + ":" + loginInfo.providerKey),
        "props" -> writeNeoOAuth1Info(authInfo)
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
  def save(loginInfo: LoginInfo, authInfo: OAuth1Info): Future[OAuth1Info] = {
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
        MATCH (n:User)-[r:HAS_OAUTH2_INFO]->(o) WHERE n.loginInfo = {loginInfo}
        DELETE r,o
      """,
      Json.obj(
        "loginInfo" -> JsString(loginInfo.providerID + ":" + loginInfo.providerKey)
      )
    ).map(res => Unit)
  }

  /**
   * Parses a WsResponse to get a unique OAuth1Info out of it.
   *
   * @param response response object
   * @return The parsed OAuth1Info.
   */
  def parseNeoOAuth1Info(response: WSResponse) = (((Json.parse(response.body) \ "results")(0) \ "data")(0) \ "row")(0).asOpt[OAuth1Info]

  def writeNeoOAuth1Info(authInfo: OAuth1Info) = {
    val jsonAuth = Json.toJson(authInfo)
    val params = (jsonAuth \ "params").asOpt[JsValue]

    params match {
      case None => jsonAuth
      case Some(p) => (jsonAuth.as[JsObject] - "params") ++ Json.obj("params" -> Json.stringify(p))
    }
  }

}
