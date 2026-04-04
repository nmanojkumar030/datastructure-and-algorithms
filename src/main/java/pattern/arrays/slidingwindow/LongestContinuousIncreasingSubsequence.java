package pattern.arrays.slidingwindow;

public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int maxSubSequenceLength = 0;
        int subSequenceLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                subSequenceLength++;
            } else {
                maxSubSequenceLength = subSequenceLength;
                subSequenceLength = 1;
            }
        }
        if (subSequenceLength > maxSubSequenceLength) {
            maxSubSequenceLength = subSequenceLength;
        }
        return maxSubSequenceLength;
    }

    // For testing purposes
    public static void main(String[] args) {
        LongestContinuousIncreasingSubsequence sol = new LongestContinuousIncreasingSubsequence();
        int[] nums1 = {1, 3, 5, 4, 7};
        int[] nums2 = {2, 2, 2, 2, 2};
        int[] nums3 = {1, 3, 5, 7, 9};
        System.out.println(sol.findLengthOfLCIS(nums1)); // Output: 3
        System.out.println(sol.findLengthOfLCIS(nums2)); // Output: 1
        System.out.println(sol.findLengthOfLCIS(nums3)); // Output: 5
    }
}
