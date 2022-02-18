package pattern.reverselinkedlist;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/3wENz1N4WW9
 * Given the head of a Singly LinkedList, reverse the LinkedList.
 * Write a function to return the new head of the reversed LinkedList.
 */
public class ReverseLinkedList {

    public LinkedListNode reverse(LinkedListNode head) {
        LinkedListNode currentNode = head;
        LinkedListNode previousNode = null;
        LinkedListNode nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.getNext();
            currentNode.setNext(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }
}

