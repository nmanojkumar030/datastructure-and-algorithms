package practice.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecondSmallestNumberTest {

    private static final int[] INPUT = {4, 2, 1, 3, 5};

    @Test
    void shouldReturnSecondSmallestNumber() {
        assertEquals(2, SecondSmallestNumber.findSecondSmallestNumber(INPUT));
        assertEquals(2, SecondSmallestNumber.findSecondSmallestNumberWithSorting(INPUT));
        assertEquals(2, SecondSmallestNumber.findSecondSmallestNumberWithHeap(INPUT));
    }

    @Test
    void shouldReturnMinusOneWhenAllElementsAreEqualUsingManualMethod() {
        // findSecondSmallestNumber treats "second smallest" as the second *distinct* value.
        int[] input = {7, 7, 7};
        assertEquals(-1, SecondSmallestNumber.findSecondSmallestNumber(input));
    }

    @Test
    void shouldReturnTheDuplicateValueWhenAllElementsAreEqualUsingSortingAndHeap() {
        // findSecondSmallestNumberWithSorting/Heap take the second element positionally,
        // so duplicates are not deduped the way the manual method dedupes them.
        int[] input = {7, 7, 7};
        assertEquals(7, SecondSmallestNumber.findSecondSmallestNumberWithSorting(input));
        assertEquals(7, SecondSmallestNumber.findSecondSmallestNumberWithHeap(input));
    }

    @Test
    void shouldReturnMinusOneWhenArrayHasSingleElement() {
        int[] input = {7};
        assertEquals(-1, SecondSmallestNumber.findSecondSmallestNumber(input));
        assertEquals(-1, SecondSmallestNumber.findSecondSmallestNumberWithSorting(input));
        assertEquals(-1, SecondSmallestNumber.findSecondSmallestNumberWithHeap(input));
    }

    @Test
    void shouldReturnMinusOneWhenArrayIsEmpty() {
        int[] input = {};
        assertEquals(-1, SecondSmallestNumber.findSecondSmallestNumber(input));
        assertEquals(-1, SecondSmallestNumber.findSecondSmallestNumberWithSorting(input));
        assertEquals(-1, SecondSmallestNumber.findSecondSmallestNumberWithHeap(input));
    }
}
