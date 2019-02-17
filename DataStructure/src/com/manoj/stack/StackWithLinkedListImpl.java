/**
 *
 */
package com.manoj.stack;

/**
 * @author mnanjundegowda
 *
 */
public class StackWithLinkedListImpl {

	private StackNode top;

	private int length;

	/**
	 * StackNode
	 *
	 * @author mnanjundegowda
	 *
	 */
	private class StackNode {

		private int data;

		private StackNode nextRef;

		public StackNode(int data) {
			this.data = data;
		}
	}

	/**
	 * PUSH operation
	 *
	 * @param x
	 * @throws Exception
	 */
	public void push(int x) throws Exception {
		StackNode node = new StackNode(x);
		node.nextRef = top;
		top = node;
		length++;
	}

	/**
	 * POP operation
	 *
	 * @return
	 * @throws Exception
	 */
	public int pop() throws Exception {
		if (top == null) {
			throw new Exception("Stack is Empty");
		}
		int x = top.data;
		top = top.nextRef;
		length--;
		return x;
	}

	/**
	 * top
	 *
	 * @return
	 * @throws Exception
	 */
	public int top() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return top.data;
	}

	/**
	 * isEmpty
	 *
	 * @return
	 */
	public boolean isEmpty() {
		return length == 0 ? true : false;
	}
}
