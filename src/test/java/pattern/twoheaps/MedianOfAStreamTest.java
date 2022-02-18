package pattern.twoheaps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianOfAStreamTest {
    @Test
    public void testFindMedian() {
        MedianOfAStream medianOfAStream = new MedianOfAStream();
        medianOfAStream.insertNum(3);
        medianOfAStream.insertNum(1);
        assertEquals(2.0, medianOfAStream.findMedian(), 0.0);
        medianOfAStream.insertNum(5);
        medianOfAStream.insertNum(4);
        assertEquals(3.5, medianOfAStream.findMedian(), 0.0);
    }
}