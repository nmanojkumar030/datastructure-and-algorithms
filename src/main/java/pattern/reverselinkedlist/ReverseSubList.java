package pattern.reverselinkedlist;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/qVANqMonoB2
 * Given the head of a LinkedList and two positions ‘p’ and ‘q’, reverse the LinkedList from position ‘p’ to ‘q’.
 *
 * Similar Questions
 * Problem 1: Reverse the first ‘k’ elements of a given LinkedList.
 * Solution: This problem can be easily converted to our parent problem; to reverse the first ‘k’ nodes of the list, we need to pass p=1 and q=k.
 *
 *
 * Problem 2: Given a LinkedList with ‘n’ nodes, reverse it based on its size in the following way:
 * If ‘n’ is even, reverse the list in a group of n/2 nodes.
 * If n is odd, keep the middle node as it is, reverse the first ‘n/2’ nodes and reverse the last ‘n/2’ nodes.
 *
 * Solution: When ‘n’ is even we can perform the following steps:
 *
 * Reverse first ‘n/2’ nodes: head = reverse(head, 1, n/2)
 * Reverse last ‘n/2’ nodes: head = reverse(head, n/2 + 1, n)
 * When ‘n’ is odd, our algorithm will look like:
 *
 * head = reverse(head, 1, n/2)
 * head = reverse(head, n/2 + 2, n)
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
