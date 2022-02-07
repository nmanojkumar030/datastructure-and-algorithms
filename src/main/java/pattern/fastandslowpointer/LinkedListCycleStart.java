package pattern.fastandslowpointer;

// Based on Floyd's cycle finding algorithm
public class LinkedListCycleStart {

    // Time Complexity - O(N), Space Complexity (1)
    public Node findCycleStart(Node head) {
        int cycleLength = 0;
        Node fastPointer = head;
        Node slowPointer = head;

        while (null != slowPointer && null != fastPointer.nextPointer) {
            fastPointer = fastPointer.nextPointer.nextPointer;
            slowPointer = slowPointer.nextPointer;

            if (slowPointer == fastPointer) {
                cycleLength = findLength(slowPointer);
                break;
            }
        }
        return findStart(head, cycleLength);
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

    private Node findStart(Node head, int cycleLength) {
        Node fastPointer = head;
        Node slowPointer = head;

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


}
