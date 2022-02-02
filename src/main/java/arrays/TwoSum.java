package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 *
 * <p>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * <p>
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * <p>
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class TwoSum {
    // Brute Force and less efficient solution
    // Time complexity O(n2)
    public int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    // Time complexity O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> contextMap = new HashMap<>(nums.length);
        int[] result = null;
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (contextMap.get(difference) != null) {
                result = new int[]{contextMap.get(difference), i};
                break;
            }
            contextMap.put(nums[i], i);
        }
        return result;
    }
}
