package pattern.sorting;

import java.util.Arrays;

public class MinimumDifference {

    public int solution(int[] numArray) {
        if (numArray == null || numArray.length == 0) {
            return -1;
        }

        if (numArray.length == 1) {
            return -1;
        }

        Arrays.sort(numArray);
        int minDifference = Integer.MAX_VALUE;
        for(int i = 1; i < numArray.length; i++) {
            minDifference = Math.min(minDifference, numArray[i] - numArray[i - 1]);
        }
        return minDifference;
    }

    public static void main(String[] args) {
        MinimumDifference minimumDifference = new MinimumDifference();
        int[] nums1 = {4, 2, 1, 3};
        System.out.println(minimumDifference.solution(nums1)); // Output: 1

        int[] nums2 = {1, 0, 3, 10, 15};
        System.out.println(minimumDifference.solution(nums2)); // Output: 1

        int[] nums3 = {3, 8, 15, 17};
        System.out.println(minimumDifference.solution(nums3)); // Output: 2
    }
}
