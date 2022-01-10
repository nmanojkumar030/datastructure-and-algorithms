package arrays;

import java.util.HashMap;
import java.util.Map;

public class SortColors {
    public void sortColors(int[] nums) {
        Map<Integer, Integer> elementCountMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (null == elementCountMap.get(nums[i])) {
                elementCountMap.put(nums[i], 1);
            } else {
                int count = elementCountMap.get(nums[i]);
                elementCountMap.put(nums[i], ++count);
            }
        }

        int zeroCount = elementCountMap.get(0) == null ? 0 : elementCountMap.get(0);
        if (zeroCount > 0) {
            for (int i = 0; i < zeroCount; i++) {
                nums[i] = 0;
            }
        }

        int oneCount = elementCountMap.get(1) == null ? 0 : elementCountMap.get(1);
        if (oneCount > 0) {
            for (int i = zeroCount; i < (zeroCount + oneCount); i++) {
                nums[i] = 1;
            }
        }

        int twoCount = elementCountMap.get(2) == null ? 0 : elementCountMap.get(2);
        if (twoCount > 0) {
            for (int i = (zeroCount + oneCount); i < (zeroCount + oneCount + twoCount); i++) {
                nums[i] = 2;
            }
        }
    }
}
