package pattern.arrays.twopointers;

import org.junit.jupiter.api.Test;
import pattern.arrays.twopointers.MergeSortedArray;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArrayTest {

    @Test
    void testMerge() {
        MergeSortedArray msa = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        msa.merge(nums1, 3, nums2, 3);

        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    void testMergeWhenSecondArrayIsEmpty() {
        MergeSortedArray msa = new MergeSortedArray();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {};
        msa.merge(nums1, 3, nums2, 0);

        assertArrayEquals(new int[]{1, 2, 3}, nums1);
    }

    @Test
    void testMergeWhenFirstArrayIsEmpty() {
        MergeSortedArray msa = new MergeSortedArray();
        int[] nums1 = {0, 0, 0};
        int[] nums2 = {2, 5, 6};
        msa.merge(nums1, 0, nums2, 3);

        assertArrayEquals(new int[]{2, 5, 6}, nums1);
    }

}