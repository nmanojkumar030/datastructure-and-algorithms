package pattern.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumOfSubArrayOfSizeKTest {

    @Test
    public void testFindMaxSum() {
        MaximumOfSubArrayOfSizeK maximumOfSubArrayOfSizeK = new MaximumOfSubArrayOfSizeK();
        int result = maximumOfSubArrayOfSizeK.findMaxSumOfSubArray(new int[]{2, 1, 5, 1, 3, 2}, 3);
        assertEquals(9, result);
    }

    @Test
    public void testFindMaxSum2() {
        MaximumOfSubArrayOfSizeK maximumOfSubArrayOfSizeK = new MaximumOfSubArrayOfSizeK();
        int result = maximumOfSubArrayOfSizeK.findMaxSumOfSubArray(new int[]{2, 3, 4, 1, 5}, 2);
        assertEquals(7, result);
    }
}
