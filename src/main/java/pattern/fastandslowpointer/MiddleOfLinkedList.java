package pattern.fastandslowpointer;

import pattern.kwaymerge.ListNode;

/**
 * Problem Statement#
 * Given the head of a Singly LinkedList, write a method to return the middle node of the LinkedList.
 *
 * If the total number of nodes in the LinkedList is even, return the second middle node.
 *
 * Input: 1 -> 2 -> 3 -> 4 -> 5 -> null
 * Output: 3
 *
 * Input: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
 * Output: 4
 *
 * Input: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> null
 * Output: 4
 */
public class MiddleOfLinkedList {
    public static Node<Integer> findMiddle(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while (fast != null && fast.nextPointer != null) {
            slow = slow.nextPointer;
            fast = fast.nextPointer.nextPointer;
        }
        return slow;
    }

    static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        head.nextPointer = new Node<Integer>(2);
        head.nextPointer.nextPointer = new Node<Integer>(3);
        head.nextPointer.nextPointer.nextPointer = new Node<Integer>(4);
        head.nextPointer.nextPointer.nextPointer.nextPointer = new Node<Integer>(5);
        System.out.println("Middle Node: " + MiddleOfLinkedList.findMiddle(head).data);

        head.nextPointer.nextPointer.nextPointer.nextPointer.nextPointer = new Node<Integer>(6);
        System.out.println("Middle Node: " + MiddleOfLinkedList.findMiddle(head).data);

        head.nextPointer.nextPointer.nextPointer.nextPointer.nextPointer.nextPointer = new Node<Integer>(7);
        System.out.println("Middle Node: " + MiddleOfLinkedList.findMiddle(head).data);
    }
}
