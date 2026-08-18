package pattern.binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CeilingOfANumberTest {

    @Test
    public void testCeiling_exactMatch() {
        assertEquals(1, CeilingOfANumber.searchCeilingOfANumber(new int[]{4, 6, 10}, 6));
    }

    @Test
    public void testCeiling_betweenElements() {
        assertEquals(4, CeilingOfANumber.searchCeilingOfANumber(new int[]{1, 3, 8, 10, 15}, 12));
    }

    @Test
    public void testCeiling_greaterThanMax() {
        assertEquals(-1, CeilingOfANumber.searchCeilingOfANumber(new int[]{4, 6, 10}, 17));
    }

    @Test
    public void testCeiling_lessThanMin() {
        assertEquals(0, CeilingOfANumber.searchCeilingOfANumber(new int[]{4, 6, 10}, -1));
    }

    @Test
    public void testCeiling_nullArray() {
        assertEquals(-1, CeilingOfANumber.searchCeilingOfANumber(null, 5));
    }

    @Test
    public void testCeiling_singleElementArray() {
        assertEquals(0, CeilingOfANumber.searchCeilingOfANumber(new int[]{5}, 5));
    }
}
