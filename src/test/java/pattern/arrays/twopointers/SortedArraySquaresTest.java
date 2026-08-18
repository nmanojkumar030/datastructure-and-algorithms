package pattern.arrays.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortedArraySquaresTest {

    @Test
    void shouldMakeSquaresWithNegativeAndPositiveNumbers() {
        assertArrayEquals(new int[]{0, 1, 4, 4, 9}, SortedArraySquares.makeSquares(new int[]{-2, -1, 0, 2, 3}));
    }

    @Test
    void shouldMakeSquaresWithDuplicateResultingSquares() {
        assertArrayEquals(new int[]{0, 1, 1, 4, 9}, SortedArraySquares.makeSquares(new int[]{-3, -1, 0, 1, 2}));
    }

    @Test
    void shouldMakeSquaresForSingleElementArray() {
        assertArrayEquals(new int[]{9}, SortedArraySquares.makeSquares(new int[]{-3}));
    }

    @Test
    void shouldMakeSquaresUsingStreams() {
        assertArrayEquals(new int[]{0, 1, 1, 4, 9}, SortedArraySquares.squaresOfASortedArrayUsingStreams(new int[]{-3, -1, 0, 1, 2}));
    }

    @Test
    void shouldMakeSquaresUsingPointers() {
        assertArrayEquals(new int[]{0, 1, 1, 4, 9}, SortedArraySquares.squaresOfASortedArrayUsingPointers(new int[]{-3, -1, 0, 1, 2}));
    }
}
