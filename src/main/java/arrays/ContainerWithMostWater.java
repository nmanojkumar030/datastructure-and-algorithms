package arrays;


import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * https://leetcode.com/problems/container-with-most-water/
 */
public class ContainerWithMostWater {

    // Time Complexity O(N)
    public int maxArea(int[] height) {
        int maxArea = 0;
        int startPointer = 0;
        int endPointer = height.length - 1;

        while (startPointer < endPointer) {
            maxArea = max(maxArea, min(height[startPointer], height[endPointer]) * (endPointer - startPointer));
            if (height[startPointer] < height[endPointer]) {
                startPointer++;
            } else {
                endPointer--;
            }
        }
        return maxArea;
    }

    // Brute Force Method O(N2)
    public int maxArea1(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                maxArea = max(maxArea, min(height[i], height[j]) * (j - i));
            }
        }
        return maxArea;
    }
}
