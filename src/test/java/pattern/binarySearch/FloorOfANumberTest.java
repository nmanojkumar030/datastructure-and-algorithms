package pattern.binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FloorOfANumberTest {

    @Test
    public void testFloor_betweenElements() {
        assertEquals(3, FloorOfANumber.searchFloorOfANumber(new int[]{1, 3, 8, 10, 15}, 12));
    }

    @Test
    public void testFloor_exactMatch() {
        assertEquals(1, FloorOfANumber.searchFloorOfANumber(new int[]{4, 6, 10}, 6));
    }

    @Test
    public void testFloor_greaterThanMax() {
        assertEquals(2, FloorOfANumber.searchFloorOfANumber(new int[]{4, 6, 10}, 17));
    }

    @Test
    public void testFloor_lessThanMin() {
        assertEquals(-1, FloorOfANumber.searchFloorOfANumber(new int[]{4, 6, 10}, -1));
    }

    @Test
    public void testFloor_nullArray() {
        assertEquals(-1, FloorOfANumber.searchFloorOfANumber(null, 5));
    }

    @Test
    public void testFloor_singleElementArray() {
        assertEquals(0, FloorOfANumber.searchFloorOfANumber(new int[]{5}, 5));
    }
}
