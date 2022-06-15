package pattern.cyclicsort;

/**
 * Problem Statement#
 * We are given an array containing n objects. Each object,
 * when created, was assigned a unique number from the range 1 to n based on their creation sequence.
 * This means that the object with sequence number 3 was created just before the object with sequence number 4.
 * <p>
 * Write a function to sort the objects in-place on their creation sequence number in O(n)
 * and without using any extra space. For simplicity, let’s assume we are passed an integer
 * array containing only the sequence numbers, though each number is actually an object.
 * <p>
 * Input: [3, 1, 5, 4, 2]
 * Output: [1, 2, 3, 4, 5]
 * <p>
 * Input: [2, 6, 4, 3, 1, 5]
 * Output: [1, 2, 3, 4, 5, 6]
 * <p>
 * Input: [1, 5, 6, 4, 3, 2]
 * Output: [1, 2, 3, 4, 5, 6]
 */
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
