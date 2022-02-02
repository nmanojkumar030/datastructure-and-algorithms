package arrays;


import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * https://leetcode.com/problems/container-with-most-water/
 *
 * You are given an integer array height of length n.
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * <p>
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * <p>
 * Return the maximum amount of water a container can store.
 * <p>
 * Notice that you may not slant the container.
 * <p>
 *
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 *
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
 * In this case, the max area of water (blue section) the container can contain is 49.
 *
 * Input: height = [1,1]
 * Output: 1
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
