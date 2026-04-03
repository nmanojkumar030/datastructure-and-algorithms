package pattern.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of unsorted numbers, find all unique triplets in it that add up to zero.
 * <p>
 * Input: [-3, 0, 1, 2, -1, 1, -2]
 * Output: [-3, 1, 2], [-2, 0, 2], [-2, 1, 1], [-1, 0, 1]
 * Explanation: There are four unique triplets whose sum is equal to zero.
 * <p>
 * Input: [-5, 2, -1, -2, 3]
 * Output: [[-5, 2, 3], [-2, -1, 3]]
 * Explanation: There are two unique triplets whose sum is equal to zero.
 */
public class TripletSumToZero {

    public static List<List<Integer>> searchTriplets(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) // skip same element to avoid duplicate triplets
                continue;
            int targetSum = -arr[i];
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int currentSum = arr[left] + arr[right];
                if (currentSum == targetSum) { // found the triplet
                    triplets.add(Arrays.asList(-targetSum, arr[left], arr[right]));
                    left++;
                    right--;
                    while (left < right && arr[left] == arr[left - 1])
                        left++; // skip same element to avoid duplicate triplets
                    while (left < right && arr[right] == arr[right + 1])
                        right--; // skip same element to avoid duplicate triplets
                } else if (targetSum > currentSum)
                    left++; // we need a pair with a bigger sum
                else
                    right--; // we need a pair with a smaller sum
            }
        }
        return triplets;
    }

    public static void main(String[] args) {
        System.out.println(TripletSumToZero.searchTriplets(new int[]{-3, 0, 1, 2, -1, 1, -2}));
        System.out.println(TripletSumToZero.searchTriplets(new int[]{-5, 2, -1, -2, 3}));
    }

    public List<List<Integer>> threeSumWithNestedLoops(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();

        if (nums == null || nums.length == 0 || nums.length < 3) {
            return triplets;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = i + 2; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }

        return triplets;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();

        if (nums == null || nums.length == 0 || nums.length < 3) {
            return triplets;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int targetSum = -nums[i];
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[left] + nums[right];
                if (currentSum == targetSum) {
                    triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }else if (currentSum > targetSum) {
                    right--;
                } else if (currentSum < targetSum) {
                    left++;
                }
            }
        }

        return triplets;
    }
}
