package pattern.priorityqueues.twoheaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Alternate solution to {@link MedianOfAStream} that keeps a single sorted list
 * instead of two heaps.
 * <p>
 * insertNum(int num): stores the number in the class
 * findMedian(): returns the median of all numbers inserted in the class
 */
public class MedianOfAStreamUsingSortedList {

    private final List<Integer> sortedNums = new ArrayList<>();

    // Time Complexity - O(N) due to shifting elements on insert
    public void insertNum(int num) {
        int insertionPoint = Collections.binarySearch(sortedNums, num);
        if (insertionPoint < 0) {
            insertionPoint = -(insertionPoint + 1);
        }
        sortedNums.add(insertionPoint, num);
    }

    // Time Complexity - O(1)
    public double findMedian() {
        int size = sortedNums.size();
        int mid = size / 2;
        if (size % 2 == 0) {
            return (sortedNums.get(mid - 1) + sortedNums.get(mid)) / 2.0;
        }
        return sortedNums.get(mid);
    }
}