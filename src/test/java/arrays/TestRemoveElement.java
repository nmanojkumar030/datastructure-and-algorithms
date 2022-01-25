package arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRemoveElement {

    @Test
    public void testRemoveElement1() {
        int[] nums = new int[]{3, 2, 2, 3};
        RemoveElement element = new RemoveElement();
        int result = element.removeElement(nums, 3);
        assertEquals(2, result);
    }

    @Test
    public void testRemoveElement2() {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        RemoveElement element = new RemoveElement();
        int result = element.removeElement(nums, 2);
        assertEquals(5, result);
    }
}
