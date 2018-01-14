import org.apache.log4j.Logger

object Application extends App {

  val log = Logger.getLogger(this.getClass)
  var list = List()
  val number1 = 23
  val number2 = 10
  val number3 = 5
  val number4 = 7
  val obj = new CollatzEquation

  val list1 = obj.check(list, number1)
  log.info(s"$list1 \n")

  val list2 = obj.check(list1, number2)
  log.info(s"$list2 \n")

  val list3 = obj.check(list2, number3)
  log.info(s"$list3 \n")

  val list4 = obj.check(list3, number4)
  log.info(s"$list4 \n")

}
