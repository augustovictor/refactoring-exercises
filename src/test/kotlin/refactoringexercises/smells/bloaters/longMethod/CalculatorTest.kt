package refactoringexercises.smells.bloaters.longMethod

import org.junit.Assert.assertEquals
import org.junit.Test
import refactoringexercises.smells.bloaters.longMethod.Calculator

class CalculatorTest {
    private val calculator = Calculator()

    @Test
    fun `first month first day`() {
        val result = calculator.calculateTotalAmount(100.0, 0.0, 1, 1)
        assertEquals(105.0, result, 0.0)
    }

    @Test
    fun `second month first day`() {
        val result = calculator.calculateTotalAmount(100.0, 0.0, 2, 1)
        assertEquals(105.0, result, 0.0)
    }

    @Test
    fun `second month second day`() {
        val result = calculator.calculateTotalAmount(100.0, 0.0, 2, 2)
        assertEquals(102.0, result, 0.0)
    }

    @Test
    fun `third month second day`() {
        val result = calculator.calculateTotalAmount(100.0, 0.0, 3, 2)
        assertEquals(101.0, result, 0.0)
    }

    @Test
    fun `second month 25th day`() {
        val result = calculator.calculateTotalAmount(100.0, 0.0, 2, 25)
        assertEquals(92.0, result, 0.0)
    }

    @Test
    fun `second month 30th day`() {
        val result = calculator.calculateTotalAmount(100.0, 0.0, 2, 30)
        assertEquals(82.0, result, 0.0)
    }
}