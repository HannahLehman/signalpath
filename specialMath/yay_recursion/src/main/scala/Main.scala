import scala.annotation.tailrec

object Main extends App {

  def specialMath(n: Int): Int = {
    @tailrec
    def iterator1(x: Int, result1: Int): Int =
      if (x == 0) 0
      else if (x == 1) result1
      else iterator1(x - 1, result1 + x)

    iterator1(n, 1)
  }

  println(specialMath(7))
}
