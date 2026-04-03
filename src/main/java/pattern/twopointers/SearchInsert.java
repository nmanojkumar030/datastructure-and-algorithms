package pattern.twopointers;

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

    // O(n) Time Complexity
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

    // O(log n) Time Complexity
    public int searchInsertUsingBinarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = -1;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            }
            if (nums[mid] > target) {
                if ((mid - 1 >= 0) && nums[mid - 1] > target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return mid;
    }
}
