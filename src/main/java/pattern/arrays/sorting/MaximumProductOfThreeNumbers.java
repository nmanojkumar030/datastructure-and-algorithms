package pattern.arrays.sorting;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {

    public static void main(String[] args) {
        MaximumProductOfThreeNumbers maximumProductOfThreeNumbers = new MaximumProductOfThreeNumbers();
        int result = maximumProductOfThreeNumbers.maximumProduct(new int[]{1, 2, 3, 4});
        System.out.println("maximum product of three numbers is " + result);

        int result2 = maximumProductOfThreeNumbers.maximumProduct(new int[]{-1, -2, 3, 4});
        System.out.println("maximum product of three numbers is " + result2);
    }

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int max2 = nums[nums.length - 1] * nums[0] * nums[1];

        return Math.max(max1, max2);
    }
}
