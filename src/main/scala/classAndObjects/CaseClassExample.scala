package classAndObjects

/**
 * Scala case classes are just regular classes which are immutable by default and decomposable through pattern matching.
 *
 * It uses equal method to compare instance structurally. It does not use new keyword to instantiate object.
 *
 * All the parameters listed in the case class are public and immutable by default.
 *
 */
object CaseClassExample {

  def main(args: Array[String]): Unit = {

    val a=Employee1(10,"abhiraj")
    val b=Employee1(20,"rohit")

    //accessing case class element
    println(a.name)

    println(a == b)

    val age=30

    age match {
      case 20=>println(age)
      case _=>println("default")
    }

    new Animal    //it's calling println also , b/c all without parameter considered inside defaault constructor
  }

}

//apply method to construct the object
case class Employee1(id: Int, name: String)

class Animal{
  println("this is part of primary constructor is no parameter is assigned!")
}

