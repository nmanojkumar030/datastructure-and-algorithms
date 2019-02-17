/**
 *
 */
package com.manoj;

/**
 * @author mnanjundegowda
 *
 */
public class Node {

	private int data;

	private Node nextPointer;

	/**
	 * @param data
	 * @param nextPointer
	 */
	public Node(int data, Node nextPointer) {
		super();
		this.data = data;
		this.nextPointer = nextPointer;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @param nextPointer
	 *            the nextPointer to set
	 */
	public void setNextPointer(Node nextPointer) {
		this.nextPointer = nextPointer;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @return the nextPointer
	 */
	public Node getNextPointer() {
		return nextPointer;
	}

	/**
	 *
	 * @param head
	 * @return
	 */
	public int getListLength(Node head) {
		int length = 0;

		Node currentNode = head;
		while (currentNode != null) {
			length++;
			currentNode = currentNode.getNextPointer();
		}
		return length;
	}

}
