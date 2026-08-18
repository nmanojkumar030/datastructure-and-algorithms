package pattern.arrays.twopointers;

import org.junit.jupiter.api.Test;
import pattern.arrays.twopointers.RemoveElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTest {

    @Test
    public void testRemoveElement1() {
        int[] nums = new int[]{3, 2, 2, 3};
        RemoveElement element = new RemoveElement();
        int result = element.remove(nums, 3);
        assertEquals(2, result);
    }

    @Test
    public void testRemoveElement2() {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        RemoveElement element = new RemoveElement();
        int result = element.remove(nums, 2);
        assertEquals(5, result);
    }

    @Test
    public void testRemoveElementNotPresentInArray() {
        int[] nums = new int[]{1, 2, 3};
        RemoveElement element = new RemoveElement();
        int result = element.remove(nums, 5);
        assertEquals(3, result);
    }

    @Test
    public void testRemoveElementWhenAllElementsMatchVal() {
        int[] nums = new int[]{4, 4, 4};
        RemoveElement element = new RemoveElement();
        int result = element.remove(nums, 4);
        assertEquals(0, result);
    }

    @Test
    public void testRemoveElementWithEmptyArray() {
        int[] nums = new int[]{};
        RemoveElement element = new RemoveElement();
        int result = element.remove(nums, 1);
        assertEquals(0, result);
    }
}
