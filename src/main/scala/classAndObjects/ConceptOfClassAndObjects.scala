package classAndObjects

import java.text.SimpleDateFormat
import java.util.Date
import scala.language.postfixOps

object ConceptOfClassAndObjects {

  def main(args: Array[String]): Unit = {

    val s=new Student()
    //println(s"${s.id} ${s.name}")
    val s1=new Student1(17,"Rohit")  // Passing values to constructor
    s1.show()
    new Student1(18,"pratap").show()

  }
}


class Student{
  var id:Int=175487
  var name:String="Sujeet kumar singh"
}

class  Student1(id:Int,name:String) {//primary constructor
  def show(): Unit ={
    println(s"${id} and ${name}")
  }
}





