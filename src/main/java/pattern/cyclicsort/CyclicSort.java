package pattern.cyclicsort;

public class CyclicSort {

    // Overall complexity O(N)
    public void sort(int[] inputArray) {
        int arrayIndex = 0;
        while (arrayIndex < inputArray.length) {
            if ((arrayIndex + 1) == inputArray[arrayIndex]) {
                arrayIndex++;
                continue;
            } else {
                int temp = inputArray[arrayIndex];
                inputArray[arrayIndex] = inputArray[temp - 1];
                inputArray[temp - 1] = temp;
            }
        }
    }
}
