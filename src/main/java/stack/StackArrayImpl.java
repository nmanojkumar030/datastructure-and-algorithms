/**
 *
 */
package stack;

/**
 * @author mnanjundegowda
 *
 */
public class StackArrayImpl {

	private int[] data;

	private int top = -1;

	private final int MAX_CAPACITY = 10;

	public StackArrayImpl() {
		data = new int[10];
	}

	/**
	 * PUSH operation
	 *
	 * @param x
	 * @throws Exception
	 */
	public void push(int x) throws Exception {
		if (top == MAX_CAPACITY) {
			throw new Exception("Stack Overflow Error");
		} else {
			data[++top] = x;
		}
	}

	/**
	 * POP operation
	 *
	 * @return
	 * @throws Exception
	 */
	public int pop() throws Exception {
		if (top == -1) {
			throw new Exception("Stack is Empty");
		}
		return data[top--];
	}

	public int top() throws Exception {
		if (top > -1) {
			return data[top];
		} else {
			throw new Exception("Stack is Empty");
		}

	}

	/**
	 * SIZE
	 *
	 * @return
	 */
	public int size() {
		return top;
	}

	/**
	 * ISEMPTY
	 *
	 * @return
	 */
	public boolean isEmpty() {
		return top == -1 ? true : false;
	}

}
