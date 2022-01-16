
package linkedlist;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLinkedList {

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

}
