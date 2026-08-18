package pattern.arrays.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMaxConsecutiveOnesTest {

    @Test
    void shouldFindMaxConsecutiveOnes() {
        FindMaxConsecutiveOnes sol = new FindMaxConsecutiveOnes();
        assertEquals(3, sol.findMaxConsecutiveOnes(new int[]{1, 1, 1, 0, 1, 1, 0, 1}));
    }

    @Test
    void shouldReturnZeroForEmptyArray() {
        FindMaxConsecutiveOnes sol = new FindMaxConsecutiveOnes();
        assertEquals(0, sol.findMaxConsecutiveOnes(new int[]{}));
    }

    @Test
    void shouldReturnZeroForNullArray() {
        FindMaxConsecutiveOnes sol = new FindMaxConsecutiveOnes();
        assertEquals(0, sol.findMaxConsecutiveOnes(null));
    }

    @Test
    void shouldReturnFullLengthWhenAllOnes() {
        FindMaxConsecutiveOnes sol = new FindMaxConsecutiveOnes();
        assertEquals(4, sol.findMaxConsecutiveOnes(new int[]{1, 1, 1, 1}));
    }

    @Test
    void shouldReturnZeroWhenNoOnes() {
        FindMaxConsecutiveOnes sol = new FindMaxConsecutiveOnes();
        assertEquals(0, sol.findMaxConsecutiveOnes(new int[]{0, 0, 0}));
    }

    @Test
    void shouldCountTrailingOnesRun() {
        FindMaxConsecutiveOnes sol = new FindMaxConsecutiveOnes();
        assertEquals(3, sol.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 1}));
    }
}
