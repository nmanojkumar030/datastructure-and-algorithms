package pattern.fastandslowpointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListCycleStartTest {

    // 1->2->3->4->5->3
    @Test
    public void testLinkedCycleStart() {
        LinkedListCycleStart linkedListCycleStart = new LinkedListCycleStart();
        Node head = new Node(1);
        head.nextPointer = new Node(2);
        head.nextPointer.nextPointer = new Node(3);
        head.nextPointer.nextPointer.nextPointer = new Node(4);
        head.nextPointer.nextPointer.nextPointer.nextPointer = new Node(5);

        head.nextPointer.nextPointer.nextPointer.nextPointer.nextPointer = head.nextPointer.nextPointer;

        Node result = linkedListCycleStart.findCycleStart(head);
        assertEquals(3, result.data);
    }
}