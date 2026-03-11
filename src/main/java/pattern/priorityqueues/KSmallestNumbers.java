package pattern.priorityqueues;

import java.util.PriorityQueue;

public class KSmallestNumbers {

    public static int[] findKSmallestNumbersUsingMaxHeap(int[] inputArray, int kElements) {
        int[] result = new int[kElements];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (int i : inputArray) {
            maxHeap.offer(i);
            if (maxHeap.size() > kElements) {
                maxHeap.poll();
            }
        }

        int j = 0;
        while (!maxHeap.isEmpty()) {
            result[j++] = maxHeap.poll();
        }

        return result;
    }

    public static int[] findKSmallestNumbersUsingMinHeap(int[] inputArray, int kElements) {
        int[] result = new int[kElements];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

        for (int i : inputArray) {
            maxHeap.offer(i);
        }

        int j = 0;
        for (int i = 0; (i < kElements && !maxHeap.isEmpty()); i++) {
            result[j++] = maxHeap.poll();
        }

        return result;
    }
}
