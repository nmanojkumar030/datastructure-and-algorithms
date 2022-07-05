package pattern.binarySearch;

class MaxInBitonicArray {
    public static int findMax(int[] inputArray) {
        int start = 0;
        int end = inputArray.length - 1;

        while (start < end) {
            int middle = (start + end) / 2;
            if (inputArray[middle] < inputArray[middle + 1]) {
                start = middle + 1;
            } else if (inputArray[middle] > inputArray[middle + 1]) {
                end = middle;
            }
        }
        return inputArray[start];
    }

    public static void main(String[] args) {
        System.out.println(MaxInBitonicArray.findMax(new int[]{1, 3, 8, 12, 4, 2}));
        System.out.println(MaxInBitonicArray.findMax(new int[]{3, 8, 3, 1}));
        System.out.println(MaxInBitonicArray.findMax(new int[]{1, 3, 8, 12}));
        System.out.println(MaxInBitonicArray.findMax(new int[]{10, 9, 8}));
    }
}
