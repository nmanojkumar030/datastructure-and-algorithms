package pattern.sorting;

import java.util.Arrays;

public class ArrayPartition {

    public static void main(String[] args) {
        ArrayPartition arrayPartition = new ArrayPartition();
        System.out.println("Array Pair Sum " + arrayPartition.arrayPairSum(new int[]{1, 4, 3, 2}));
        System.out.println("Array Pair Sum " + arrayPartition.arrayPairSum(new int[]{6, 2, 6, 5, 1, 2}));
    }

    public int arrayPairSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; ) {
            sum += nums[i];
            i += 2;
        }
        return sum;
    }
}
