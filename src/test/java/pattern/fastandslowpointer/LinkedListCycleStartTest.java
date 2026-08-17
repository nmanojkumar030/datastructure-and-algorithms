package pattern.fastandslowpointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListCycleStartTest {

    // 1->2->3->4->5->3
    @Test
    public void testLinkedCycleStart() {
        LinkedListCycleStart linkedListCycleStart = new LinkedListCycleStart();
        Node<Integer> head = new Node<Integer>(1);
        head.nextPointer = new Node<Integer>(2);
        head.nextPointer.nextPointer = new Node<Integer>(3);
        head.nextPointer.nextPointer.nextPointer = new Node<Integer>(4);
        head.nextPointer.nextPointer.nextPointer.nextPointer = new Node<Integer>(5);

        head.nextPointer.nextPointer.nextPointer.nextPointer.nextPointer = head.nextPointer.nextPointer;

        Node<Integer> result = linkedListCycleStart.findCycleStartUsingMap(head);
        assertEquals(3, result.data);
    }
}