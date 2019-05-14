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

    @Test
    fun `years divisible by 4 but not by 100 are leap years`() {
        val list = listOf(2008, 2012, 2016, 404, 360, 2064)
        list.forEach {
            assertThat(it.isLeapYear()).isTrue()
        }
    }

    @Test
    fun `years not divisible by 4 are not leap years`() {
        val list = listOf(2017, 2018, 2019, 402, 361, 2066)
        list.forEach {
            assertThat(it.isLeapYear()).isFalse()
        }
    }

    @Test
    fun `years divisible by 4000 are not leap years`() {
        val list = listOf(4000, 8000, 12000, 16000)
        list.forEach {
            assertThat(it.isLeapYear()).isFalse()
        }
    }

}