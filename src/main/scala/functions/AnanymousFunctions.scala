package functions

object AnanymousFunctions {
  def code = {

    val a = (x: Int, y: Int) => x + y
    val a1: (x: Int) => Int = x => x + 1
    val a2: (x: Int, y: Int) => Int = (x, y) => x + y
    val a3:()=>Int=()=>23
    var result1 = (a:Int, b:Int) => a+b        // Anonymous function by using => (rocket)
    var result2 = (_:Int)+(_:Int)              // Anonymous function by using _ (underscore) wild card

    println(result1(10,10))
    println(result2(10,10))
    println(a(10, 20))
    println(a1(10))
    println(a2(10, 20))






  }


}
