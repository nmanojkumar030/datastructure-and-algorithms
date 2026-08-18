package pattern.arrays.sorting;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MinimumAbsoluteDifferenceTest {

    @Test
    void shouldFindAllPairsWithMinimumAbsoluteDifference() {
        MinimumAbsoluteDifference sol = new MinimumAbsoluteDifference();
        List<List<Integer>> result = sol.solution(new int[]{4, 2, 1, 3});
        assertEquals(List.of(List.of(1, 2), List.of(2, 3), List.of(3, 4)), result);
    }

    @Test
    void shouldFindMultiplePairsWithMinimumAbsoluteDifference() {
        MinimumAbsoluteDifference sol = new MinimumAbsoluteDifference();
        List<List<Integer>> result = sol.solution(new int[]{3, 8, -10, 23, 19, -4, -14, 27});
        assertEquals(List.of(List.of(-14, -10), List.of(19, 23), List.of(23, 27)), result);
    }

    @Test
    void shouldReturnNullForEmptyArray() {
        MinimumAbsoluteDifference sol = new MinimumAbsoluteDifference();
        assertNull(sol.solution(new int[]{}));
    }

    @Test
    void shouldReturnNullForNullArray() {
        MinimumAbsoluteDifference sol = new MinimumAbsoluteDifference();
        assertNull(sol.solution(null));
    }

    @Test
    void shouldReturnNullForSingleElementArray() {
        MinimumAbsoluteDifference sol = new MinimumAbsoluteDifference();
        assertNull(sol.solution(new int[]{5}));
    }
}
