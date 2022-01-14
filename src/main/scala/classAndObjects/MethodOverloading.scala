package classAndObjects

object MethodOverloading extends App{
 val t=new MethodOloading()
   println(t.add(10,20))
   println(t.add(10,20,30))

}


class MethodOloading{

  def add(a:Int,b:Int)={
    a+b
  }

  def add(a:Int,b:Int,c:Int)={
    a+b+c
  }

}
