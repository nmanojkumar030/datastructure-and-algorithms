package pattern.arrays.twopointers;

import org.junit.jupiter.api.Test;
import pattern.arrays.twopointers.SortColors;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortColorsTest {

    @Test
    public void testSortColors1() throws Exception {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        SortColors sortColors = new SortColors();
        sortColors.sortColorsUsingPriorityQueue(nums);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    @Test
    public void testSortColors2() throws Exception {
        int[] nums = new int[]{2, 0, 1};
        SortColors sortColors = new SortColors();
        sortColors.sortColorsUsingPriorityQueue(nums);
        assertArrayEquals(new int[]{0, 1, 2}, nums);
    }

    @Test
    public void testSortColors3() throws Exception {
        int[] nums = new int[]{0};
        SortColors sortColors = new SortColors();
        sortColors.sortColorsUsingPriorityQueue(nums);
        assertArrayEquals(new int[]{0}, nums);
    }

    @Test
    public void testSortColors4() throws Exception {
        int[] nums = new int[]{1};
        SortColors sortColors = new SortColors();
        sortColors.sortColorsUsingPriorityQueue(nums);
        assertArrayEquals(new int[]{1}, nums);
    }

    @Test
    public void testSortColorsUsingTreeMap() throws Exception {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        SortColors sortColors = new SortColors();
        sortColors.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    @Test
    public void testSortColorsUsingTreeMapWithEmptyArray() throws Exception {
        int[] nums = new int[]{};
        SortColors sortColors = new SortColors();
        sortColors.sortColors(nums);
        assertArrayEquals(new int[]{}, nums);
    }

    @Test
    public void testSortColorsUsingStreams() throws Exception {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        SortColors sortColors = new SortColors();
        sortColors.sortColorsUsingStreams(nums);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    @Test
    public void testSortColorsUsingStreamsWithSingleColor() throws Exception {
        int[] nums = new int[]{2, 2, 2};
        SortColors sortColors = new SortColors();
        sortColors.sortColorsUsingStreams(nums);
        assertArrayEquals(new int[]{2, 2, 2}, nums);
    }

}
