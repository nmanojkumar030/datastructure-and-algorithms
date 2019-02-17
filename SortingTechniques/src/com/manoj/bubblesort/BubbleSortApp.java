package com.manoj.bubblesort;

public class BubbleSortApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayBub arrayBub = new ArrayBub(100);

		arrayBub.insert(10);
		arrayBub.insert(9);
		arrayBub.insert(8);
		arrayBub.insert(7);
		arrayBub.insert(6);
		arrayBub.insert(5);
		arrayBub.insert(4);
		arrayBub.insert(3);
		arrayBub.insert(2);
		arrayBub.insert(1);

		arrayBub.display();

		arrayBub.bubblesort();

		arrayBub.display();

	}

}
