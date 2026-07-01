
package datastructures.stack;

public class StackWithLinkedListImpl<E> {

    private StackNode<E> top;
    private int length;

    public void push(E x) {
        StackNode<E> node = new StackNode<>(x);
        node.nextRef = top;
        top = node;
        length++;
    }

    public E pop() throws Exception {
        if (top == null) {
            throw new Exception("Stack is Empty");
        }
        E x = top.data;
        top = top.nextRef;
        length--;
        return x;
    }

    public E peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    private static class StackNode<E> {

        private final E data;

        private StackNode<E> nextRef;

        public StackNode(E data) {
            this.data = data;
        }
    }

}
