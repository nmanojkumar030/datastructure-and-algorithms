package pattern.arrays.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayPartitionTest {

    @Test
    void shouldMaximizeSumOfMinimumsForFourElements() {
        ArrayPartition arrayPartition = new ArrayPartition();
        assertEquals(4, arrayPartition.arrayPairSum(new int[]{1, 4, 3, 2}));
    }

    @Test
    void shouldMaximizeSumOfMinimumsWithDuplicates() {
        ArrayPartition arrayPartition = new ArrayPartition();
        assertEquals(9, arrayPartition.arrayPairSum(new int[]{6, 2, 6, 5, 1, 2}));
    }

    @Test
    void shouldReturnZeroForEmptyArray() {
        ArrayPartition arrayPartition = new ArrayPartition();
        assertEquals(0, arrayPartition.arrayPairSum(new int[]{}));
    }

    @Test
    void shouldReturnZeroForNullArray() {
        ArrayPartition arrayPartition = new ArrayPartition();
        assertEquals(0, arrayPartition.arrayPairSum(null));
    }

    @Test
    void shouldReturnSingleElementSumForTwoElementArray() {
        ArrayPartition arrayPartition = new ArrayPartition();
        assertEquals(1, arrayPartition.arrayPairSum(new int[]{1, 2}));
    }
}
