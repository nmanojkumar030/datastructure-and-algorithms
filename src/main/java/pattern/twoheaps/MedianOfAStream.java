package pattern.twoheaps;

import java.util.PriorityQueue;

/**
 * Design a class to calculate the median of a number stream.
 * The class should have the following two methods:
 * <p>
 * insertNum(int num): stores the number in the class
 * findMedian(): returns the median of all numbers inserted in the class
 * <p>
 * If the count of numbers inserted in the class is even, the median will be the average of the middle two numbers.
 */
public class MedianOfAStream {

    private PriorityQueue<Integer> minHeap = new PriorityQueue<>((o1, o2) -> o1 - o2);
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);

    // Time Complexity - O(log N)
    public void insertNum(int num) {
        if (maxHeap.isEmpty() || maxHeap.peek() >= num) {
            maxHeap.offer(num);
        } else {
            minHeap.offer(num);
        }

        if (maxHeap.size() > (minHeap.size() + 1)) {
            minHeap.offer(maxHeap.poll());
        } else if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    // Time Complexity - O(1)
    public double findMedian() {
        double median = 0.0;
        if (minHeap.size() == maxHeap.size()) {
            median = (minHeap.peek() + maxHeap.peek()) / 2.0;
        } else {
            median = maxHeap.peek();
        }
        return median;
    }
}
