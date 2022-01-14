package classAndObjects

object ConstructorExample {

  def main(args: Array[String]): Unit = {
  val emp1=new Test(10,"sujeet",29)
    emp1.show()

  }
}


class Test(name: String) {
  var id: Int = 0
  var age:Int = 0
  def show(): Unit = {
    println(s"${id} ${age} ${name}")
  }
  def this(id: Int, name: String, age: Int)={
    this(name) //calling primary constructor and it's first line
    this.id = id
    this.age=age
  }
  def this(id:Int,name:String)={
    this(name)
    this.id=id
    this.age=18
  }

}
