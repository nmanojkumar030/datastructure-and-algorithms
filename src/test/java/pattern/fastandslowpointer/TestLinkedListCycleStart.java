package pattern.fastandslowpointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestLinkedListCycleStart {

    // 1->2->3->4->5->3
    @Test
    public void testLinkedCycleStart() {
        LinkedListCycleStart linkedListCycleStart = new LinkedListCycleStart();
        LinkedListCycleStart.Node head = new LinkedListCycleStart.Node(1);
        head.nextPointer = new LinkedListCycleStart.Node(2);
        head.nextPointer.nextPointer = new LinkedListCycleStart.Node(3);
        head.nextPointer.nextPointer.nextPointer = new LinkedListCycleStart.Node(4);
        head.nextPointer.nextPointer.nextPointer.nextPointer = new LinkedListCycleStart.Node(5);

        head.nextPointer.nextPointer.nextPointer.nextPointer.nextPointer = head.nextPointer.nextPointer;

        LinkedListCycleStart.Node result = linkedListCycleStart.findCycleStart(head);
        assertEquals(3, result.data);
    }
}