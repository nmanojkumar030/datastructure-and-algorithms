package pattern.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class TestAverageOfSubArrayOfSizeK {

    @Test
    public void testFindAverage() {
        AverageOfSubArrayOfSizeK averageOfSubArrayOfSizeK = new AverageOfSubArrayOfSizeK();
        double[] result = averageOfSubArrayOfSizeK.findAverageUsingBruteForce(new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2}, 5);
        Assert.assertArrayEquals(new double[]{2.2, 2.8, 2.4, 3.6, 2.8}, result, 0);
    }

    @Test
    public void testFindAverage_usingSlidingWindow() {
        AverageOfSubArrayOfSizeK averageOfSubArrayOfSizeK = new AverageOfSubArrayOfSizeK();
        double[] result = averageOfSubArrayOfSizeK.findAverageUsingSlidingWindow(new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2}, 5);
        Assert.assertArrayEquals(new double[]{2.2, 2.8, 2.4, 3.6, 2.8}, result, 0);
    }
}
