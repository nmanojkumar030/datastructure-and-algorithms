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
}