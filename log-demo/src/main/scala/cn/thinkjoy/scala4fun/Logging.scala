package cn.thinkjoy.scala4fun
import org.log4s._

/**
 * Created by jacksu on 15/11/13.
 */
trait Logging {
  private val clazz=this.getClass
  lazy val logger=getLogger(clazz)
}
