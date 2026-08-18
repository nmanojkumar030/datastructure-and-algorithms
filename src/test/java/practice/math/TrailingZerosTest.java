package practice.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrailingZerosTest {

    @Test
    void shouldComputeFactorial() {
        assertEquals(1, TrailingZeros.factorial(1));
        assertEquals(120, TrailingZeros.factorial(5));
        assertEquals(3628800, TrailingZeros.factorial(10));
    }

    @Test
    void shouldComputeFactorialOfZeroAsOne() {
        assertEquals(1, TrailingZeros.factorial(0));
    }

    @Test
    void shouldCountTrailingZerosOfFiveFactorial() {
        assertEquals(1, TrailingZeros.countTrailingZeros(TrailingZeros.factorial(5)));
    }

    @Test
    void shouldCountTrailingZerosOfTenFactorial() {
        assertEquals(2, TrailingZeros.countTrailingZeros(TrailingZeros.factorial(10)));
    }

    @Test
    void shouldCountTrailingZerosOfTwentyFactorial() {
        assertEquals(4, TrailingZeros.countTrailingZeros(TrailingZeros.factorial(20)));
    }

    @Test
    void shouldCountAllDigitsWhenValueEndsInMultipleZeros() {
        assertEquals(2, TrailingZeros.countTrailingZeros(100L));
    }

    @Test
    void shouldReturnZeroWhenValueHasNoTrailingZeros() {
        assertEquals(0, TrailingZeros.countTrailingZeros(123L));
    }

    @Test
    void shouldReturnZeroForZeroValue() {
        assertEquals(0, TrailingZeros.countTrailingZeros(0L));
    }
}
