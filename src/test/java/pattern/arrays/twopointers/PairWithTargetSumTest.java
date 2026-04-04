package pattern.arrays.twopointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pattern.arrays.twopointers.PairWithTargetSum;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairWithTargetSumTest {

    private PairWithTargetSum pairWithTargetSum;

    @BeforeEach
    public void setUp() {
        pairWithTargetSum = new PairWithTargetSum();
    }

    // Test cases for searchUsingBruteForce
    @Test
    public void testBruteForceBasicCase() {
        int[] result = pairWithTargetSum.searchUsingBruteForce(new int[]{1, 2, 3, 4, 6}, 6);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    public void testBruteForceSecondCase() {
        int[] result = pairWithTargetSum.searchUsingBruteForce(new int[]{2, 5, 9, 11}, 11);
        assertEquals(0, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void testBruteForceWithStartAndEndElements() {
        int[] result = pairWithTargetSum.searchUsingBruteForce(new int[]{1, 5, 10, 15}, 16);
        assertEquals(0, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    public void testBruteForceWithTwoElements() {
        int[] result = pairWithTargetSum.searchUsingBruteForce(new int[]{3, 7}, 10);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    // Test cases for searchUsingBinarySearch
    @Test
    public void testBinarySearchBasicCase() {
        int[] result = pairWithTargetSum.searchUsingBinarySearch(new int[]{1, 2, 3, 4, 6}, 6);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    public void testBinarySearchSecondCase() {
        int[] result = pairWithTargetSum.searchUsingBinarySearch(new int[]{2, 5, 9, 11}, 11);
        assertEquals(0, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void testBinarySearchWithLargeArray() {
        int[] result = pairWithTargetSum.searchUsingBinarySearch(new int[]{1, 3, 5, 7, 9, 11, 13}, 16);
        assertEquals(2, result[0]);
        assertEquals(5, result[1]);
    }

    @Test
    public void testBinarySearchWithNegativeNumbers() {
        int[] result = pairWithTargetSum.searchUsingBinarySearch(new int[]{-5, -2, 0, 3, 8}, 5);
        assertEquals(1, result[0]);
        assertEquals(4, result[1]);
    }

    // Test cases for searchUsingTwoPointers
    @Test
    public void testTwoPointersBasicCase() {
        int[] result = pairWithTargetSum.searchUsingTwoPointers(new int[]{1, 2, 3, 4, 6}, 6);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    public void testTwoPointersSecondCase() {
        int[] result = pairWithTargetSum.searchUsingTwoPointers(new int[]{2, 5, 9, 11}, 11);
        assertEquals(0, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void testTwoPointersWithStartAndEndElements() {
        int[] result = pairWithTargetSum.searchUsingTwoPointers(new int[]{1, 5, 10, 15}, 16);
        assertEquals(0, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    public void testTwoPointersWithNegativeNumbers() {
        int[] result = pairWithTargetSum.searchUsingTwoPointers(new int[]{-5, -2, 0, 3, 8}, 5);
        assertEquals(1, result[0]);
        assertEquals(4, result[1]);
    }

    @Test
    public void testTwoPointersWithTwoElements() {
        int[] result = pairWithTargetSum.searchUsingTwoPointers(new int[]{3, 7}, 10);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    // Test cases for searchUsingHashTable
    @Test
    public void testHashTableBasicCase() {
        int[] result = pairWithTargetSum.searchUsingHashTable(new int[]{1, 2, 3, 4, 6}, 6);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    public void testHashTableSecondCase() {
        int[] result = pairWithTargetSum.searchUsingHashTable(new int[]{2, 5, 9, 11}, 11);
        assertEquals(0, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void testHashTableWithLargeArray() {
        int[] result = pairWithTargetSum.searchUsingHashTable(new int[]{1, 3, 5, 7, 9, 11, 13}, 16);
        assertEquals(2, result[0]);
        assertEquals(5, result[1]);
    }

    @Test
    public void testHashTableWithNegativeNumbers() {
        int[] result = pairWithTargetSum.searchUsingHashTable(new int[]{-5, -2, 0, 3, 8}, 5);
        assertEquals(1, result[0]);
        assertEquals(4, result[1]);
    }

    @Test
    public void testHashTableWithDuplicateElements() {
        int[] result = pairWithTargetSum.searchUsingHashTable(new int[]{2, 2, 4, 4, 6}, 8);
        assertEquals(2, result[0]);
        assertEquals(3, result[1]);
    }
}
