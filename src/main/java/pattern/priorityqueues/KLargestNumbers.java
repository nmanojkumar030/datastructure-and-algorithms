package pattern.priorityqueues;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Any problem that asks us to find the top/smallest/frequent ‘K’ elements among a given set falls under this pattern.
 * <p>
 * The best data structure that comes to mind to keep track of ‘K’ elements is Heap.
 * This pattern will make use of the Heap to solve multiple problems dealing with ‘K’ elements at a time from a set of given elements.
 * <p>
 * Input: [3, 1, 5, 12, 2, 11], K = 3
 * Output: [5, 12, 11]
 * <p>
 * Input: [5, 12, 11, -1, 12], K = 3
 * Output: [12, 11, 12]
 */
public class KLargestNumbers {
    // Using priority queue - Maximum Heap
    // Time Complexity - O(NlogK + KlogK),
    public int[] findKLargestNumbersUsingMaxHeap(int[] inputArray, int kElements) {
        int[] result = new int[kElements];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (int i : inputArray) {
            maxHeap.offer(i);
        }

        for (int i = 0; (i < kElements && !maxHeap.isEmpty()); i++) {
            int maxNumber = maxHeap.poll();
            result[i] = maxNumber;
        }
        return result;
    }

    // Using priority queue - Minimum Heap
    // Time Complexity - O(KlogK + (N-K)logK)
    public int[] findKLargestNumbersUsingMinHeap(int[] inputArray, int kElements) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < inputArray.length; i++) {
            minHeap.offer(inputArray[i]);

            if (minHeap.size() > kElements) {
                minHeap.poll();
            }
        }

        int j = 0;
        int[] result = new int[kElements];
        while (!minHeap.isEmpty()) {
            result[j++] = minHeap.poll();
        }
        return result;
    }

    // Using Arrays.sort
    // Time Complexity - O(NlogN)
    public int[] findKLargestNumbersUsingSort(int[] inputArray, int kElements) {
        int[] result = new int[kElements];
        Arrays.sort(inputArray);
        int j = 0;
        for (int i = inputArray.length - 1; i >= inputArray.length - kElements; i--) {
            result[j++] = inputArray[i];
        }
        return result;
    }
}
