package pattern.arrays.slidingwindow;

public class MaximumOfSubArrayOfSizeK {
    // Brute Force Method O(N2)
    public int findMaxSumOfSubArray1(int[] inputArray, int subArrayWidth) {
        int maxSum = 0;
        for (int i = 0; i < (inputArray.length - subArrayWidth + 1); i++) {
            int sum = 0;
            for (int j = i; j < (i + subArrayWidth); j++) {
                sum += inputArray[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    // Sliding Window O(N)
    public int findMaxSumOfSubArray(int[] inputArray, int subArrayWidth) {
        int maxSum = 0;
        int windowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < inputArray.length; windowEnd++) {
            windowSum += inputArray[windowEnd];
            if ((windowEnd - windowStart + 1) > subArrayWidth) {
                windowSum -= inputArray[windowStart];
                windowStart++;
            }
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public int findMaxSumOfSubArray2(int[] inputArray, int subArrayWidth) {
        int maxSum = 0;
        int windowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < inputArray.length; windowEnd++) {
            if ((windowEnd - windowStart + 1) <= subArrayWidth) {
                windowSum += inputArray[windowEnd];
            } else {
                windowSum -= inputArray[windowStart];
                windowStart++;
                windowSum += inputArray[windowEnd];
            }
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = 0;
        double slidingWindowSum = 0;
        for (int i = 0; i < k; i++) {
            slidingWindowSum += nums[i];
        }
        maxAverage = slidingWindowSum / k;

        for (int i = k; i < nums.length; i++) {
            slidingWindowSum = slidingWindowSum + nums[i] - nums[i - k];
            double average = slidingWindowSum / k;
            maxAverage = Math.max(maxAverage, average);
        }

        return maxAverage;
    }
}
