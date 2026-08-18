
package datastructures.linkedlist;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {

    @Test
    public void testCreateNewLinkedList() {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.insertAtEnd("Hello");
        linkedList.insertAtEnd("World");

        assertEquals(2, linkedList.getLength());
    }

    @Test
    public void testLinkedListInsertAtBegin() {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.insertAtEnd("World");
        linkedList.insertAtBegin("Hello");
        assertEquals(2, linkedList.getLength());
    }

    @Test
    public void testEmptyListHasZeroLength() {
        LinkedList<String> linkedList = new LinkedList<String>();
        assertEquals(0, linkedList.getLength());
    }

    @Test
    public void testInsertAtPositionInMiddle() {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.insertAtEnd("A");
        linkedList.insertAtEnd("C");
        linkedList.insertAtPosition("B", 1);

        assertEquals(3, linkedList.getLength());
    }

    @Test
    public void testInsertAtPositionEqualToLengthAppends() {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.insertAtEnd("A");
        linkedList.insertAtPosition("B", 1);

        assertEquals(2, linkedList.getLength());
    }

    @Test
    public void testInsertAtPositionBeyondLengthAppends() {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.insertAtEnd("A");
        linkedList.insertAtPosition("B", 100);

        assertEquals(2, linkedList.getLength());
    }

    @Test
    public void testInsertAtNegativePositionPrepends() {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.insertAtEnd("A");
        linkedList.insertAtPosition("B", -1);

        assertEquals(2, linkedList.getLength());
    }

    @Test
    public void testRemoveFromBeginOnSingleElementListEmptiesIt() {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.insertAtEnd("A");
        linkedList.removeFromBegin();

        assertEquals(0, linkedList.getLength());
    }

    @Test
    public void testRemoveFromBeginDecrementsLengthAndKeepsRemainder() {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.insertAtEnd("A");
        linkedList.insertAtEnd("B");
        linkedList.insertAtEnd("C");
        linkedList.removeFromBegin();

        assertEquals(2, linkedList.getLength());

        linkedList.removeFromBegin();
        assertEquals(1, linkedList.getLength());

        linkedList.removeFromBegin();
        assertEquals(0, linkedList.getLength());
    }

    @Test
    public void testRemoveFromBeginOnEmptyListIsNoOp() {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.removeFromBegin();

        assertEquals(0, linkedList.getLength());
    }

}
