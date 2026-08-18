package pattern.arrays.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TripletWithSmallerSumTest {

    @Test
    void shouldCountTripletsSmallerThanTarget() {
        int result = TripletWithSmallerSum.searchTriplets(new int[]{-1, 0, 2, 3}, 3);
        assertEquals(2, result);
    }

    @Test
    void shouldCountTripletsSmallerThanTargetWithMoreElements() {
        int result = TripletWithSmallerSum.searchTriplets(new int[]{-1, 4, 2, 1, 3}, 5);
        assertEquals(4, result);
    }

    @Test
    void shouldReturnZeroWhenArrayHasFewerThanThreeElements() {
        int result = TripletWithSmallerSum.searchTriplets(new int[]{1, 2}, 10);
        assertEquals(0, result);
    }

    @Test
    void shouldReturnZeroWhenNoTripletSumIsSmallerThanTarget() {
        int result = TripletWithSmallerSum.searchTriplets(new int[]{5, 6, 7}, 1);
        assertEquals(0, result);
    }
}
