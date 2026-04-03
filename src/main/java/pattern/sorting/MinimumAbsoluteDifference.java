package pattern.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> solution(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        if (nums.length == 1) {
            return null;
        }

        Arrays.sort(nums);
        int min_diff = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            min_diff = Math.min(min_diff, nums[i] - nums[i - 1]);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (min_diff == nums[i] - nums[i - 1]){
                result.add(Arrays.asList(nums[i - 1], nums[i]));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MinimumAbsoluteDifference minimumAbsoluteDifference = new MinimumAbsoluteDifference();
        int[] nums1 = {3,8,-10,23,19,-4,-14,27};
        System.out.println(minimumAbsoluteDifference.solution(nums1));
    }
}
