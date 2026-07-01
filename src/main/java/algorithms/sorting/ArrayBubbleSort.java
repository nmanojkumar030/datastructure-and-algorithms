package algorithms.sorting;

public class ArrayBubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayBubbleSort arrayBubbleSort = new ArrayBubbleSort(100);

		arrayBubbleSort.insert(10);
		arrayBubbleSort.insert(9);
		arrayBubbleSort.insert(8);
		arrayBubbleSort.insert(7);
		arrayBubbleSort.insert(6);
		arrayBubbleSort.insert(5);
		arrayBubbleSort.insert(4);
		arrayBubbleSort.insert(3);
		arrayBubbleSort.insert(2);
		arrayBubbleSort.insert(1);

		arrayBubbleSort.display();

		arrayBubbleSort.bubbleSort();

		arrayBubbleSort.display();

	}

	private int[] array;

	private int nElements;

	public ArrayBubbleSort(int maxSize) {
		array = new int[maxSize];
		nElements = 0;
	}

	public void insert(int item) {
		array[nElements] = item;
		nElements++;
	}

	public void display() {
		for (int i = 0; i < nElements; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public void bubbleSort() {
		for (int i = 0; i < nElements; i++) {
			for (int j = 0; j < nElements - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public void bubbleSortEfficient() {
		for (int i = nElements - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

}
