package pattern.arrays.twopointers;

import java.util.Set;
import java.util.TreeSet;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * <p>
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 * <p>
 * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 * <p>
 * Return k after placing the final result in the first k slots of nums.
 * <p>
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * <p>
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * <p>
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveDuplicates {

    // Time Complexity - O(N)
    // Space Complexity - O(1)
    public int remove(int[] nums) {
        int uniqueElementIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[uniqueElementIndex] != nums[i]) {
                nums[++uniqueElementIndex] = nums[i];
            }
        }
        return uniqueElementIndex + 1;
    }

    public int removeDuplicatesFromSortedArrayUsingSet(int[] nums) {
        Set<Integer> integerSet = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            integerSet.add(nums[i]);
        }
        Integer[] integerArray = new Integer[integerSet.size()];
        integerSet.toArray(integerArray);

        for (int i = 0; i < integerArray.length; i++) {
            nums[i] = integerArray[i];
        }
        return integerArray.length;
    }

    public int removeDuplicatesFromSortedArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;

        if (nums.length == 1) {
            return 1;
        }

        int uniqueElementIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[++uniqueElementIndex] = nums[i];
            }
        }

        return uniqueElementIndex + 1;
    }

}
