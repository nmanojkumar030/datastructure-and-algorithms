package pattern.reverselinkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestReverseLinkedList {

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
    }


}