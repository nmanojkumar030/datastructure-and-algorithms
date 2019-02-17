/**
 *
 */
package com.manoj;

/**
 * @author mnanjundegowda
 *
 */
public class Print_the_elements_linkedlist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Node {
		int data;
		Node next;
	}

	void Print(Node head) {
		Node temp = head;
		while (null != temp) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	Node InsertAtTail(Node head, int data) {
		Node temp = head;
		Node prev = null;
		while (null != temp) {
			prev = temp;
			temp = temp.next;
		}
		Node node = new Node();
		node.data = data;
		prev.next = node;

		return head;
	}

	Node InsertAtHead(Node head, int x) {
		Node node = new Node();
		node.data = x;
		node.next = head;
		head = node;
		return head;
	}

	Node InsertAtGivenPosition(Node head, int data, int position) {
		Node temp = head;
		Node prev = null;
		int pos = -1;
		while (temp != null) {
			pos++;
			if (pos == position) {
				Node node = new Node();
				node.data = data;
				node.next = temp;
				prev.next = node;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
	}

}
