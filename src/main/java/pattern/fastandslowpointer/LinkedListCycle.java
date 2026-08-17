package pattern.fastandslowpointer;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Statement#
 * Given the head of a Singly LinkedList, write a function to determine if the LinkedList has a cycle in it or not.
 * <p>
 * Based on Floyd's cycle finding algorithm
 */
public class LinkedListCycle {

    // Time Complexity O(N), Space Complexity O(1)
    public boolean hasCycle(Node<Integer> head) {
        boolean result = false;
        Node<Integer> fastPointer = head;
        Node<Integer> slowPointer = head;

        while (null != fastPointer && null != fastPointer.nextPointer) {
            fastPointer = fastPointer.nextPointer.nextPointer;
            slowPointer = slowPointer.nextPointer;

            if (slowPointer == fastPointer) {
                result = true;
                break;
            }
        }
        return result;
    }

    // Time Complexity - O(N), Space Complexity - O(1)
    public int findCycleLength(Node<Integer> head) {
        int cycleLength = 0;
        Node<Integer> fastPointer = head;
        Node<Integer> slowPointer = head;

        while (null != fastPointer && null != fastPointer.nextPointer) {
            fastPointer = fastPointer.nextPointer.nextPointer;
            slowPointer = slowPointer.nextPointer;

            if (slowPointer == fastPointer) {
                cycleLength = findLength(slowPointer);
                break;
            }
        }
        return cycleLength;
    }

    private int findLength(Node<Integer> slowPointer) {
        int cycleLength = 0;
        Node<Integer> lengthPointer = slowPointer;
        do {
            cycleLength++;
            lengthPointer = lengthPointer.nextPointer;
        } while (slowPointer != lengthPointer);
        return cycleLength;
    }

    // Time Complexity O(N), Space Complexity O(N)
    public boolean hasCycleWithHashMap(Node<Integer> head) {
        boolean result = false;
        Map<Node<Integer>, Integer> map = new HashMap<>();
        Node<Integer> temp = head;
        while (null != temp) {
            if (map.containsKey(temp)) {
                result = true;
                break;
            }
            map.put(temp, temp.data);
            temp = temp.nextPointer;
        }
        return result;
    }
}


