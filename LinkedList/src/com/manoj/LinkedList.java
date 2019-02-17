/**
 *
 */
package com.manoj;

/**
 * @author mnanjundegowda
 *
 */
public class LinkedList {

	private Node head = null;

	private int length = 0;

	/**
	 * @return the head
	 */
	public Node getHead() {
		return head;
	}

	/**
	 * @param head
	 *            the head to set
	 */
	public void setHead(Node head) {
		this.head = head;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length
	 *            the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * To get Length of linked list
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

	/**
	 * Insert node at the begining of the list
	 *
	 * @param node
	 */
	public void insertAtBegin(Node node) {
		node.setNextPointer(head);
		head = node;
		length++;
	}

	public void insertAtEnd(Node node) {

		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.nextPointer != null) {
				temp = temp.getNextPointer();
			}

			temp.setNextPointer(node);
			node.setNextPointer(null);
		}
		length++;
	}

	/**
	 * insertAtPosition
	 *
	 * @param node
	 * @param pos
	 */
	public void insertAtPosition(Node node, int pos) {
		if (pos < 0) {
			node.setNextPointer(head);
			head = node;
			length++;

		} else {
			if (pos > length) {
				Node temp = head;
				while (temp.nextPointer != null) {
					temp = temp.getNextPointer();
				}
				temp.setNextPointer(node);
				node.setNextPointer(null);
				length++;
			} else {
				Node temp = head;
				int index = 0;
				while (temp.nextPointer != null && pos != index) {
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
	 *
	 * @author mnanjundegowda
	 *
	 */
	class Node {

		private int data;

		private Node nextPointer;

		/**
		 * @param data
		 * @param nextPointer
		 */
		public Node(int data, Node nextPointer) {
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
	}
}
