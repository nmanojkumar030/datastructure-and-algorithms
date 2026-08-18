package pattern.reverselinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseSubListTest {

    @Test
    void testReverseSubList() {
        LinkedListNode head = new LinkedListNode(1);
        head.setNext(new LinkedListNode(2));
        head.getNext().setNext(new LinkedListNode(3));
        head.getNext().getNext().setNext(new LinkedListNode(4));
        head.getNext().getNext().getNext().setNext(new LinkedListNode(5));

        ReverseSubList reverseSubList = new ReverseSubList();
        head = reverseSubList.reverseSubList(head, 2, 4);

        assertEquals(1, head.getData());
        assertEquals(4, head.getNext().getData());
        assertEquals(3, head.getNext().getNext().getData());
        assertEquals(2, head.getNext().getNext().getNext().getData());
        assertEquals(5, head.getNext().getNext().getNext().getNext().getData());
    }

    @Test
    void shouldReverseFromHeadWhenPIsOne() {
        LinkedListNode head = new LinkedListNode(1);
        head.setNext(new LinkedListNode(2));
        head.getNext().setNext(new LinkedListNode(3));
        head.getNext().getNext().setNext(new LinkedListNode(4));
        head.getNext().getNext().getNext().setNext(new LinkedListNode(5));

        ReverseSubList reverseSubList = new ReverseSubList();
        head = reverseSubList.reverseSubList(head, 1, 4);

        assertEquals(4, head.getData());
        assertEquals(3, head.getNext().getData());
        assertEquals(2, head.getNext().getNext().getData());
        assertEquals(1, head.getNext().getNext().getNext().getData());
        assertEquals(5, head.getNext().getNext().getNext().getNext().getData());
        assertNull(head.getNext().getNext().getNext().getNext().getNext());
    }

    @Test
    void shouldReverseToTailWhenQEqualsListLength() {
        LinkedListNode head = new LinkedListNode(1);
        head.setNext(new LinkedListNode(2));
        head.getNext().setNext(new LinkedListNode(3));
        head.getNext().getNext().setNext(new LinkedListNode(4));
        head.getNext().getNext().getNext().setNext(new LinkedListNode(5));

        ReverseSubList reverseSubList = new ReverseSubList();
        head = reverseSubList.reverseSubList(head, 2, 5);

        assertEquals(1, head.getData());
        assertEquals(5, head.getNext().getData());
        assertEquals(4, head.getNext().getNext().getData());
        assertEquals(3, head.getNext().getNext().getNext().getData());
        assertEquals(2, head.getNext().getNext().getNext().getNext().getData());
        assertNull(head.getNext().getNext().getNext().getNext().getNext());
    }

    @Test
    void shouldBeNoOpWhenPEqualsQ() {
        LinkedListNode head = new LinkedListNode(1);
        head.setNext(new LinkedListNode(2));
        head.getNext().setNext(new LinkedListNode(3));
        head.getNext().getNext().setNext(new LinkedListNode(4));
        head.getNext().getNext().getNext().setNext(new LinkedListNode(5));

        ReverseSubList reverseSubList = new ReverseSubList();
        head = reverseSubList.reverseSubList(head, 3, 3);

        assertEquals(1, head.getData());
        assertEquals(2, head.getNext().getData());
        assertEquals(3, head.getNext().getNext().getData());
        assertEquals(4, head.getNext().getNext().getNext().getData());
        assertEquals(5, head.getNext().getNext().getNext().getNext().getData());
        assertNull(head.getNext().getNext().getNext().getNext().getNext());
    }
}