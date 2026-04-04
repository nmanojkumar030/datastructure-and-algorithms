package pattern.arrays.sorting;

import java.util.Arrays;

public class LargestPerimeter {
    public static void main(String[] args) {
        LargestPerimeter perimeter = new LargestPerimeter();
        int[] nums1 = {2, 1, 2};
        int[] nums2 = {1, 2, 1};
        int[] nums3 = {3, 2, 3, 4};
        System.out.println(perimeter.largestPerimeter(nums1)); // Output: 5
        System.out.println(perimeter.largestPerimeter(nums2)); // Output: 0
        System.out.println(perimeter.largestPerimeter(nums3)); // Output: 10
    }

    public int largestPerimeter(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int perimeter = 0;
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                perimeter = nums[i] + nums[i - 1] + nums[i - 2];
                break;
            }
        }
        return perimeter;
    }
}
