package arrays;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

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
