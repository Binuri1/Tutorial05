package Tutorial5

import scala.io.StdIn

object Q04 {

  def isEven(n: Int): Boolean = {
    if (n == 0)
      true
    else if (n == 1)
      false
    else if (n < 0)
      isEven(-n)
    else
      isEven(n - 2)
  }


  def main(args: Array[String]):Unit={
    val number1 = StdIn.readInt();

    println(s"$number1 is even: ${isEven(number1)}")

  }
}