
package utils

/**
 * Created by ajay on 21/7/15.
 */

class CustomException (message:String) extends Exception(message)

case class UserCreateException(message:String) extends CustomException(message) {
  override def toString: String = {
    message
  }
}

case class UserUpdateException(message:String) extends CustomException(message) {
  override def toString: String = {
    message
  }
}

case class ArticleCreateException(message:String) extends CustomException(message) {
  override def toString: String = {
    message
  }
}
