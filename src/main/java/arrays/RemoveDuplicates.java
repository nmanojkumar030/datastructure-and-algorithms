package arrays;

import java.util.Set;
import java.util.TreeSet;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int uniqueElementIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[uniqueElementIndex] != nums[i]) {
                uniqueElementIndex++;
                nums[uniqueElementIndex] = nums[i];
            }
        }
        return uniqueElementIndex + 1;
    }

    public int removeDuplicates1(int[] nums) {
        Set<Integer> contextSet = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            contextSet.add(nums[i]);
        }
        Integer[] integerArray = new Integer[contextSet.size()];
        contextSet.toArray(integerArray);

        for (int i = 0; i < integerArray.length; i++) {
            nums[i] = integerArray[i];
        }
        return integerArray.length;
    }

}
