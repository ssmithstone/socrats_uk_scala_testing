package example

import org.junit.Test
import org.junit.Assert._
import org.hamcrest.CoreMatchers._

trait ATrait {


   @Test
    def assertThatSomethingIsTrue() {
     assertThat(true, is(true))

   }

 }
