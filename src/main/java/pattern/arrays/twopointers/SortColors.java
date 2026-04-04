package pattern.arrays.twopointers;

import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/sort-colors/
 *
 * <p>
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
 * with the colors in the order red, white, and blue.
 * <p>
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 * <p>
 * You must solve this problem without using the library's sort function.
 * <p>
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * <p>
 * Input: nums = [2,0,1]
 * Output: [0,1,2]
 */
public class SortColors {

    public void sortColors(int[] nums) {
        Map<Integer, Integer> elementCountMap = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (null == elementCountMap.get(nums[i])) {
                elementCountMap.put(nums[i], 1);
            } else {
                int count = elementCountMap.get(nums[i]);
                elementCountMap.put(nums[i], ++count);
            }
        }

        int previousIndex = 0;
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            int j = 0;
            while (j < entry.getValue()) {
                nums[previousIndex + j] = entry.getKey();
                j++;
            }
            previousIndex += j;
        }

        int index = 0;
        for (int i : new int[]{0, 1, 2}) {
            int count = elementCountMap.getOrDefault(i, 0);
            for (int j = 0; j < count; j++) {
                nums[index++] = i;
            }
        }
    }

    public void sortColorsUsingPriorityQueue(int[] nums) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            priorityQueue.offer(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = priorityQueue.poll();
        }
    }

    public void sortColorsUsingStreams(int[] nums) {
        Map<Integer, Long> colorCount = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int idx = 0;
        for (int color : Arrays.asList(0, 1, 2)) {
            long count = colorCount.getOrDefault(color, 0L);
            for (int i = 0; i < count; i++) {
                nums[idx++] = color;
            }
        }
    }
}
