package practice.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MaxCurrencyValueTest {

    @Test
    public void shouldReturnMaxValue() {
        List<Double> currencyList = Arrays.asList(12.5, 99.0, 3.75, 45.2);

        MaxCurrencyValue maxCurrencyValue = new MaxCurrencyValue();
        assertEquals(99.0, maxCurrencyValue.findMax(currencyList));
    }

    @Test
    public void shouldReturnSingleValueWhenOnlyOneElement() {
        List<Double> currencyList = List.of(7.25);

        MaxCurrencyValue maxCurrencyValue = new MaxCurrencyValue();
        assertEquals(7.25, maxCurrencyValue.findMax(currencyList));
    }

    @Test
    public void shouldThrowExceptionWhenListIsEmpty() {
        MaxCurrencyValue maxCurrencyValue = new MaxCurrencyValue();
        assertThrows(IllegalArgumentException.class, () -> maxCurrencyValue.findMax(List.of()));
    }

    @Test
    public void shouldThrowExceptionWhenListIsNull() {
        MaxCurrencyValue maxCurrencyValue = new MaxCurrencyValue();
        assertThrows(NullPointerException.class, () -> maxCurrencyValue.findMax(null));
    }

    @Test
    public void shouldReturnTheTiedMaxValueWhenDuplicateMaxExists() {
        List<Double> currencyList = Arrays.asList(50.0, 99.0, 99.0, 20.0);

        MaxCurrencyValue maxCurrencyValue = new MaxCurrencyValue();
        assertEquals(99.0, maxCurrencyValue.findMax(currencyList));
    }

    @Test
    public void shouldReturnMaxValueWhenAllValuesAreNegative() {
        List<Double> currencyList = Arrays.asList(-12.5, -3.75, -45.2);

        MaxCurrencyValue maxCurrencyValue = new MaxCurrencyValue();
        assertEquals(-3.75, maxCurrencyValue.findMax(currencyList));
    }
}