package arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int uniqueElementIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                uniqueElementIndex++;
                nums[uniqueElementIndex] = nums[i];
            }
        }
        return uniqueElementIndex + 1;
    }
}
