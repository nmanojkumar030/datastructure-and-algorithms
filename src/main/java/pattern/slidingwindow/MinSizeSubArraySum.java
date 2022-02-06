package pattern.slidingwindow;

/**
 * Given an array of positive numbers and a positive number ‘S,’
 * find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’.
 * Return 0 if no such subarray exists.
 *
 * <p>
 * Input: [2, 1, 5, 2, 3, 2], S=7
 * Output: 2
 * Explanation: The smallest subarray with a sum greater than or equal to '7' is [5, 2].
 *
 * <p>
 * Input: [2, 1, 5, 2, 8], S=7
 * Output: 1
 * Explanation: The smallest subarray with a sum greater than or equal to '7' is [8].
 *
 * <p>
 * Input: [3, 4, 1, 1, 6], S=8
 * Output: 3
 * Explanation: Smallest subarrays with a sum greater than or equal to '8' are [3, 4, 1]
 * or [1, 1, 6].
 */
public class MinSizeSubArraySum {

    public int findMinSubArray(int[] inputArray, int targetSum) {
        int minLength = Integer.MAX_VALUE;
        int windowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < inputArray.length; windowEnd++) {
            windowSum += inputArray[windowEnd];

            while (windowSum >= targetSum) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= inputArray[windowStart++];
            }
        }
        return minLength;
    }
}
