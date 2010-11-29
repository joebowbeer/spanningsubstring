package spanningsubstring

object Main {

  def main(args: Array[String]): Unit = {
    val goal = args(0)
    val pat = args(1)
    val (pos, len) = Iterables.span(pat, goal.toSet)
    println("goal = " + goal)
    println("pattern = " + pat)
    println("Shortest span = [" + pat.substring(pos, pos + len) + "]")
  }
}
