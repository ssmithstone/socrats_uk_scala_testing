package example


import org.junit.Test
import org.junit.Assert._
import org.hamcrest.CoreMatchers._

class SimpleTest extends ATrait with AnAbstractTrait {


  @Test
  def assertSomethingIsFalse(){
    assertThat(false,is(false))
  }

  val aString: String = "Simple String"
}


