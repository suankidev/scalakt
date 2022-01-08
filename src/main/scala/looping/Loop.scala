package looping

import scala.util.control.Breaks

object Loop {

  def code = {

    for (i <- 1 to 5) {
      print(s"${i} ")
    }

    /**
     * It is helpful to apply until keyword
     * when you are iterating string or array, because array range is 0 to n-1.
     * until does not exceed to n-1.
     */

    println()
    for (i <- 1 until 5) {
      print(s"${i} ")
    }

    println()
    for (i <- 1 to 10 if (i % 2 == 0))
      print(s"${i} ")
    println()

    /**
     * use buffer internally to store iterated result and after finishing all iterations it yields the final result from that buffer.
     * It does not work like imperative loop.
     */


    val myVal = for (i <- 1 to 100) yield i

    print(myVal)

    println()

    myVal.foreach(
      (element: Int) => print(element)
    )
    println()
    
    Breaks.breakable {
      for (i <- 1 to 50) {
        if (i > 30) {
          Breaks.break
        }
        else
          print(i)
      }
    }

    println()
  }

}
