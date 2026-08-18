package pattern.arrays.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestPerimeterTest {

    @Test
    void shouldFindLargestPerimeterWhenTriangleExists() {
        LargestPerimeter perimeter = new LargestPerimeter();
        assertEquals(5, perimeter.largestPerimeter(new int[]{2, 1, 2}));
    }

    @Test
    void shouldReturnZeroWhenNoTriangleCanBeFormed() {
        LargestPerimeter perimeter = new LargestPerimeter();
        assertEquals(0, perimeter.largestPerimeter(new int[]{1, 2, 1}));
    }

    @Test
    void shouldPreferLargestValidTriangle() {
        LargestPerimeter perimeter = new LargestPerimeter();
        assertEquals(10, perimeter.largestPerimeter(new int[]{3, 2, 3, 4}));
    }

    @Test
    void shouldReturnZeroForEmptyArray() {
        LargestPerimeter perimeter = new LargestPerimeter();
        assertEquals(0, perimeter.largestPerimeter(new int[]{}));
    }

    @Test
    void shouldReturnZeroForNullArray() {
        LargestPerimeter perimeter = new LargestPerimeter();
        assertEquals(0, perimeter.largestPerimeter(null));
    }
}
