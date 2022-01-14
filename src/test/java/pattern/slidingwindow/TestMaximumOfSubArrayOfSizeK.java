package pattern.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumOfSubArrayOfSizeK {

    @Test
    public void testFindMaxSum() {
        MaximumOfSubArrayOfSizeK maximumOfSubArrayOfSizeK = new MaximumOfSubArrayOfSizeK();
        int result = maximumOfSubArrayOfSizeK.findMaxSumOfSubArray(new int[]{2, 1, 5, 1, 3, 2}, 3);
        Assert.assertEquals(9, result);
    }

    @Test
    public void testFindMaxSum2() {
        MaximumOfSubArrayOfSizeK maximumOfSubArrayOfSizeK = new MaximumOfSubArrayOfSizeK();
        int result = maximumOfSubArrayOfSizeK.findMaxSumOfSubArray(new int[]{2, 3, 4, 1, 5}, 2);
        Assert.assertEquals(7, result);
    }
}
