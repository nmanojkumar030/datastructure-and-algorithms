package pattern.priorityqueues.twoheaps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianOfAStreamUsingSortedListTest {
    @Test
    public void testFindMedian() {
        MedianOfAStreamUsingSortedList medianOfAStream = new MedianOfAStreamUsingSortedList();
        medianOfAStream.insertNum(3);
        medianOfAStream.insertNum(1);
        assertEquals(2.0, medianOfAStream.findMedian(), 0.0);
        medianOfAStream.insertNum(5);
        medianOfAStream.insertNum(4);
        assertEquals(3.5, medianOfAStream.findMedian(), 0.0);
    }

    @Test
    public void testSingleElement() {
        MedianOfAStreamUsingSortedList m = new MedianOfAStreamUsingSortedList();
        m.insertNum(10);
        assertEquals(10.0, m.findMedian(), 0.0);
    }

    @Test
    public void testNegativeNumbers() {
        MedianOfAStreamUsingSortedList m = new MedianOfAStreamUsingSortedList();
        m.insertNum(-5);
        m.insertNum(-10);
        m.insertNum(-3);
        // sorted: [-10, -5, -3] -> median -5
        assertEquals(-5.0, m.findMedian(), 0.0);
        m.insertNum(-4);
        // sorted: [-10, -5, -4, -3] -> median (-5 + -4)/2 = -4.5
        assertEquals(-4.5, m.findMedian(), 0.0);
    }

    @Test
    public void testDuplicates() {
        MedianOfAStreamUsingSortedList m = new MedianOfAStreamUsingSortedList();
        m.insertNum(2);
        m.insertNum(2);
        m.insertNum(2);
        assertEquals(2.0, m.findMedian(), 0.0);
        m.insertNum(2);
        assertEquals(2.0, m.findMedian(), 0.0);
    }

    @Test
    public void testMixedSequence() {
        MedianOfAStreamUsingSortedList m = new MedianOfAStreamUsingSortedList();
        int[] nums = {12, 4, 5, 3, 8, 7};
        for (int n : nums) m.insertNum(n);
        // sorted: [3,4,5,7,8,12] -> median (5+7)/2 = 6.0
        assertEquals(6.0, m.findMedian(), 0.0);
    }
}