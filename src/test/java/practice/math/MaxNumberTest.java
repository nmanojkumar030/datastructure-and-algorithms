package practice.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxNumberTest {

    @Test
    void shouldReturnFirstDigitOfMultiDigitNumber() {
        assertEquals(9, MaxNumber.returnNthDigit(948));
        assertEquals(5, MaxNumber.returnNthDigit(560));
        assertEquals(7, MaxNumber.returnNthDigit(700));
    }

    @Test
    void shouldReturnSameValueForSingleDigitNumber() {
        assertEquals(5, MaxNumber.returnNthDigit(5));
    }

    @Test
    void shouldReturnUnchangedValueForTwoDigitNumberAtBoundary() {
        assertEquals(10, MaxNumber.returnNthDigit(10));
    }

    @Test
    void shouldReturnZeroForZeroInput() {
        assertEquals(0, MaxNumber.returnNthDigit(0));
    }
}
