package pattern.arrays.twopointers;

import org.junit.jupiter.api.Test;
import pattern.arrays.twopointers.SearchInsert;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInsertTest {

    @Test
    public void testSearchInsert1() {
        SearchInsert searchInsert = new SearchInsert();
        int result = searchInsert.searchInsertUsingBinarySearch(new int[]{1, 3, 5, 6}, 5);
        assertEquals(2, result);
    }

    @Test
    public void testSearchInsert2() {
        SearchInsert searchInsert = new SearchInsert();
        int result = searchInsert.searchInsertUsingBinarySearch(new int[]{1, 3, 5, 6}, 2);
        assertEquals(1, result);
    }

    @Test
    public void testSearchInsert3() {
        SearchInsert searchInsert = new SearchInsert();
        int result = searchInsert.searchInsertUsingBinarySearch(new int[]{1, 3, 5, 6}, 7);
        assertEquals(3, result);
    }

    @Test
    public void testSearchInsert4() {
        SearchInsert searchInsert = new SearchInsert();
        int result = searchInsert.searchInsertUsingBinarySearch(new int[]{1, 3, 5, 6}, 0);
        assertEquals(0, result);
    }

    @Test
    public void testSearchInsert5() {
        SearchInsert searchInsert = new SearchInsert();
        int result = searchInsert.searchInsertUsingBinarySearch(new int[]{1}, 0);
        assertEquals(0, result);
    }
}
