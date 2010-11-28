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
  def abcde = {
    assertEquals((0,5), span("BEAD", "ABCDEFG"))
  }

  @Test
  def cybxa = {
    assertEquals((1,5), span("ABC", "ZCYBXAW"))
  }

  def span(goal: String, pat: String): (Int,Int) = {
    Strings.span(goal.toSet, pat)
  }
}
