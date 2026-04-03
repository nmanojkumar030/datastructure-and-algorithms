package pattern.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSumTest {

    @Test
    public void shouldFindTwoNumbersWithSmallTarget() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);

        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void shouldFindTwoNumbersWithLargeTarget() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{2, 7, 11, 15}, 26);

        assertEquals(2, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    public void shouldFindTwoMiddleNumbers() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{2, 7, 11, 15}, 18);

        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void shouldFindTwoNumbersWithDuplicateElements() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{3, 2, 3}, 6);

        assertEquals(0, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void shouldFindConsecutiveNumbersInArray() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{3, 2, 4}, 6);

        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void shouldFindTwoIdenticalNumbers() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{3, 3}, 6);

        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

}