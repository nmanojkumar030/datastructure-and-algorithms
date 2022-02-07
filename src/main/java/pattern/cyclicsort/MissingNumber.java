package pattern.cyclicsort;

public class MissingNumber {

    public int findMissingNumber(int[] inputArray) {
        int index = 0;
        while (index < inputArray.length) {
            if (inputArray[index] < inputArray.length &&
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
