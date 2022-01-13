package pattern.slidingwindow;

public class AverageOfSubArrayOfSizeK {

    // Brute Force Method
    public double[] findAverageUsingBruteForce(int[] inputArray, int subArrayWidth) {
        double[] result = new double[inputArray.length - subArrayWidth + 1];
        for (int i = 0; i <= inputArray.length - subArrayWidth; i++) {
            double sum = 0;
            for (int j = i; j < i + subArrayWidth; j++) {
                sum += inputArray[j];
            }
            result[i] = sum / subArrayWidth;
        }
        return result;
    }

    // Sliding Window
    public double[] findAverageUsingSlidingWindow(int[] inputArray, int subArrayWidth) {
        double[] result = new double[inputArray.length - subArrayWidth + 1];

        double slidingWindowSum = 0;
        for (int i = 0; i < subArrayWidth; i++) {
            slidingWindowSum += inputArray[i];
        }

        int slidingWindowEnd = subArrayWidth - 1;
        for (int slidingWindowStart = 0; slidingWindowEnd < inputArray.length; slidingWindowStart++) {
            result[slidingWindowStart] = slidingWindowSum / subArrayWidth;
            slidingWindowSum -= inputArray[slidingWindowStart];
            slidingWindowEnd++;
            if (slidingWindowEnd < inputArray.length) {
                slidingWindowSum += inputArray[slidingWindowEnd];
            }
        }
        return result;
    }
}
