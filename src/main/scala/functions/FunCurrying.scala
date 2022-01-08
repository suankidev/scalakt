package functions

/**
 * it is a technique of transforming
 * a function that takes multiple arguments into a function that takes a single argument
 */

object FunCurrying {
  //==================
  //closure
  var x: Int = 1337

  def addToX(y: Int) = x + y //y is bound variable and x is free variable

  x = 10
  println(addToX(1)) //11
  x = 20
  println(addToX(2)) //22
  x = 30
  println(addToX(3)) //33
  //=========currying
  //nesting of function

  def addTo(bound: Int): Int => Int =
    boundvariable => bound + boundvariable

  //returning a function from addtox
  //producing a function as a result is also high order function  properties

  println(addTo(bound = 10)(2)) //12

  def code = {
    def add(a: Int)(b: Int) = {
      a + b
    }


    def add1(a: Int, b: Int, c: Int) = {
      def add2(x: Int, y: Int) = {
        x + y
      }

      add2(a, add2(b, c))
    }

    def add5(t:Int):(x:Int,y:Int)=>Int=
      (x:Int,y:Int)=>t+x+y

    //variable length argument

    def temp(a:Int*)={
      a.foreach(
        a=>println(a*4)
      )
    }

    temp(1,2,3,4)
    temp(348,38)

    val rslt = add(10)(20)

    println(rslt)





  }


}
