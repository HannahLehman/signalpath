import scala.annotation.tailrec

object Main extends App {

  def specialMath(n: Int): Int = {
      n + iterator(n, 1)
  }

  @tailrec
  private def iterator(x: Int, result1: Int): Int = {
    if (x == 0) 0
    else if (x == 1) result1
    else iterator(x - 1, result1 + x)
  }

  println(specialMath(7))
}
