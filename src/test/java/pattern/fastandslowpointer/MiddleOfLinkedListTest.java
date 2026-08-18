package pattern.fastandslowpointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiddleOfLinkedListTest {

    @Test
    void findMiddleShouldReturnMiddleNodeForOddLengthList() {
        Node<Integer> head = new Node<>(1);
        head.nextPointer = new Node<>(2);
        head.nextPointer.nextPointer = new Node<>(3);
        head.nextPointer.nextPointer.nextPointer = new Node<>(4);
        head.nextPointer.nextPointer.nextPointer.nextPointer = new Node<>(5);

        assertEquals(3, MiddleOfLinkedList.findMiddle(head).data);
    }

    @Test
    void findMiddleShouldReturnSecondMiddleNodeForEvenLengthList() {
        Node<Integer> head = new Node<>(1);
        head.nextPointer = new Node<>(2);
        head.nextPointer.nextPointer = new Node<>(3);
        head.nextPointer.nextPointer.nextPointer = new Node<>(4);
        head.nextPointer.nextPointer.nextPointer.nextPointer = new Node<>(5);
        head.nextPointer.nextPointer.nextPointer.nextPointer.nextPointer = new Node<>(6);

        assertEquals(4, MiddleOfLinkedList.findMiddle(head).data);
    }

    @Test
    void findMiddleShouldReturnHeadForSingleNodeList() {
        Node<Integer> head = new Node<>(1);
        assertEquals(1, MiddleOfLinkedList.findMiddle(head).data);
    }

    @Test
    void findMiddleShouldReturnSecondNodeForTwoNodeList() {
        Node<Integer> head = new Node<>(1);
        head.nextPointer = new Node<>(2);

        assertEquals(2, MiddleOfLinkedList.findMiddle(head).data);
    }
}
