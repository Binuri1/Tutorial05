package Tutorial5

object Q01 {

    def GCD(x:Int, y:Int): Int = y match
    {
      case 0 => x
      case a if a>x => GCD(a,x)
      case _ => GCD(y, x%y)
    }

    def prime(p:Int, n:Int=2): Boolean = n match
    {
      case x if (x==p) => true
      case x if (GCD(p, x)>1) => false
      case x => prime(p, x+1)
    }

    def main(args: Array[String]) {


      print("Is 5 a prime number: " + prime(5));
      print("\nIs 8 a prime number: " + prime(8));
    }


}