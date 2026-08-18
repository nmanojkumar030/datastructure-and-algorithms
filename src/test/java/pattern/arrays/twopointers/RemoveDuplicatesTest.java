package pattern.arrays.twopointers;

import org.junit.jupiter.api.Test;
import pattern.arrays.twopointers.RemoveDuplicates;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates1() {
        int[] nums = new int[]{1, 1, 2};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        assertEquals(2, removeDuplicates.remove(nums));
    }

    @Test
    public void testRemoveDuplicates2() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        assertEquals(5, removeDuplicates.remove(nums));
    }

    @Test
    public void testRemoveDuplicates3() {
        int[] nums = new int[]{1, 1, 2};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        assertEquals(2, removeDuplicates.removeDuplicatesFromSortedArrayUsingSet(nums));
    }

    @Test
    public void testRemoveDuplicates4() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        assertEquals(5, removeDuplicates.removeDuplicatesFromSortedArrayUsingSet(nums));
    }

    @Test
    public void testRemoveDuplicates5() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        assertEquals(5, removeDuplicates.removeDuplicatesFromSortedArray(nums));
    }

    @Test
    public void testRemoveDuplicatesFromSortedArrayReturnsMinusOneForEmptyArray() {
        int[] nums = new int[]{};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        assertEquals(-1, removeDuplicates.removeDuplicatesFromSortedArray(nums));
    }

    @Test
    public void testRemoveDuplicatesFromSortedArrayReturnsMinusOneForNullArray() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        assertEquals(-1, removeDuplicates.removeDuplicatesFromSortedArray(null));
    }

    @Test
    public void testRemoveDuplicatesFromSortedArrayWithSingleElement() {
        int[] nums = new int[]{5};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        assertEquals(1, removeDuplicates.removeDuplicatesFromSortedArray(nums));
    }

    @Test
    public void testRemoveDuplicatesFromSortedArrayWithAllDuplicates() {
        int[] nums = new int[]{2, 2, 2};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        assertEquals(1, removeDuplicates.removeDuplicatesFromSortedArray(nums));
    }

    @Test
    public void testRemoveWithSingleElement() {
        int[] nums = new int[]{5};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        assertEquals(1, removeDuplicates.remove(nums));
    }

    @Test
    public void testRemoveWithAllDuplicates() {
        int[] nums = new int[]{2, 2, 2};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        assertEquals(1, removeDuplicates.remove(nums));
    }
}
