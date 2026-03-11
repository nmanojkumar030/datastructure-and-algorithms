package pattern.priorityqueues;

import java.util.PriorityQueue;

public class KthLargestElement {

    private final int k;
    private final PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public KthLargestElement(int[] arrayOfNums, int k) {
        this.k = k;
        for (int i : arrayOfNums) {
            add(i);
        }
    }

    public int add(int num) {
        minHeap.offer(num);
        if (minHeap.size() > k) {
             minHeap.poll();
        }
        return minHeap.peek();
    }
}
