package pattern.priorityqueues;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class KSmallestNumbersTest {

    @Test
    public void testFindKSmallestNumbersUsingMaxHeap() {
        int[] actual = KSmallestNumbers.findKSmallestNumbersUsingMaxHeap(new int[]{3, 1, 5, 12, 2, 11}, 3);
        assertArrayEquals(new int[]{3, 2, 1}, actual);
    }

    @Test
    public void testFindKSmallestNumbersUsingMinHeap() {
        int[] actual = KSmallestNumbers.findKSmallestNumbersUsingMinHeap(new int[]{3, 1, 5, 12, 2, 11}, 3);
        assertArrayEquals(new int[]{1, 2, 3}, actual);
    }

    @Test
    public void testWithDuplicates() {
        int[] input = new int[]{5, 12, 11, 12, 11};
        int[] minActual = KSmallestNumbers.findKSmallestNumbersUsingMinHeap(input, 3);
        assertArrayEquals(new int[]{5, 11, 11}, minActual);

        int[] maxActual = KSmallestNumbers.findKSmallestNumbersUsingMaxHeap(input, 3);
        assertArrayEquals(new int[]{11, 11, 5}, maxActual);
    }

    @Test
    public void testKEqualsArrayLength() {
        int[] input = new int[]{3, 1, 5};
        int k = 3;

        int[] minActual = KSmallestNumbers.findKSmallestNumbersUsingMinHeap(input, k);
        assertArrayEquals(new int[]{1, 3, 5}, minActual);

        int[] maxActual = KSmallestNumbers.findKSmallestNumbersUsingMaxHeap(input, k);
        assertArrayEquals(new int[]{5, 3, 1}, maxActual);
    }

    @Test
    public void testKZero() {
        int[] input = new int[]{4, 2, 9};
        int[] minActual = KSmallestNumbers.findKSmallestNumbersUsingMinHeap(input, 0);
        assertEquals(0, minActual.length);

        int[] maxActual = KSmallestNumbers.findKSmallestNumbersUsingMaxHeap(input, 0);
        assertEquals(0, maxActual.length);
    }

    @Test
    public void testKGreaterThanArrayLength() {
        int[] input = new int[]{2, 1};
        int k = 5;

        int[] minActual = KSmallestNumbers.findKSmallestNumbersUsingMinHeap(input, k);
        assertEquals(k, minActual.length);
        assertArrayEquals(new int[]{1, 2}, Arrays.copyOf(minActual, input.length));

        int[] maxActual = KSmallestNumbers.findKSmallestNumbersUsingMaxHeap(input, k);
        assertEquals(k, maxActual.length);
        assertArrayEquals(new int[]{2, 1}, Arrays.copyOf(maxActual, input.length));
    }

    @Test
    public void testSingleElement() {
        int[] input = new int[]{7};
        int[] minActual = KSmallestNumbers.findKSmallestNumbersUsingMinHeap(input, 1);
        assertArrayEquals(new int[]{7}, minActual);

        int[] maxActual = KSmallestNumbers.findKSmallestNumbersUsingMaxHeap(input, 1);
        assertArrayEquals(new int[]{7}, maxActual);
    }

    @Test
    public void testNegativeKThrows() {
        int[] input = new int[]{1, 2, 3};
        assertThrows(NegativeArraySizeException.class, () -> KSmallestNumbers.findKSmallestNumbersUsingMinHeap(input, -1));
        assertThrows(NegativeArraySizeException.class, () -> KSmallestNumbers.findKSmallestNumbersUsingMaxHeap(input, -2));
    }
}

