package pattern.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMinSizeSubArraySum {

    @Test
    public void testFindMinSubArray() {
        MinSizeSubArraySum minSizeSubArraySum = new MinSizeSubArraySum();
        int minArraySize = minSizeSubArraySum.findMinSubArray(new int[]{2, 1, 5, 2, 3, 2}, 7);
        assertEquals(2, minArraySize);
    }

    @Test
    public void testFindMinSubArray2() {
        MinSizeSubArraySum minSizeSubArraySum = new MinSizeSubArraySum();
        int minArraySize = minSizeSubArraySum.findMinSubArray(new int[]{2, 1, 5, 2, 8}, 7);
        assertEquals(1, minArraySize);
    }

    @Test
    public void testFindMinSubArray3() {
        MinSizeSubArraySum minSizeSubArraySum = new MinSizeSubArraySum();
        int minArraySize = minSizeSubArraySum.findMinSubArray(new int[]{3, 4, 1, 1, 6}, 8);
        assertEquals(3, minArraySize);
    }
}