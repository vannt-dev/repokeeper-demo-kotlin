import kotlin.test.Test
import kotlin.test.assertEquals

class GreeterTest {
    @Test
    fun greetsByName() {
        assertEquals("Hello, Ada!", greet("Ada"))
    }

    @Test
    fun ignoresSpacesAroundTheName() {
        assertEquals("Hello, Ada!", greet("  Ada "))
    }
}
