import scala.annotation.tailrec

object Main extends App {

  @tailrec def specialMath(n: Int): Int =
    if (n == 0) 0
    else if (n == 1) 1
    else n + specialMath(n-1)	+ specialMath(n-2)
    specialMath(n)

  println(specialMath(7))
}
