package arrays;

public class BinarySearch {

    public int search(int[] inputArray, int searchElement) {
        if (null == inputArray) {
            return -1;
        }

        boolean isAscendingOrder = true;
        if (inputArray.length > 1) {
            isAscendingOrder = (inputArray[0] <= inputArray[inputArray.length - 1]);
        }

        int start = 0;
        int end = inputArray.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (searchElement == inputArray[middle]) {
                return middle;
            }
            if (isAscendingOrder) {
                if (searchElement > inputArray[middle]) {
                    start = middle + 1;
                } else if (searchElement < inputArray[middle]) {
                    end = middle - 1;
                }
            } else {
                if (searchElement < inputArray[middle]) {
                    start = middle + 1;
                } else if (searchElement > inputArray[middle]) {
                    end = middle - 1;
                }
            }
        }
        return -1;
    }
}
