package practice.arrays;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NextGreatestNumberTest {

    @Test
    void shouldFindNextGreatestNumberForEachElementUsingNestedLoops() {
        Integer[] integers = {3, 4, 5, 2, 6, 8};
        Map<Integer, Integer> result = NextGreatestNumber.findNextGreatestNumbersWithNestedLoops(integers);
        assertEquals(Map.of(3, 4, 4, 5, 5, 6, 2, 6, 6, 8, 8, -1), result);
    }

    @Test
    void shouldFindNextGreatestNumberForEachElementUsingStack() {
        Integer[] integers = {3, 4, 5, 2, 6, 8};
        Map<Integer, Integer> result = NextGreatestNumber.findNextGreatestNumbersWithStack(integers);
        assertEquals(Map.of(3, 4, 4, 5, 5, 6, 2, 6, 6, 8, 8, -1), result);
    }

    @Test
    void shouldReturnMinusOneForDescendingRunUsingNestedLoops() {
        Integer[] integers = {8, 7, 9};
        Map<Integer, Integer> result = NextGreatestNumber.findNextGreatestNumbersWithNestedLoops(integers);
        assertEquals(Map.of(8, 9, 7, 9, 9, -1), result);
    }

    @Test
    void shouldReturnMinusOneForDescendingRunUsingStack() {
        Integer[] integers = {8, 7, 9};
        Map<Integer, Integer> result = NextGreatestNumber.findNextGreatestNumbersWithStack(integers);
        assertEquals(Map.of(8, 9, 7, 9, 9, -1), result);
    }

    @Test
    void shouldReturnMinusOneForSingleElementArray() {
        Integer[] integers = {5};
        assertEquals(Map.of(5, -1), NextGreatestNumber.findNextGreatestNumbersWithNestedLoops(integers));
        assertEquals(Map.of(5, -1), NextGreatestNumber.findNextGreatestNumbersWithStack(integers));
    }
}
