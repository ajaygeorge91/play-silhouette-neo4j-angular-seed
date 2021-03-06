package models.daos

import java.util.UUID
import javax.inject.Inject

import com.mohiva.play.silhouette.api.LoginInfo
import models.daos.drivers.Neo4J
import models.User
import play.api.libs.json.{JsString, JsObject, JsUndefined, Json}
import play.api.libs.ws._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

/**
 * Give access to the user object.
 */
class UserDAOImpl @Inject() (neo: Neo4J) extends UserDAO {

  /**
   * Finds a user by its login info.
   *
   * @param loginInfo The login info of the user to find.
   * @return The found user or None if no user for the given login info could be found.
   */
  def find(loginInfo: LoginInfo): Future[Option[User]] = {
    neo.cypher("MATCH (n:User) WHERE n.loginInfo = {loginInfo} RETURN n", Json.obj(
      "loginInfo" -> JsString(loginInfo.providerID + ":" + loginInfo.providerKey)
    )).map(parseNeoUser)
  }

  /**
   * Finds a user by its user ID.
   *
   * @param userID The ID of the user to find.
   * @return The found user or None if no user for the given ID could be found.
   */
  def find(userID: UUID): Future[Option[User]] = {
    neo.cypher("MATCH (n:User) WHERE n.userID = {userID} RETURN n", Json.obj(
      "userID" -> userID.toString
    )).map(parseNeoUser)
  }

  /**
   * Saves a user.
   *
   * @param user The user to save.
   * @return The saved user.
   */
  def save(user: User): Future[User] = {

    val jsonUser = Json.toJson(user).as[JsObject] - "loginInfo"
    val jsonToSend = jsonUser ++ Json.obj("loginInfo" -> JsString(user.loginInfo.providerID + ":" + user.loginInfo.providerKey))

    neo.cypher("CREATE (n:User {props}) RETURN n", Json.obj(
      "props" -> jsonToSend
    )).map(response => user)
  }

  /**
   * Parses a WsResponse to get a unique user out of it.
   *
   * @param response response object
   * @return The parsed user.
   */
  def parseNeoUser(response: WSResponse): Option[User] = {
    (((Json.parse(response.body) \ "results")(0) \ "data")(0) \ "row")(0) match {
      case _: JsUndefined => None
      case user => {
        val loginInfo = (user \ "loginInfo").as[String]
        val logInfo = loginInfo.split(":")
        Some(User(
          UUID.fromString((user \ "userID").as[String]),
          LoginInfo(logInfo(0), logInfo(1)),
          (user \ "firstName").asOpt[String],
          (user \ "lastName").asOpt[String],
          (user \ "fullName").asOpt[String],
          (user \ "email").asOpt[String],
          (user \ "avatarURL").asOpt[String]
        ))
      }
    }
  }
}