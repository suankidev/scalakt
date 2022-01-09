package init

object MatchCase {
  val test = check(0)
  println(test)
  //pattern matching example one
  test match {
    case -2 => println("negative number")
    case -1 => println("zero")
    case 0 => println("positive number")
    case _ => println("faild authentications!")

  }

  def t(x: Int) = x match {
    case -2 => println("negative number")
    case -1 => println("zero")
    case 0 => println("positive number")
    case _ => println("faild authentications!")

  }

  var x = 9
  while (x >= 1) {
    t(x)
    x = x - 0
  }

  def check(x: Int) = if (x > 0) 1 else if (x == 0) 0 else -1
}
