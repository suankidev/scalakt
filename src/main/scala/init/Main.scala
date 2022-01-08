package init

object Main {


  def main(args: Array[String]): Unit = {

    println(s"${"=" * 10}Start of the main${"=" * 10}")

    import looping.Loop

    Loop.code

    println(s"${"=" * 10}END of the main${"=" * 10}")


  }


}
