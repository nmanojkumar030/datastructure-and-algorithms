package pattern.fastandslowpointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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

    // 1->2->3->4->5->null
    @Test
    public void testHasCycleReturnsFalseWhenThereIsNoCycle() {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        Node<Integer> head = new Node<Integer>(1);
        head.nextPointer = new Node<Integer>(2);
        head.nextPointer.nextPointer = new Node<Integer>(3);
        head.nextPointer.nextPointer.nextPointer = new Node<Integer>(4);
        head.nextPointer.nextPointer.nextPointer.nextPointer = new Node<Integer>(5);

        assertFalse(linkedListCycle.hasCycle(head));
        assertFalse(linkedListCycle.hasCycleWithHashMap(head));
        assertEquals(0, linkedListCycle.findCycleLength(head));
    }

    // 1->2->3->1 (cycle starts at head)
    @Test
    public void testHasCycleReturnsTrueWhenCycleStartsAtHead() {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        Node<Integer> head = new Node<Integer>(1);
        head.nextPointer = new Node<Integer>(2);
        head.nextPointer.nextPointer = new Node<Integer>(3);
        head.nextPointer.nextPointer.nextPointer = head;

        assertTrue(linkedListCycle.hasCycle(head));
        assertTrue(linkedListCycle.hasCycleWithHashMap(head));
        assertEquals(3, linkedListCycle.findCycleLength(head));
    }
}
