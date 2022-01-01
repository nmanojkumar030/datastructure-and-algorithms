package manoj.arrays;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertTest {

    @Test
    public void testSearchInsert1() {
        SearchInsert searchInsert = new SearchInsert();
        int result = searchInsert.searchInsert(new int[]{1, 3, 5, 6}, 5);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testSearchInsert2() {
        SearchInsert searchInsert = new SearchInsert();
        int result = searchInsert.searchInsert(new int[]{1, 3, 5, 6}, 2);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testSearchInsert3() {
        SearchInsert searchInsert = new SearchInsert();
        int result = searchInsert.searchInsert(new int[]{1, 3, 5, 6}, 7);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testSearchInsert4() {
        SearchInsert searchInsert = new SearchInsert();
        int result = searchInsert.searchInsert(new int[]{1, 3, 5, 6}, 0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSearchInsert5() {
        SearchInsert searchInsert = new SearchInsert();
        int result = searchInsert.searchInsert(new int[]{1}, 0);
        Assert.assertEquals(0, result);
    }
}
