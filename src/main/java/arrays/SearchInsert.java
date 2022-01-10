package arrays;

public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
                result = i;
                break;
            }
        }
        return result == -1 ? nums.length : result;
    }
}
