package arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBinarySearch {

    @Test
    public void testBinarySearch_emptyArray() {
        BinarySearch binarySearch = new BinarySearch();
        int[] inputArray = new int[]{};
        int searchElement = 10;
        int result = binarySearch.search(inputArray, searchElement);
        assertEquals(-1, result);
    }

    @Test
    public void testBinarySearch_nullArray() {
        BinarySearch binarySearch = new BinarySearch();
        int[] inputArray = null;
        int searchElement = 10;
        int result = binarySearch.search(inputArray, searchElement);
        assertEquals(-1, result);
    }

    @Test
    public void testBinarySearch_ascendingOrder() {
        BinarySearch binarySearch = new BinarySearch();
        int[] inputArray = new int[]{4, 6, 10};
        int searchElement = 10;
        int result = binarySearch.search(inputArray, searchElement);
        assertEquals(2, result);
    }

    @Test
    public void testBinarySearch_descendingOrder() {
        BinarySearch binarySearch = new BinarySearch();
        int[] inputArray = new int[]{10, 6, 4};
        int searchElement = 10;
        int result = binarySearch.search(inputArray, searchElement);
        assertEquals(0, result);
    }
}