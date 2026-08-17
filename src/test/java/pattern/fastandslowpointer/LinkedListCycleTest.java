package pattern.fastandslowpointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListCycleTest {

    @Test
    public void testLinkedListCycle() {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        Node<Integer> head = new Node<Integer>(1);
        head.nextPointer = new Node<Integer>(2);
        head.nextPointer.nextPointer = new Node<Integer>(3);
        head.nextPointer.nextPointer.nextPointer = new Node<Integer>(4);
        head.nextPointer.nextPointer.nextPointer.nextPointer = new Node<Integer>(5);

        head.nextPointer.nextPointer.nextPointer.nextPointer.nextPointer = head.nextPointer.nextPointer;

        boolean result = linkedListCycle.hasCycle(head);
        assertTrue(result);
    }


    @Test
    public void testLinkedListCycleWithHashMap() {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        Node<Integer> head = new Node<Integer>(1);
        head.nextPointer = new Node<Integer>(2);
        head.nextPointer.nextPointer = new Node<Integer>(3);
        head.nextPointer.nextPointer.nextPointer = new Node<Integer>(4);
        head.nextPointer.nextPointer.nextPointer.nextPointer = new Node<Integer>(5);

        head.nextPointer.nextPointer.nextPointer.nextPointer.nextPointer = head.nextPointer.nextPointer;

        boolean result = linkedListCycle.hasCycleWithHashMap(head);
        assertTrue(result);
    }

    @Test
    public void testLinkedListCycleLength() {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        Node<Integer> head = new Node<Integer>(1);
        head.nextPointer = new Node<Integer>(2);
        head.nextPointer.nextPointer = new Node<Integer>(3);
        head.nextPointer.nextPointer.nextPointer = new Node<Integer>(4);
        head.nextPointer.nextPointer.nextPointer.nextPointer = new Node<Integer>(5);

        head.nextPointer.nextPointer.nextPointer.nextPointer.nextPointer = head.nextPointer.nextPointer;

        int result = linkedListCycle.findCycleLength(head);
        assertEquals(3, result);
    }
}
