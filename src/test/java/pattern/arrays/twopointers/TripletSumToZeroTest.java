package pattern.arrays.twopointers;

import org.junit.jupiter.api.Test;
import pattern.arrays.twopointers.TripletSumToZero;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TripletSumToZeroTest {

    @Test
    void shouldReturnEmptyListWhenInputIsNull() {
        TripletSumToZero tripletSumToZero = new TripletSumToZero();
        List<List<Integer>> result = tripletSumToZero.threeSum(null);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void shouldReturnEmptyListWhenArrayHasInsufficientElements() {
        TripletSumToZero tripletSumToZero = new TripletSumToZero();
        List<List<Integer>> result = tripletSumToZero.threeSum(new int[]{-3, 0});

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void shouldFindSingleTripletThatSumsToZero() {
        TripletSumToZero tripletSumToZero = new TripletSumToZero();
        List<List<Integer>> result = tripletSumToZero.threeSum(new int[]{-3, 1, 2});

        assertNotNull(result);
        assertTrue(result.size() == 1);
    }

    @Test
    void shouldReturnEmptyTripletWhenSumNotZero() {
        TripletSumToZero tripletSumToZero = new TripletSumToZero();
        List<List<Integer>> result = tripletSumToZero.threeSum(new int[]{-4, 1, 2});

        assertNotNull(result);
        assertTrue(result.size() == 0);
    }

    @Test
    void shouldFindOneTripletWhenArrayHasExtraElements() {
        TripletSumToZero tripletSumToZero = new TripletSumToZero();
        List<List<Integer>> result = tripletSumToZero.threeSum(new int[]{-3, 0, 1, 2, -1, 1, -2});

        assertNotNull(result);
        assertTrue(result.size() == 4);
    }
}