package pattern.arrays.twopointers;

import java.util.Arrays;

/**
 * Given an array arr of unsorted numbers and a target sum,
 * count all triplets in it such that arr[i] + arr[j] + arr[k] < target where i, j, and k are three different indices.
 * Write a function to return the count of such triplets.
 *
 *
 * Input: [-1, 0, 2, 3], target=3
 * Output: 2
 * Explanation: There are two triplets whose sum is less than the target: [-1, 0, 3], [-1, 0, 2]
 *
 * Input: [-1, 4, 2, 1, 3], target=5
 * Output: 4
 * Explanation: There are four triplets whose sum is less than the target:
 *    [-1, 1, 4], [-1, 1, 3], [-1, 1, 2], [-1, 2, 3]
 */
public class TripletWithSmallerSum {
    public static int searchTriplets(int[] arr, int target) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int count1 = 0;
            int left = i + 1, right = arr.length - 1;
            while (left < right) {
                if (arr[left] + arr[right] < target - arr[i]) { // found the triplet
                    // since arr[right] >= arr[left], therefore, we can replace arr[right] by any number between
                    // left and right to get a sum less than the target sum
                    count1 += right - left;
                    left++;
                } else {
                    right--; // we need a pair with a smaller sum
                }
            }
            count += count1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(TripletWithSmallerSum.searchTriplets(new int[]{-1, 0, 2, 3}, 3));
        System.out.println(TripletWithSmallerSum.searchTriplets(new int[]{-1, 4, 2, 1, 3}, 5));
    }
}
