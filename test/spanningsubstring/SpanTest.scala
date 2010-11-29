package spanningsubstring

import org.junit._
import org.junit.Assert._

class SpanTest {

  @Before
  def setUp: Unit = {
  }

  @After
  def tearDown: Unit = {
  }

  @Test
  def emptyPat = {
    assertEquals((0,0), span("", "A"))
  }

  @Test
  def emptyGoal = {
    assertEquals((0,0), span("A", ""))
  }

  @Test
  def abcde = {
    assertEquals((0,5), span("ABCDEFG", "BEAD"))
  }

  @Test
  def cybxa = {
    assertEquals((1,5), span("ZCYBXAW", "ABC"))
  }

  @Test
  def numeric = {
    assertEquals((0,6), span(List(1,2,3,4,5,6), List(6,1)))
  }

  def span[E](pat: Iterable[E], goal: Iterable[E]): (Int,Int) = {
    Iterables.span(pat, goal.toSet)
  }
}
