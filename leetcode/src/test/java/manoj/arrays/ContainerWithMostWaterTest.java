package manoj.arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {

    @Test
    public void testMaxArea1() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int result = containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        assertEquals(49, result);
    }

    @Test
    public void testMaxArea2() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int result = containerWithMostWater.maxArea(new int[]{1, 1});
        assertEquals(1, result);
    }

    @Test
    public void testMaxArea3() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int result = containerWithMostWater.maxArea(new int[]{4, 3, 2, 1, 4});
        assertEquals(16, result);
    }

    @Test
    public void testMaxArea4() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int result = containerWithMostWater.maxArea(new int[]{1, 2, 1});
        assertEquals(2, result);
    }
}
