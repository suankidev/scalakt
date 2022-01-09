package looping

object TailRecursion {

  def code = {


    @scala.annotation.tailrec
    def loop(acc: Int = 0, x: Int): Int =
      if (x == 0) acc
      else
        loop(acc = acc + x, x - 1)

    
    val add = loop(x = 10)


    println(add)

  }
}
  
