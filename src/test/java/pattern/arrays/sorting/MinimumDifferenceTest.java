package pattern.arrays.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumDifferenceTest {

    @Test
    void shouldFindMinimumDifference() {
        MinimumDifference sol = new MinimumDifference();
        assertEquals(1, sol.solution(new int[]{4, 2, 1, 3}));
    }

    @Test
    void shouldFindMinimumDifferenceWithUnsortedInput() {
        MinimumDifference sol = new MinimumDifference();
        assertEquals(1, sol.solution(new int[]{1, 0, 3, 10, 15}));
    }

    @Test
    void shouldFindMinimumDifferenceWithWideGaps() {
        MinimumDifference sol = new MinimumDifference();
        assertEquals(2, sol.solution(new int[]{3, 8, 15, 17}));
    }

    @Test
    void shouldReturnMinusOneForEmptyArray() {
        MinimumDifference sol = new MinimumDifference();
        assertEquals(-1, sol.solution(new int[]{}));
    }

    @Test
    void shouldReturnMinusOneForNullArray() {
        MinimumDifference sol = new MinimumDifference();
        assertEquals(-1, sol.solution(null));
    }

    @Test
    void shouldReturnMinusOneForSingleElementArray() {
        MinimumDifference sol = new MinimumDifference();
        assertEquals(-1, sol.solution(new int[]{5}));
    }
}
