package pattern.fastandslowpointer;

import java.util.HashMap;
import java.util.Map;

// Based on Floyd's cycle finding algorithm
public class LinkedListCycleStart {

    // Time Complexity - O(N), Space Complexity (1)
    public Node<Integer> findCycleStart(Node<Integer> head) {
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
        return findStart(head, cycleLength);
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

    private Node<Integer> findStart(Node<Integer> head, int cycleLength) {
        Node<Integer> fastPointer = head;
        Node<Integer> slowPointer = head;

        while (cycleLength > 0) {
            fastPointer = fastPointer.nextPointer;
            cycleLength--;
        }

        while (slowPointer != fastPointer) {
            slowPointer = slowPointer.nextPointer;
            fastPointer = fastPointer.nextPointer;
        }
        return fastPointer;
    }


    public Node<Integer> findCycleStartUsingMap(Node<Integer> head) {
        Map<Node<Integer>, Integer> map = new HashMap<>();
        Node<Integer> temp = head;
        while (null != temp) {
            if (map.containsKey(temp)) {
                break;
            }
            map.put(temp, temp.data);
            temp = temp.nextPointer;
        }
        return temp;
    }
}
