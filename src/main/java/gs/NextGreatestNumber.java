package gs;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Input - [3, 4, 5, 2, 6, 8]
 * Output -
 * 2-6
 * 3-4
 * 4-5
 * 5-6
 * 6-8
 * 8--1
 */

public class NextGreatestNumber {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{3, 4, 5, 2, 6, 8};
        Map<Integer, Integer> nextGreatestNumberMap = findNextGreatestNumbersWithStack(integers);
        for (Map.Entry entry : nextGreatestNumberMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }

    private static Map<Integer, Integer> findNextGreatestNumbersWithNestedLoops(Integer[] integers) {
        Map<Integer, Integer> greatestNumberMap = new HashMap<>();
        for (int i = 0; i < integers.length; i++) {
            for (int j = i + 1; j < integers.length; j++) {
                if (integers[j] > integers[i]) {
                    greatestNumberMap.put(integers[i], integers[j]);
                    break;
                }
            }
            greatestNumberMap.putIfAbsent(integers[i], -1);
        }
        return greatestNumberMap;
    }

    /**
     * 3, 4, 5, 2, 6, 8
     * <p>
     * Stack - 3
     * 4 > 3   3 - 4
     * <p>
     * Stack - 4
     * 5 > 4   4 - 5
     * <p>
     * <p>
     * Stack - 5
     * 5 < 2
     * <p>
     * <p>
     * Stack - 5 2
     * 2 < 6  2 - 6
     * <p>
     * <p>
     * Stack - 5
     * 5 < 6  5 - 6
     * <p>
     * <p>
     * Stack - 6
     * 8 < 6  6 - 8
     * <p>
     * Stack 8
     * end of array, 8 - -1
     */
    private static Map<Integer, Integer> findNextGreatestNumbersWithStack(Integer[] integers) {
        Map<Integer, Integer> greatestNumberMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(integers[0]);

        for (int i = 1; i < integers.length; i++) {
            int stackTopElement;
            Integer nextInArray = integers[i];

            if (!stack.empty()) {
                stackTopElement = stack.pop();

                // Next Greater Element
                while (nextInArray > stackTopElement) {
                    greatestNumberMap.put(stackTopElement, nextInArray);
                    if (stack.isEmpty()) {
                        break;
                    }
                    stackTopElement = stack.pop();
                }

                // Smaller Element
                if (nextInArray < stackTopElement) {
                    stack.push(stackTopElement);
                }
            }
            stack.push(nextInArray);
        }
        while (!stack.isEmpty()) {
            greatestNumberMap.put(stack.pop(), -1);
        }
        return greatestNumberMap;
    }
}
