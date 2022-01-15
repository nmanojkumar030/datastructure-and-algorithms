package pattern.twopointers;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of sorted numbers and a target sum,
 * find a pair in the array whose sum is equal to the given target.
 */
public class PairWithTargetSum {
    // Brute Force method O(N2)
    public int[] searchUsingBruteForce(int[] inputArray, int targetSum) {
        int[] pair = new int[2];
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = i + 1; j <= inputArray.length - 1; j++) {
                if (inputArray[i] + inputArray[j] == targetSum) {
                    pair[0] = i;
                    pair[1] = j;
                    break;
                }
            }
        }
        return pair;
    }

    // Binary Search method O(NlogN)
    public int[] searchUsingBinarySearch(int[] inputArray, int targetSum) {
        int[] pair = new int[2];
        for (int i = 0; i < inputArray.length - 1; i++) {
            int firsPointer = i + 1;
            int secondPointer = inputArray.length - 1;
            while (firsPointer < secondPointer) {
                int midPointer = (firsPointer + secondPointer) / 2;
                if (inputArray[i] + inputArray[midPointer] < targetSum) {
                    firsPointer = midPointer + 1;
                } else if (inputArray[i] + inputArray[midPointer] > targetSum) {
                    secondPointer = midPointer - 1;
                } else {
                    pair[0] = i;
                    pair[1] = midPointer;
                    break;
                }
            }
        }
        return pair;
    }

    // Two pointer approach
    // Time Complexity O(N) , Space Complexity - O(1)
    public int[] searchUsingTwoPointers(int[] inputArray, int targetSum) {
        int[] pair = new int[2];
        int startPointer = 0;
        int endPointer = inputArray.length - 1;

        while (startPointer < endPointer) {
            if (inputArray[startPointer] + inputArray[endPointer] < targetSum) {
                startPointer++;
            } else if (inputArray[startPointer] + inputArray[endPointer] > targetSum) {
                endPointer--;
            } else {
                pair[0] = startPointer;
                pair[1] = endPointer;
                break;
            }
        }
        return pair;
    }

    // Two pointer approach
    // Time Complexity O(N)
    public int[] searchUsingHashTable(int[] inputArray, int targetSum) {
        int[] pair = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (map.containsKey(targetSum - inputArray[i])) {
                pair[0] = map.get(targetSum - inputArray[i]);
                pair[1] = i;
                break;
            } else {
                map.put(inputArray[i], i);
            }
        }
        return pair;
    }
}
