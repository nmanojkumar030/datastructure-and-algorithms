package arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TestTwoSum {

    @Test
    public void testTwoSum1() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);

        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void testTwoSum2() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{2, 7, 11, 15}, 26);

        assertEquals(2, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    public void testTwoSum3() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{2, 7, 11, 15}, 18);

        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void testTwoSum4() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{3, 2, 3}, 6);

        assertEquals(0, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void testTwoSum5() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{3, 2, 4}, 6);

        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void testTwoSum6() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{3, 3}, 6);

        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

}