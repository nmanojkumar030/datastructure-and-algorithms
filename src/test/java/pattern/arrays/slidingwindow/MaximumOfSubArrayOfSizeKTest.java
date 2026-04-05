package pattern.arrays.slidingwindow;

import org.junit.jupiter.api.Test;
import pattern.arrays.slidingwindow.MaximumOfSubArrayOfSizeK;

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

    @Test
    public void testFindMaxAverageSum() {
        MaximumOfSubArrayOfSizeK maximumOfSubArrayOfSizeK = new MaximumOfSubArrayOfSizeK();
        double result = maximumOfSubArrayOfSizeK.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4);
        assertEquals(12.75, result);
    }
}
