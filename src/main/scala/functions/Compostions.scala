package functions

object Compostions {
  /**
   * It is a process of composing in which a function
   * represents the application of two composed functions.
   */
  def code = {

    def depositInterest(rate: Double, amount: Double) = rate * amount / 100

    def personalloanInterest(rate: Double, amount: Double) = rate * amount / 100

    val total_income = 555000
    val loan_amount = 35000

    val balance = depositInterest(
      rate = 4.9,
      amount = total_income - personalloanInterest(14.46, loan_amount))

    println(balance)


  }

}
