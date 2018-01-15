class CollatzEquation {

  def contain(list: List[Int], element: Int): Boolean = {
    list match {
      case head :: tail => if(head == element) true else contain(tail, element)
      case Nil => false
    }
  }

  def check(list: List[Int], element: Int): List[Int] = {
    if(!contain(list, element)) {
      element match {
        case 1 => list
        case element => if(element % 2 == 0) check(element :: list, element / 2) else check(element :: list, 3*element + 1)
      }
    }
    else {
      list
    }
  }

}
