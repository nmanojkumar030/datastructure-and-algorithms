package pattern.binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxInBitonicArrayTest {

    @Test
    public void testFindMax_peakInMiddle() {
        assertEquals(12, MaxInBitonicArray.findMax(new int[]{1, 3, 8, 12, 4, 2}));
    }

    @Test
    public void testFindMax_peakNearStart() {
        assertEquals(8, MaxInBitonicArray.findMax(new int[]{3, 8, 3, 1}));
    }

    @Test
    public void testFindMax_increasingOnly() {
        assertEquals(12, MaxInBitonicArray.findMax(new int[]{1, 3, 8, 12}));
    }

    @Test
    public void testFindMax_decreasingOnly() {
        assertEquals(10, MaxInBitonicArray.findMax(new int[]{10, 9, 8}));
    }

    @Test
    public void testFindMax_singleElementArray() {
        assertEquals(5, MaxInBitonicArray.findMax(new int[]{5}));
    }
}
