package example

import org.junit.Test
import org.junit.Assert._
import org.hamcrest.Matchers._


trait AnAbstractTrait {

  val aString : String

  @Test
  def assertThatStringIsNotEmpty(){
    assertThat(aString, is(not(equalTo(""))))
  }

  @Test
  def assertStringHasLength(){
    assertTrue(aString.length > 0)
  }

}
