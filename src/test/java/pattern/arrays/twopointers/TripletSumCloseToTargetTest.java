package pattern.arrays.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TripletSumCloseToTargetTest {

    @Test
    void shouldFindTripletSumClosestToTarget() {
        assertEquals(1, TripletSumCloseToTarget.searchTriplet(new int[]{-2, 0, 1, 2}, 2));
    }

    @Test
    void shouldFindTripletSumClosestToTargetWhenExactMatchMissing() {
        assertEquals(0, TripletSumCloseToTarget.searchTriplet(new int[]{-3, -1, 1, 2}, 1));
    }

    @Test
    void shouldFindSmallestTripletSumWhenMultipleAreEquallyClose() {
        assertEquals(3, TripletSumCloseToTarget.searchTriplet(new int[]{1, 0, 1, 1}, 100));
    }

    @Test
    void shouldThrowExceptionWhenArrayHasFewerThanThreeElements() {
        assertThrows(IllegalArgumentException.class, () -> TripletSumCloseToTarget.searchTriplet(new int[]{1, 2}, 5));
    }

    @Test
    void shouldThrowExceptionForNullArray() {
        assertThrows(IllegalArgumentException.class, () -> TripletSumCloseToTarget.searchTriplet(null, 5));
    }
}
