package arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSearchInsert {

    @Test
    public void testSearchInsert1() {
        SearchInsert searchInsert = new SearchInsert();
        int result = searchInsert.searchInsert(new int[]{1, 3, 5, 6}, 5);
        assertEquals(2, result);
    }

    @Test
    public void testSearchInsert2() {
        SearchInsert searchInsert = new SearchInsert();
        int result = searchInsert.searchInsert(new int[]{1, 3, 5, 6}, 2);
        assertEquals(1, result);
    }

    @Test
    public void testSearchInsert3() {
        SearchInsert searchInsert = new SearchInsert();
        int result = searchInsert.searchInsert(new int[]{1, 3, 5, 6}, 7);
        assertEquals(4, result);
    }

    @Test
    public void testSearchInsert4() {
        SearchInsert searchInsert = new SearchInsert();
        int result = searchInsert.searchInsert(new int[]{1, 3, 5, 6}, 0);
        assertEquals(0, result);
    }

    @Test
    public void testSearchInsert5() {
        SearchInsert searchInsert = new SearchInsert();
        int result = searchInsert.searchInsert(new int[]{1}, 0);
        assertEquals(0, result);
    }
}
