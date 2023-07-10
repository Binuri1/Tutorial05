package Tutorial5

import scala.io.StdIn

object Q06 {

  def printFibonacci(n: Int): Unit = {
    if (n > 0) {
      printFibonacci(n - 1)
      print(fibonacci(n - 1) + " ")
    }
  }

  def fibonacci(n: Int): Int = {
    if (n <= 1)
      n
    else
      fibonacci(n - 1) + fibonacci(n - 2)
  }

  def main(args: Array[String]):Unit= {
    val number = StdIn.readInt();

    printFibonacci(number);

  }

  }