package pattern.cyclicsort;

/**
 * Problem Statement#
 * We are given an array containing n distinct numbers taken from the range 0 to n.
 * Since the array has only n numbers out of the total n+1 numbers, find the missing number.
 * <p>
 * Input: [4, 0, 3, 1]
 * Output: 2
 * <p>
 * Input: [8, 3, 5, 2, 4, 6, 0, 1]
 * Output: 7
 */
public class MissingNumber {

    public int findMissingNumber(int[] inputArray) {
        int index = 0;
        while (index < inputArray.length) {
            if (inputArray[index] < inputArray.length && // within bound
                    inputArray[index] != inputArray[inputArray[index]]) {
                swap(inputArray, index, inputArray[index]);
            } else {
                index++;
            }
        }

        for (index = 0; index < inputArray.length; index++) {
            if (inputArray[index] != index) {
                break;
            }
        }
        return index;
    }

    private void swap(int[] inputArray, int i, int j) {
        int temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }
}
