package pattern.priorityqueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KLargestNumbersTest {

    @Test
    public void testFindKLargestNumbersUsingMaxHeap() {
        KLargestNumbers kLargestNumbers = new KLargestNumbers();
        int[] result = kLargestNumbers.findKLargestNumbersUsingMaxHeap(new int[]{3, 1, 5, 12, 2, 11}, 3);
        assertEquals(12, result[0]);
        assertEquals(11, result[1]);
        assertEquals(5, result[2]);
    }

    @Test
    public void testFindKLargestNumbersUsingMaxHeap2() {
        KLargestNumbers kLargestNumbers = new KLargestNumbers();
        int[] result = kLargestNumbers.findKLargestNumbersUsingMaxHeap(new int[]{5, 12, 11, -1, 12}, 3);
        assertEquals(12, result[0]);
        assertEquals(12, result[1]);
        assertEquals(11, result[2]);
    }

    @Test
    public void testFindKLargestNumbers_usingMinHeap() {
        KLargestNumbers kLargestNumbers = new KLargestNumbers();
        int[] result = kLargestNumbers.findKLargestNumbersUsingMinHeap(new int[]{3, 1, 5, 12, 2, 11}, 3);
        assertEquals(5, result[0]);
        assertEquals(11, result[1]);
        assertEquals(12, result[2]);
    }

    @Test
    public void testFindKLargestNumbers_usingSort() {
        KLargestNumbers kLargestNumbers = new KLargestNumbers();
        int[] result = kLargestNumbers.findKLargestNumbersUsingSort(new int[]{3, 1, 5, 12, 2, 11}, 3);
        assertEquals(12, result[0]);
        assertEquals(11, result[1]);
        assertEquals(5, result[2]);
    }

    @Test
    public void testFindKLargestNumbers_usingSort2() {
        KLargestNumbers kLargestNumbers = new KLargestNumbers();
        int[] result = kLargestNumbers.findKLargestNumbersUsingSort(new int[]{5, 12, 11, -1, 12}, 3);
        assertEquals(12, result[0]);
        assertEquals(12, result[1]);
        assertEquals(11, result[2]);
    }

    @Test
    public void testFindKLargestNumbersWhenKEqualsZero() {
        KLargestNumbers kLargestNumbers = new KLargestNumbers();
        int[] input = {3, 1, 5, 12, 2, 11};

        assertEquals(0, kLargestNumbers.findKLargestNumbersUsingMaxHeap(input, 0).length);
        assertEquals(0, kLargestNumbers.findKLargestNumbersUsingMinHeap(input, 0).length);
        assertEquals(0, kLargestNumbers.findKLargestNumbersUsingSort(input, 0).length);
    }

    @Test
    public void testFindKLargestNumbersWhenKEqualsArrayLength() {
        KLargestNumbers kLargestNumbers = new KLargestNumbers();
        int[] input = {3, 1, 5};

        int[] maxHeapResult = kLargestNumbers.findKLargestNumbersUsingMaxHeap(input, 3);
        assertEquals(5, maxHeapResult[0]);
        assertEquals(3, maxHeapResult[1]);
        assertEquals(1, maxHeapResult[2]);

        int[] sortResult = kLargestNumbers.findKLargestNumbersUsingSort(input, 3);
        assertEquals(5, sortResult[0]);
        assertEquals(3, sortResult[1]);
        assertEquals(1, sortResult[2]);
    }

    @Test
    public void testFindKLargestNumbersWhenKGreaterThanArrayLength() {
        KLargestNumbers kLargestNumbers = new KLargestNumbers();
        int[] input = {3, 1, 5};

        int[] maxHeapResult = kLargestNumbers.findKLargestNumbersUsingMaxHeap(input, 5);
        assertEquals(5, maxHeapResult[0]);
        assertEquals(3, maxHeapResult[1]);
        assertEquals(1, maxHeapResult[2]);
        assertEquals(0, maxHeapResult[3]);
        assertEquals(0, maxHeapResult[4]);

        int[] sortResult = kLargestNumbers.findKLargestNumbersUsingSort(input, 5);
        assertEquals(5, sortResult[0]);
        assertEquals(3, sortResult[1]);
        assertEquals(1, sortResult[2]);
        assertEquals(0, sortResult[3]);
        assertEquals(0, sortResult[4]);
    }

    @Test
    public void testFindKLargestNumbersWhenInputArrayIsEmpty() {
        KLargestNumbers kLargestNumbers = new KLargestNumbers();
        int[] input = {};

        assertEquals(0, kLargestNumbers.findKLargestNumbersUsingMaxHeap(input, 0).length);
        assertEquals(3, kLargestNumbers.findKLargestNumbersUsingSort(input, 3).length);
    }
}