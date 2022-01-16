package pattern.fastandslowpointer;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCycle {

    // Time Complexity O(N), Space Complexity O(1)
    public boolean hasCycle(Node head) {
        boolean result = false;
        Node fastPointer = head;
        Node slowPointer = head;

        while (null != slowPointer && null != fastPointer.nextPointer) {
            fastPointer = fastPointer.nextPointer.nextPointer;
            slowPointer = slowPointer.nextPointer;

            if (slowPointer == fastPointer) {
                result = true;
                break;
            }
        }
        return result;
    }

    // Time Complexity O(N), Space Complexity O(N)
    public boolean hasCycleWithHashMap(Node head) {
        boolean result = false;
        Map<Node, Integer> map = new HashMap<>();
        Node temp = head.nextPointer;
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

    public int findCycleLength(Node head) {
        int cycleLength = 0;
        Node fastPointer = head;
        Node slowPointer = head;
        Node lengthPointer = null;

        while (null != slowPointer && null != fastPointer.nextPointer) {
            fastPointer = fastPointer.nextPointer.nextPointer;
            slowPointer = slowPointer.nextPointer;

            if (slowPointer == fastPointer) {
                lengthPointer = slowPointer;
                cycleLength = findLength(slowPointer);
                break;
            }
        }

        return cycleLength;
    }

    private int findLength(Node slowPointer) {
        int cycleLength = 0;
        Node lengthPointer = slowPointer;
        do {
            cycleLength++;
            lengthPointer = lengthPointer.nextPointer;
        } while (slowPointer != lengthPointer);
        return cycleLength;
    }

    class Node {
        int data;
        Node nextPointer;

        public Node(int data) {
            this.data = data;
        }
    }
}


