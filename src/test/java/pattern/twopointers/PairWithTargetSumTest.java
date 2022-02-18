package pattern.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairWithTargetSumTest {

    @Test
    public void testSearch() {
        PairWithTargetSum pairWithTargetSum = new PairWithTargetSum();
        int[] result = pairWithTargetSum.searchUsingHashTable(new int[]{1, 2, 3, 4, 6}, 6);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    public void testSearch2() {
        PairWithTargetSum pairWithTargetSum = new PairWithTargetSum();
        int[] result = pairWithTargetSum.searchUsingHashTable(new int[]{2, 5, 9, 11}, 11);
        assertEquals(0, result[0]);
        assertEquals(2, result[1]);
    }
}
