package arrays;

import java.util.HashMap;
import java.util.Map;

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
