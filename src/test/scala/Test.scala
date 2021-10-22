import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._

class SampleTest extends TestCase {
    override def setUp = {
        // initialisation of the test
    }

    def testTrivial = {
        assertEquals(true, true)
    }
}