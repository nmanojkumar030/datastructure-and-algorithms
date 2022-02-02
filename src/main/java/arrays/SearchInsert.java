package arrays;

/**
 * https://leetcode.com/problems/search-insert-position/
 * <p>
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * <p>
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * <p>
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 */
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
