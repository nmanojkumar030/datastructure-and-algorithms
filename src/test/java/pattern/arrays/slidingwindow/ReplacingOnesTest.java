package pattern.arrays.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReplacingOnesTest {

    @Test
    void shouldFindLongestSubArrayWithTwoReplacements() {
        assertEquals(6, ReplacingOnes.findLength(new int[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1}, 2));
    }

    @Test
    void shouldFindLongestSubArrayWithThreeReplacements() {
        assertEquals(9, ReplacingOnes.findLength(new int[]{0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1}, 3));
    }

    @Test
    void shouldReturnZeroForEmptyArray() {
        assertEquals(0, ReplacingOnes.findLength(new int[]{}, 2));
    }

    @Test
    void shouldReturnFullLengthWhenAllOnes() {
        assertEquals(4, ReplacingOnes.findLength(new int[]{1, 1, 1, 1}, 0));
    }

    @Test
    void shouldReturnFullLengthWhenReplacementsCoverAllZeros() {
        assertEquals(4, ReplacingOnes.findLength(new int[]{0, 0, 0, 0}, 4));
    }
}
