package practice.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberReverseTest {

    @Test
    void shouldReverseAThreeDigitNumber() {
        NumberReverse numberReverse = new NumberReverse();
        assertEquals(321, numberReverse.reverseNumber(123));
    }

    @Test
    void shouldReturnZeroForZeroInput() {
        NumberReverse numberReverse = new NumberReverse();
        assertEquals(0, numberReverse.reverseNumber(0));
    }

    @Test
    void shouldReturnZeroForNegativeInput() {
        NumberReverse numberReverse = new NumberReverse();
        assertEquals(0, numberReverse.reverseNumber(-45));
    }

    @Test
    void shouldDropLeadingZerosWhenReversingAtUpperBound() {
        NumberReverse numberReverse = new NumberReverse();
        assertEquals(1, numberReverse.reverseNumber(10000));
    }

    @Test
    void shouldReturnZeroForInputAboveSupportedRange() {
        NumberReverse numberReverse = new NumberReverse();
        assertEquals(0, numberReverse.reverseNumber(99999));
    }
}
