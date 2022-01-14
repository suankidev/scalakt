package classAndObjects

/**
 * In scala no static concept. So scala creates a singleton object to provide entry point for your program execution.
 * If you don't create singleton object, your code will compile successfully but will not produce any output. Methods declared inside Singleton Object are accessible globally.
 * A singleton object can extend classes and traits.
 */

object Employee {
  def main(args:Array[String]):Unit={
     SingletonObject.show()   //no need to create object
  }
}

object SingletonObject{
  def show(): Unit ={
    println("singlton object show method")
  }
  new SingletonObject().display
}

//when you have a class with same name as singleton object,
// it is called companion class and the singleton object is called companion object
//The companion class and its companion object both must be defined in the same source file.

class  SingletonObject{
  def display: Unit ={
    println("Display employee singleton object")
  }
}
