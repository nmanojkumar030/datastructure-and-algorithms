package pattern.binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderAgnosticBinarySearchTest {

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

    @Test
    public void testBinarySearch_ascendingOrder_notFound() {
        OrderAgnosticBinarySearch orderAgnosticBinarySearch = new OrderAgnosticBinarySearch();
        int[] inputArray = new int[]{4, 6, 10};
        int result = orderAgnosticBinarySearch.search(inputArray, 7);
        assertEquals(-1, result);
    }

    @Test
    public void testBinarySearch_descendingOrder_notFound() {
        OrderAgnosticBinarySearch orderAgnosticBinarySearch = new OrderAgnosticBinarySearch();
        int[] inputArray = new int[]{10, 6, 4};
        int result = orderAgnosticBinarySearch.search(inputArray, 7);
        assertEquals(-1, result);
    }

    @Test
    public void testBinarySearch_singleElementArray() {
        OrderAgnosticBinarySearch orderAgnosticBinarySearch = new OrderAgnosticBinarySearch();
        int[] inputArray = new int[]{5};
        assertEquals(0, orderAgnosticBinarySearch.search(inputArray, 5));
        assertEquals(-1, orderAgnosticBinarySearch.search(inputArray, 9));
    }

    @Test
    public void testBinarySearch_duplicateValues() {
        OrderAgnosticBinarySearch orderAgnosticBinarySearch = new OrderAgnosticBinarySearch();
        int[] inputArray = new int[]{2, 4, 4, 4, 7};
        int result = orderAgnosticBinarySearch.search(inputArray, 4);
        assertEquals(4, inputArray[result]);
    }

    @Test
    public void testBinarySearch_descendingOrder_middleElement() {
        OrderAgnosticBinarySearch orderAgnosticBinarySearch = new OrderAgnosticBinarySearch();
        int[] inputArray = new int[]{10, 6, 4};
        int result = orderAgnosticBinarySearch.search(inputArray, 6);
        assertEquals(1, result);
    }
}
