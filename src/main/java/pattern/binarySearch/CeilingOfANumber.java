package pattern.binarySearch;

public class CeilingOfANumber {

    public static void main(String[] args) {
        System.out.println(CeilingOfANumber.searchCeilingOfANumber(new int[]{4, 6, 10}, 6));
        System.out.println(CeilingOfANumber.searchCeilingOfANumber(new int[]{1, 3, 8, 10, 15}, 12));
        System.out.println(CeilingOfANumber.searchCeilingOfANumber(new int[]{4, 6, 10}, 17));
        System.out.println(CeilingOfANumber.searchCeilingOfANumber(new int[]{4, 6, 10}, -1));
    }

    public static int searchCeilingOfANumber(int[] inputArray, int searchElement) {
        if (null == inputArray) {
            return -1;
        }

        if (searchElement > inputArray[inputArray.length - 1]) {
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
                if (searchElement > inputArray[middle]) {
                    end = middle - 1;
                } else if (searchElement < inputArray[middle]) {
                    start = middle + 1;
                }
            }
        }
        return start;
    }

    private static boolean isAscendingOrder(int[] inputArray) {
        boolean isAscendingOrder = true;
        if (inputArray.length > 1) {
            isAscendingOrder = (inputArray[0] <= inputArray[inputArray.length - 1]);
        }
        return isAscendingOrder;
    }
}

