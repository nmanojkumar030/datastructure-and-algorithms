package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortColorsTest {

    @Test
    public void testSortColors1() throws Exception {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        SortColors sortColors = new SortColors();
        sortColors.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    @Test
    public void testSortColors2() throws Exception {
        int[] nums = new int[]{2, 0, 1};
        SortColors sortColors = new SortColors();
        sortColors.sortColors(nums);
        assertArrayEquals(new int[]{0, 1, 2}, nums);
    }

    @Test
    public void testSortColors3() throws Exception {
        int[] nums = new int[]{0};
        SortColors sortColors = new SortColors();
        sortColors.sortColors(nums);
        assertArrayEquals(new int[]{0}, nums);
    }

    @Test
    public void testSortColors4() throws Exception {
        int[] nums = new int[]{1};
        SortColors sortColors = new SortColors();
        sortColors.sortColors(nums);
        assertArrayEquals(new int[]{1}, nums);
    }

}
