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

    @Test
    fun `years divisible by 100 but not by 400 are not leap years`() {
        val list = listOf(300, 500, 1700, 1800, 1900, 2100)
        list.forEach {
            assertThat(it.isLeapYear()).isFalse()
        }
    }

}