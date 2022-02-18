package pattern.reverselinkedlist;

public class LinkedListNode {
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
