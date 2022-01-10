package arrays;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        int[] nums = new int[]{1, 1, 2};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        Assert.assertEquals(2, removeDuplicates.removeDuplicates(nums));
    }

    @Test
    public void testRemoveDuplicates2() {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        Assert.assertEquals(5, removeDuplicates.removeDuplicates(nums));
    }

    @Test
    public void testRemoveDuplicates3() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
        for (int i = 0; i <600000; i++) {
            writer.write("{\"passengerTypeCode\": \"ADT\"},");
        }
        writer.close();
    }
}
