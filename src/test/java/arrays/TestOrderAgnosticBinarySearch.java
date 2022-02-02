package arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestOrderAgnosticBinarySearch {

    @Test
    public void testBinarySearch_emptyArray() {
        OrderAgnosticBinarySearch orderAgnosticBinarySearch = new OrderAgnosticBinarySearch();
        int[] inputArray = new int[]{};
        int searchElement = 10;
        int result = orderAgnosticBinarySearch.search(inputArray, searchElement);
        assertEquals(-1, result);
    }

    @Test
    public void testBinarySearch_nullArray() {
        OrderAgnosticBinarySearch orderAgnosticBinarySearch = new OrderAgnosticBinarySearch();
        int[] inputArray = null;
        int searchElement = 10;
        int result = orderAgnosticBinarySearch.search(inputArray, searchElement);
        assertEquals(-1, result);
    }

    @Test
    public void testBinarySearch_ascendingOrder() {
        OrderAgnosticBinarySearch orderAgnosticBinarySearch = new OrderAgnosticBinarySearch();
        int[] inputArray = new int[]{4, 6, 10};
        int searchElement = 10;
        int result = orderAgnosticBinarySearch.search(inputArray, searchElement);
        assertEquals(2, result);
    }

    @Test
    public void testBinarySearch_descendingOrder() {
        OrderAgnosticBinarySearch orderAgnosticBinarySearch = new OrderAgnosticBinarySearch();
        int[] inputArray = new int[]{10, 6, 4};
        int searchElement = 10;
        int result = orderAgnosticBinarySearch.search(inputArray, searchElement);
        assertEquals(0, result);
    }
}