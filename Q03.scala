package Tutorial5

import scala.io.StdIn
object Q03 {
  def sum(n: Int): Int = {
    if (n == 1)
      1
    else
      n + sum(n - 1)
  }

  def main(args: Array[String]):Unit={
    val number = StdIn.readInt();
    println(sum(number));
  }
}