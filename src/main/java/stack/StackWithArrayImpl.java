
package stack;

/**
 * Stack based on Array
 */
public class StackWithArrayImpl<E> {

    private E[] data;
    private int top = -1;
    private final int MAX_CAPACITY = 10;

    public StackWithArrayImpl() {
        data = (E[]) new Object[10];
    }

    public void push(E x) throws Exception {
        if (top == MAX_CAPACITY) {
            throw new Exception("Stack Overflow Error");
        } else {
            data[++top] = x;
        }
    }

    public E pop() throws Exception {
        if (top == -1) {
            throw new Exception("Stack is Empty");
        }
        return data[top--];
    }

    public E top() throws Exception {
        if (top > -1) {
            return data[top];
        } else {
            throw new Exception("Stack is Empty");
        }
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == -1 ? true : false;
    }

}
