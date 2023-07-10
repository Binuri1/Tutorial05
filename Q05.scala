package Tutorial5

import scala.io.StdIn

object Q05 {

  def sumEven(n: Int): Int = {
    if (n <= 0)
      0
    else if (n % 2 == 0)
      n + sumEven(n - 2)
    else
      sumEven(n - 1)
  }

  def main(args: Array[String]):Unit={
    val number = StdIn.readInt();

    println(s"Sum of even numbers less than $number is  ${sumEven(number - 1)}");


  }

}