package pattern.reverselinkedlist;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/qVANqMonoB2
 * Given the head of a LinkedList and two positions ‘p’ and ‘q’, reverse the LinkedList from position ‘p’ to ‘q’.
 */
public class ReverseSubList {

    public LinkedListNode reverseSubList(LinkedListNode head, int p, int q) {
        LinkedListNode currentNode = head;
        LinkedListNode previousNode = null;
        for (int i = 1; currentNode != null && i < p; i++) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        LinkedListNode pMinusOneNode = previousNode;
        LinkedListNode endOfSubList = currentNode;

        LinkedListNode nextNode = null;
        for (int i = p; currentNode != null && i <= q; i++) {
            nextNode = currentNode.getNext();
            currentNode.setNext(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }

        pMinusOneNode.setNext(previousNode);
        endOfSubList.setNext(currentNode);
        return head;
    }

}
