import org.apache.log4j.Logger

object Application extends App {

  val log = Logger.getLogger(this.getClass)
  var list = List()
  val number1 = 23
  val obj = new CollatzEquation
  val list1 = obj.check(list, number1)
  log.info(s"$list1 \n")

}
