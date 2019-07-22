import scala.annotation.tailrec

object Main extends App {

  def specialMath(n: Int): Int = {
    iterator(iterator2(n, 1), 1)
  }

  @tailrec
  private def iterator(x: Int, result1: Int): Int =
    if (x == 0) 0
    else if (x == 1) result1
    else iterator(x - 1, result1 + x)

  @tailrec
  private def iterator2(x: Int, result2: Int): Int =
    if (x == 0) 0
    else if (x == 1) result2
    else iterator2(x - 2, result2 + x)

  println(specialMath(7))
}
