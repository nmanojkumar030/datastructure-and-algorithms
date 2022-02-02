package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/sort-colors/
 *
 * <p>
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
 * with the colors in the order red, white, and blue.
 * <p>
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 * <p>
 * You must solve this problem without using the library's sort function.
 * <p>
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * <p>
 * Input: nums = [2,0,1]
 * Output: [0,1,2]
 */
public class SortColors {
    public void sortColors(int[] nums) {
        Map<Integer, Integer> elementCountMap = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (null == elementCountMap.get(nums[i])) {
                elementCountMap.put(nums[i], 1);
            } else {
                int count = elementCountMap.get(nums[i]);
                elementCountMap.put(nums[i], ++count);
            }
        }

        int previousIndex = 0;
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            int j = 0;
            while (j < entry.getValue()) {
                nums[previousIndex + j] = entry.getKey();
                j++;
            }
            previousIndex += j;
        }
    }
}
