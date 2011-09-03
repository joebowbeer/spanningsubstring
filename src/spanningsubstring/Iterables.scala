package spanningsubstring

import scala.collection.mutable.LinkedHashMap

object Iterables {

  /**
   * Given a sequence of elements and a set of elements, finds the shortest
   * subsequence containing all the elements in the set.
   * <p>
   * For example, "CYBXA" is the shortest substring of "ZCYBXAW" that
   * contains the characters of "ABC".
   */
  def span[E](pat: Iterable[E], goal: Set[E]): (Int,Int) = {
    var pos = 0
    var len = 0
    val map = LinkedHashMap[E,Int]()
    pat.view.zipWithIndex.filter(p => goal(p._1)).foreach { p =>
      // append next E->index to linked map
      (map -= p._1) += p
      // if we have a shorter span, record it
      val newlen = map.last._2 - map.head._2 + 1
      if (map.size == goal.size && (len == 0 || newlen < len)) {
        pos = map.head._2;
        len = newlen
      }
    }
    return (pos, len)
  }
}
