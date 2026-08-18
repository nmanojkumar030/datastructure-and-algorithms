package pattern.arrays.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestContinuousIncreasingSubsequenceTest {

    @Test
    void shouldFindLongestIncreasingSubsequenceWithADip() {
        LongestContinuousIncreasingSubsequence sol = new LongestContinuousIncreasingSubsequence();
        assertEquals(3, sol.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
    }

    @Test
    void shouldReturnOneWhenAllElementsAreEqual() {
        LongestContinuousIncreasingSubsequence sol = new LongestContinuousIncreasingSubsequence();
        assertEquals(1, sol.findLengthOfLCIS(new int[]{2, 2, 2, 2, 2}));
    }

    @Test
    void shouldReturnFullLengthWhenStrictlyIncreasing() {
        LongestContinuousIncreasingSubsequence sol = new LongestContinuousIncreasingSubsequence();
        assertEquals(5, sol.findLengthOfLCIS(new int[]{1, 3, 5, 7, 9}));
    }

    @Test
    void shouldReturnZeroForEmptyArray() {
        LongestContinuousIncreasingSubsequence sol = new LongestContinuousIncreasingSubsequence();
        assertEquals(0, sol.findLengthOfLCIS(new int[]{}));
    }

    @Test
    void shouldReturnZeroForNullArray() {
        LongestContinuousIncreasingSubsequence sol = new LongestContinuousIncreasingSubsequence();
        assertEquals(0, sol.findLengthOfLCIS(null));
    }

    @Test
    void shouldReturnOneForSingleElementArray() {
        LongestContinuousIncreasingSubsequence sol = new LongestContinuousIncreasingSubsequence();
        assertEquals(1, sol.findLengthOfLCIS(new int[]{5}));
    }
}
