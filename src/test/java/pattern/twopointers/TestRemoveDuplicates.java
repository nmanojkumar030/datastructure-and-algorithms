package pattern.twopointers;

import org.junit.jupiter.api.Test;
import pattern.twopointers.RemoveDuplicates;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRemoveDuplicates {

    @Test
    public void testRemoveDuplicates1() {
        int[] nums = new int[]{1, 1, 2};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        assertEquals(2, removeDuplicates.removeDuplicates(nums));
    }

    @Test
    public void testRemoveDuplicates2() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        assertEquals(5, removeDuplicates.removeDuplicates(nums));
    }
}
