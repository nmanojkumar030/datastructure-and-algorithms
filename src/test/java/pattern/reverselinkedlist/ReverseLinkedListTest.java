package pattern.reverselinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseLinkedListTest {

    @Test
    public void testReverse() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ReverseLinkedList.LinkedListNode head = new ReverseLinkedList.LinkedListNode(2);
        head.setNext(new ReverseLinkedList.LinkedListNode(4));
        head.getNext().setNext(new ReverseLinkedList.LinkedListNode(6));
        head.getNext().getNext().setNext(new ReverseLinkedList.LinkedListNode(8));
        head.getNext().getNext().getNext().setNext(new ReverseLinkedList.LinkedListNode(10));
        ReverseLinkedList.LinkedListNode reverseHead = reverseLinkedList.reverse(head);

        assertEquals(10, reverseHead.getData());
        assertEquals(8, reverseHead.getNext().getData());
        assertEquals(6, reverseHead.getNext().getNext().getData());
        assertEquals(4, reverseHead.getNext().getNext().getNext().getData());
        assertEquals(2, reverseHead.getNext().getNext().getNext().getNext().getData());
    }


}