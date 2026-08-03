package pattern.arrays.slidingwindow;

public class FindMaxConsecutiveOnes {
    static void main(String[] args) {
        FindMaxConsecutiveOnes sol = new FindMaxConsecutiveOnes();
        int[] nums = {1, 1, 1, 0, 1, 1, 0, 1}; // Test input
        System.out.println(sol.findMaxConsecutiveOnes(nums));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int maxSubSequenceLength = 0;
        int subSequenceLength = 0;
        for (int num : nums) {
            if (num == 1) {
                subSequenceLength++;
            } else {
                if (subSequenceLength > maxSubSequenceLength) {
                    maxSubSequenceLength = subSequenceLength;
                }
                subSequenceLength = 0;
            }
        }

        if (subSequenceLength > maxSubSequenceLength) {
            maxSubSequenceLength = subSequenceLength;
        }
        return maxSubSequenceLength;
    }
}
