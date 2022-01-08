package functions

object FunctionsExample {

  def code = {

    def loop(x: Int): Any = for (i <- 1 to 10) yield i


    def loop1(x: Int) = {
      println("test")
    }


    //must be base condititon for the loop to terminate

    def loop3(x: Int): Int = {
      if (x == 0) 0
      else x + loop3(x - 1)
    }

    def loop4(x: Int, y: Int): Int = if (y == 0) 0 else x + loop4(x, y - 1)
    //or

    println(loop4(15, 2))

    val rslt = loop3(3)
    //10    10+loop3(9)
    //9     10+9+8
    //8..2     10+9+8+7....loop3(1)
    //1      10+...1+loop3(0)
    println(s"result are ${rslt}")


    //default parameter

    def t1(x: Int, y: Int = 0) = {
      println(x + y)
    }

    t1(10)


    //named parameter

    var result1 = functionExample(a = 15, b = 2) // Parameters names are passed during call
    var result2 = functionExample(b = 15, a = 2) // Parameters order have changed during call
    var result3 = functionExample(15, 2) // Only values are passed during call
    println(result1 + "\n" + result2 + "\n" + result3)
  }

  def functionExample(a: Int, b: Int): Int = {
    a + b
  }

  //ananymous functions



}
