package spanningsubstring

object Main {

  def main(args: Array[String]): Unit = {
    val goal = args(0)
    val pat = args(1)
    val (pos, len) = Strings.span(goal.toSet, pat)
    println("goal = " + goal)
    println("pattern = " + pat)
    println("Shortest span = [" + pat.substring(pos, pos + len) + "]")
  }
}
