package bubblesort;

public class ArrayBub {

	private int[] array;

	private int nElements;

	public ArrayBub(int maxSize) {
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

	public void bubblesort() {
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

	public void bubbleSort_Efficient() {
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
