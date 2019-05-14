import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class LeapYearTest {

    @Test
    fun `years divisible by 400 are leap years`() {
        val list = listOf(400, 800, 1600, 2000, 3200)
        list.forEach {
            assertThat(it.isLeapYear()).isTrue()
        }
    }
}