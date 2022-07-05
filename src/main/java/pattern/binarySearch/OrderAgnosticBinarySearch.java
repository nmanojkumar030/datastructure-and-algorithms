package pattern.binarySearch;

/**
 * Given a sorted array of numbers, find if a given number ‘key’ is present in the array.
 * Though we know that the array is sorted, we don’t know if it’s sorted in ascending or descending order.
 * You should assume that the array can have duplicates.
 * <p>
 * Input: [4, 6, 10], key = 10
 * Output: 2
 * <p>
 * Input: [1, 2, 3, 4, 5, 6, 7], key = 5
 * Output: 4
 * <p>
 * Input: [10, 6, 4], key = 10
 * Output: 0
 * <p>
 * Input: [10, 6, 4], key = 4
 * Output: 2
 */
public class OrderAgnosticBinarySearch {

    public static int search(int[] inputArray, int searchElement) {
        if (null == inputArray) {
            return -1;
        }

        boolean isAscendingOrder = isAscendingOrder(inputArray);

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

    private static boolean isAscendingOrder(int[] inputArray) {
        boolean isAscendingOrder = true;
        if (inputArray.length > 1) {
            isAscendingOrder = (inputArray[0] <= inputArray[inputArray.length - 1]);
        }
        return isAscendingOrder;
    }

    public static void main(String[] args) {
        System.out.println(OrderAgnosticBinarySearch.search(new int[]{4, 6, 10}, 10));
        System.out.println(OrderAgnosticBinarySearch.search(new int[]{1, 2, 3, 4, 5, 6, 7}, 5));
        System.out.println(OrderAgnosticBinarySearch.search(new int[]{10, 6, 4}, 10));
        System.out.println(OrderAgnosticBinarySearch.search(new int[]{10, 6, 4}, 4));
    }
}
