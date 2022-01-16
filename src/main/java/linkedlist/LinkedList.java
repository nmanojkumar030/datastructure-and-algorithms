
package linkedlist;

public class LinkedList<E> {

    private Node head = null;
    private int length = 0;

    public int getLength() {
        return length;
    }

    public void insertAtBegin(E element) {
        Node<E> node = new Node<>(element);
        node.setNextPointer(head);
        head = node;
        length++;
    }

    public void insertAtEnd(E element) {
        Node<E> node = new Node<>(element);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.getNextPointer() != null) {
                temp = temp.getNextPointer();
            }
            temp.setNextPointer(node);
        }
        length++;
    }

    public void insertAtPosition(E element, int pos) {
        Node<E> node = new Node<>(element);
        if (pos < 0) {
            node.setNextPointer(head);
            head = node;
            length++;

        } else {
            if (pos > length) {
                Node temp = head;
                while (temp.getNextPointer() != null) {
                    temp = temp.getNextPointer();
                }
                temp.setNextPointer(node);
                length++;
            } else {
                Node temp = head;
                int index = 0;
                while (temp.getNextPointer() != null && pos != index) {
                    temp = temp.getNextPointer();
                }
                node.setNextPointer(temp.getNextPointer());
                temp.setNextPointer(node);
                length++;
            }
        }
    }

    public Node removeFromBegin() {
        Node temp = head.getNextPointer();
        temp = head;
        temp.setNextPointer(null);
        return temp;
    }

    /**
     * Node of Linked List
     */
    private static class Node<E> {
        private E data;
        private Node nextPointer;

        public Node(E data) {
            this.data = data;
        }

        public Node(E data, Node nextPointer) {
            this.data = data;
            this.nextPointer = nextPointer;
        }

        public void setData(E data) {
            this.data = data;
        }

        public void setNextPointer(Node nextPointer) {
            this.nextPointer = nextPointer;
        }

        public E getData() {
            return data;
        }

        public Node getNextPointer() {
            return nextPointer;
        }
    }
}