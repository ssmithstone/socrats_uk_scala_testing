package example


import org.junit.Test
import org.junit.Assert._
import org.hamcrest.CoreMatchers._

class SimpleTest extends ATrait {


  @Test
  def assertSomethingIsFalse(){
    assertThat(false,is(false))
  }

}


