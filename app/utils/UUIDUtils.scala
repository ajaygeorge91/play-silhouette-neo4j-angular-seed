package utils

import java.util.UUID

/**
 * Created by ajay on 10/9/15.
 */
object UUIDUtils {

  def generateUUID():UUID = UUID.randomUUID()

  def generateUUIDString() :String = generateUUID().toString

  def getUUIDFromString(value:String):UUID = UUID.fromString(value)

  def getStringFromUUID(value:UUID):String = value.toString

}
