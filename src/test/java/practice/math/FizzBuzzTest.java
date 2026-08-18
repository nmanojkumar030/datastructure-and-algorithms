package practice.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    void shouldReturnFizzForMultiplesOfThree() {
        assertEquals("Fizz", FizzBuzz.fizzBuzzValue(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzzValue(9));
    }

    @Test
    void shouldReturnBuzzForMultiplesOfFive() {
        assertEquals("Buzz", FizzBuzz.fizzBuzzValue(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzzValue(10));
    }

    @Test
    void shouldReturnFizzBuzzForMultiplesOfThreeAndFive() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzzValue(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzzValue(30));
    }

    @Test
    void shouldReturnNumberAsStringWhenNotMultipleOfThreeOrFive() {
        assertEquals("1", FizzBuzz.fizzBuzzValue(1));
        assertEquals("7", FizzBuzz.fizzBuzzValue(7));
    }
}
