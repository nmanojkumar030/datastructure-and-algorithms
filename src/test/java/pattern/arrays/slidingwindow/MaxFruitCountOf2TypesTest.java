package pattern.arrays.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxFruitCountOf2TypesTest {

    @Test
    void shouldFindMaxFruitsWithThreeTypes() {
        assertEquals(3, MaxFruitCountOf2Types.findLength(new char[]{'A', 'B', 'C', 'A', 'C'}));
    }

    @Test
    void shouldFindMaxFruitsWithRepeatedTypes() {
        assertEquals(5, MaxFruitCountOf2Types.findLength(new char[]{'A', 'B', 'C', 'B', 'B', 'C'}));
    }

    @Test
    void shouldReturnZeroForEmptyArray() {
        assertEquals(0, MaxFruitCountOf2Types.findLength(new char[]{}));
    }

    @Test
    void shouldReturnFullLengthWhenOnlyOneType() {
        assertEquals(4, MaxFruitCountOf2Types.findLength(new char[]{'A', 'A', 'A', 'A'}));
    }

    @Test
    void shouldReturnFullLengthWhenExactlyTwoTypes() {
        assertEquals(4, MaxFruitCountOf2Types.findLength(new char[]{'A', 'B', 'A', 'B'}));
    }
}
