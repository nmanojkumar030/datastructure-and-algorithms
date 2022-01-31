package pattern.topKElements;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
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
    public int[] findKLargestNumbers(int[] inputArray, int kElements) {
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
    public int[] findKLargestNumbers_usingMinHeap(int[] inputArray, int kElements) {
        int[] result = new int[kElements];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((o1, o2) -> o1 - o2);

        for (int i = 0; i < kElements; i++) {
            minHeap.offer(inputArray[i]);
        }

        for (int i = kElements; i < inputArray.length; i++) {
            int minNumber = minHeap.peek();
            if (minNumber < inputArray[i]) {
                minHeap.poll();
                minHeap.offer(inputArray[i]);
            }
        }

        int j = 0;
        Iterator<Integer> iterator = minHeap.iterator();
        while (iterator.hasNext()) {
            result[j++] = iterator.next();
        }
        return result;
    }

    // Using Arrays.sort
    // Time Complexity - O(NlogN)
    public int[] findKLargestNumbers_usingSort(int[] inputArray, int kElements) {
        int[] result = new int[kElements];
        Arrays.sort(inputArray);
        int j = 0;
        for (int i = inputArray.length - 1; i >= inputArray.length - kElements; i--) {
            result[j++] = inputArray[i];
        }
        return result;
    }
}
