package pattern.fastandslowpointer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLinkedListCycle {

    @Test
    public void testLinkedListCycle() {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        LinkedListCycle.Node head = linkedListCycle.new Node(1);
        head.nextPointer = linkedListCycle.new Node(2);
        head.nextPointer.nextPointer = linkedListCycle.new Node(3);
        head.nextPointer.nextPointer.nextPointer = linkedListCycle.new Node(4);
        head.nextPointer.nextPointer.nextPointer.nextPointer = linkedListCycle.new Node(5);

        head.nextPointer.nextPointer.nextPointer.nextPointer.nextPointer = head.nextPointer.nextPointer;

        boolean result = linkedListCycle.hasCycle(head);
        assertEquals(true, result);
    }


    @Test
    public void testLinkedListCycleWithHashMap() {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        LinkedListCycle.Node head = linkedListCycle.new Node(1);
        head.nextPointer = linkedListCycle.new Node(2);
        head.nextPointer.nextPointer = linkedListCycle.new Node(3);
        head.nextPointer.nextPointer.nextPointer = linkedListCycle.new Node(4);
        head.nextPointer.nextPointer.nextPointer.nextPointer = linkedListCycle.new Node(5);

        head.nextPointer.nextPointer.nextPointer.nextPointer.nextPointer = head.nextPointer.nextPointer;

        boolean result = linkedListCycle.hasCycleWithHashMap(head);
        assertEquals(true, result);
    }

    @Test
    public void testLinkedListCycleLength() {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        LinkedListCycle.Node head = linkedListCycle.new Node(1);
        head.nextPointer = linkedListCycle.new Node(2);
        head.nextPointer.nextPointer = linkedListCycle.new Node(3);
        head.nextPointer.nextPointer.nextPointer = linkedListCycle.new Node(4);
        head.nextPointer.nextPointer.nextPointer.nextPointer = linkedListCycle.new Node(5);

        head.nextPointer.nextPointer.nextPointer.nextPointer.nextPointer = head.nextPointer.nextPointer;

        int result = linkedListCycle.findCycleLength(head);
        assertEquals(3, result);
    }
}
