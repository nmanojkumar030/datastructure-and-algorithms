package pattern.reverselinkedlist;

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

    static class LinkedListNode {
        private int data;
        private LinkedListNode next;

        public int getData() {
            return data;
        }

        public LinkedListNode getNext() {
            return next;
        }

        public void setNext(LinkedListNode next) {
            this.next = next;
        }

        public LinkedListNode(int data) {
            this.data = data;
        }
    }
}

