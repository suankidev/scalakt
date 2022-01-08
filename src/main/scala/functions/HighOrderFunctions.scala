package functions

import java.time.temporal.TemporalAmount

object HighOrderFunctions {

  def code = {

    def depositInterest(rate: Double, amount: Double) = rate * amount / 100

    def personalloanInterest(rate: Double, amount: Double) = rate * amount / 100

    def calculateInterest(f: (Double, Double) => Double, rate: Double, amount: Double) = {
      f(rate, amount)
    }

    val total_dep_interest = calculateInterest(depositInterest, 4.9, 506800)
    val total_loan_interest = calculateInterest(personalloanInterest, 7, 2000770)

    println(total_dep_interest)
    println(total_loan_interest)

    def getDouble(x: Int): Int = x * x

    def fun(f: Int => Int, args: Range) = {

      args.foreach(
        (element: Int) => f(element)
      )

    }

    fun(getDouble, 2 to 10)

  }

}
