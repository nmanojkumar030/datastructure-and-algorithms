package pattern.reverselinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseLinkedListTest {

    @Test
    public void testReverse() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        LinkedListNode head = new LinkedListNode(2);
        head.setNext(new LinkedListNode(4));
        head.getNext().setNext(new LinkedListNode(6));
        head.getNext().getNext().setNext(new LinkedListNode(8));
        head.getNext().getNext().getNext().setNext(new LinkedListNode(10));
        LinkedListNode reverseHead = reverseLinkedList.reverse(head);

        assertEquals(10, reverseHead.getData());
        assertEquals(8, reverseHead.getNext().getData());
        assertEquals(6, reverseHead.getNext().getNext().getData());
        assertEquals(4, reverseHead.getNext().getNext().getNext().getData());
        assertEquals(2, reverseHead.getNext().getNext().getNext().getNext().getData());
        assertNull(reverseHead.getNext().getNext().getNext().getNext().getNext());
    }

    @Test
    public void testReverseWithNullHead() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        LinkedListNode reverseHead = reverseLinkedList.reverse(null);
        assertNull(reverseHead);
    }

    @Test
    public void testReverseWithSingleNode() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode reverseHead = reverseLinkedList.reverse(head);

        assertEquals(1, reverseHead.getData());
        assertNull(reverseHead.getNext());
    }

    @Test
    public void testReverseWithTwoNodes() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        LinkedListNode head = new LinkedListNode(1);
        head.setNext(new LinkedListNode(2));
        LinkedListNode reverseHead = reverseLinkedList.reverse(head);

        assertEquals(2, reverseHead.getData());
        assertEquals(1, reverseHead.getNext().getData());
        assertNull(reverseHead.getNext().getNext());
    }
}