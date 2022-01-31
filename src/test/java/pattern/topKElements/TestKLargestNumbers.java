package pattern.topKElements;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestKLargestNumbers {

    @Test
    public void testFindKLargestNumbers() {
        KLargestNumbers kLargestNumbers = new KLargestNumbers();
        int[] result = kLargestNumbers.findKLargestNumbers(new int[]{3, 1, 5, 12, 2, 11}, 3);
        assertEquals(12, result[0]);
        assertEquals(11, result[1]);
        assertEquals(5, result[2]);
    }

    @Test
    public void testFindKLargestNumbers2() {
        KLargestNumbers kLargestNumbers = new KLargestNumbers();
        int[] result = kLargestNumbers.findKLargestNumbers(new int[]{5, 12, 11, -1, 12}, 3);
        assertEquals(12, result[0]);
        assertEquals(12, result[1]);
        assertEquals(11, result[2]);
    }

    @Test
    public void testFindKLargestNumbers_usingMinHeap() {
        KLargestNumbers kLargestNumbers = new KLargestNumbers();
        int[] result = kLargestNumbers.findKLargestNumbers_usingMinHeap(new int[]{3, 1, 5, 12, 2, 11}, 3);
        assertEquals(5, result[0]);
        assertEquals(12, result[1]);
        assertEquals(11, result[2]);
    }

    @Test
    public void testFindKLargestNumbers_usingSort() {
        KLargestNumbers kLargestNumbers = new KLargestNumbers();
        int[] result = kLargestNumbers.findKLargestNumbers_usingSort(new int[]{3, 1, 5, 12, 2, 11}, 3);
        assertEquals(12, result[0]);
        assertEquals(11, result[1]);
        assertEquals(5, result[2]);
    }

    @Test
    public void testFindKLargestNumbers_usingSort2() {
        KLargestNumbers kLargestNumbers = new KLargestNumbers();
        int[] result = kLargestNumbers.findKLargestNumbers_usingSort(new int[]{5, 12, 11, -1, 12}, 3);
        assertEquals(12, result[0]);
        assertEquals(12, result[1]);
        assertEquals(11, result[2]);
    }
}