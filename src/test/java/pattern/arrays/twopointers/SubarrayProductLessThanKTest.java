package pattern.arrays.twopointers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubarrayProductLessThanKTest {

    @Test
    void shouldFindAllSubarraysWithProductLessThanTarget() {
        List<List<Integer>> result = SubarrayProductLessThanK.findSubarrays(new int[]{2, 5, 3, 10}, 30);
        assertEquals(6, result.size());
    }

    @Test
    void shouldFindAllSubarraysWithProductLessThanLargerTarget() {
        List<List<Integer>> result = SubarrayProductLessThanK.findSubarrays(new int[]{8, 2, 6, 5}, 50);
        assertEquals(7, result.size());
    }

    @Test
    void shouldReturnEmptyListWhenTargetIsTooSmall() {
        List<List<Integer>> result = SubarrayProductLessThanK.findSubarrays(new int[]{5, 6, 7}, 1);
        assertEquals(0, result.size());
    }

    @Test
    void shouldReturnEmptyListForEmptyArray() {
        List<List<Integer>> result = SubarrayProductLessThanK.findSubarrays(new int[]{}, 30);
        assertEquals(0, result.size());
    }
}
