
package datastructures.linkedlist;

public class LinkedList<E> {

    private Node<E> head = null;
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
            Node<E> temp = head;
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
                Node<E> temp = head;
                while (temp.getNextPointer() != null) {
                    temp = temp.getNextPointer();
                }
                temp.setNextPointer(node);
                length++;
            } else {
                Node<E> temp = head;
                int index = 0;
                while (temp.getNextPointer() != null && pos != index) {
                    temp = temp.getNextPointer();
                    index++;
                }
                node.setNextPointer(temp.getNextPointer());
                temp.setNextPointer(node);
                length++;
            }
        }
    }

    public void removeFromBegin() {
        Node<E> temp = head.getNextPointer();
        temp = head;
        temp.setNextPointer(null);
    }

    /**
     * Node of Linked List
     */
    private static class Node<E> {
        private E data;
        private Node<E> nextPointer;

        public Node(E data) {
            this.data = data;
        }

        public Node(E data, Node<E> nextPointer) {
            this.data = data;
            this.nextPointer = nextPointer;
        }

        public void setData(E data) {
            this.data = data;
        }

        public void setNextPointer(Node<E> nextPointer) {
            this.nextPointer = nextPointer;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNextPointer() {
            return nextPointer;
        }
    }
}
