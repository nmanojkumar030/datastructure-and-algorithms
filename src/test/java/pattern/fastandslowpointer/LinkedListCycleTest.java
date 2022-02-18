package pattern.fastandslowpointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListCycleTest {

    @Test
    public void testLinkedListCycle() {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        Node head = new Node(1);
        head.nextPointer = new Node(2);
        head.nextPointer.nextPointer = new Node(3);
        head.nextPointer.nextPointer.nextPointer = new Node(4);
        head.nextPointer.nextPointer.nextPointer.nextPointer = new Node(5);

        head.nextPointer.nextPointer.nextPointer.nextPointer.nextPointer = head.nextPointer.nextPointer;

        boolean result = linkedListCycle.hasCycle(head);
        assertEquals(true, result);
    }


    @Test
    public void testLinkedListCycleWithHashMap() {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        Node head = new Node(1);
        head.nextPointer = new Node(2);
        head.nextPointer.nextPointer = new Node(3);
        head.nextPointer.nextPointer.nextPointer = new Node(4);
        head.nextPointer.nextPointer.nextPointer.nextPointer = new Node(5);

        head.nextPointer.nextPointer.nextPointer.nextPointer.nextPointer = head.nextPointer.nextPointer;

        boolean result = linkedListCycle.hasCycleWithHashMap(head);
        assertEquals(true, result);
    }

    @Test
    public void testLinkedListCycleLength() {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        Node head = new Node(1);
        head.nextPointer = new Node(2);
        head.nextPointer.nextPointer = new Node(3);
        head.nextPointer.nextPointer.nextPointer = new Node(4);
        head.nextPointer.nextPointer.nextPointer.nextPointer = new Node(5);

        head.nextPointer.nextPointer.nextPointer.nextPointer.nextPointer = head.nextPointer.nextPointer;

        int result = linkedListCycle.findCycleLength(head);
        assertEquals(3, result);
    }
}
