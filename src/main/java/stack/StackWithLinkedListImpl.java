
package stack;

public class StackWithLinkedListImpl<E> {

    private StackNode<E> top;
    private int length;

    public void push(E x) throws Exception {
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

    public E top() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return length == 0 ? true : false;
    }

    private class StackNode<E> {

        private E data;

        private StackNode nextRef;

        public StackNode(E data) {
            this.data = data;
        }
    }

}
