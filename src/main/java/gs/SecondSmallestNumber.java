package gs;

import java.util.PriorityQueue;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        int[] inputArray = new int[] { 4, 2, 1, 3, 5 };

        System.out.println(findSecondSmallestNumber(inputArray));
        System.out.println(findSecondSmallestNumberWithSorting(inputArray));
        System.out.println(findSecondSmallestNumberWithHeap(inputArray));
    }

    private static int findSecondSmallestNumber(int[] inputArray) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : inputArray) {
            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number > smallest && number < secondSmallest) {
                secondSmallest = number;
            }
        }

        return (secondSmallest == Integer.MAX_VALUE) ? -1 : secondSmallest;
    }

    private static int findSecondSmallestNumberWithSorting(int[] inputArray) {
        return java.util.Arrays.stream(inputArray).sorted().skip(1).findFirst().orElse(-1);
    }

    private static int findSecondSmallestNumberWithHeap(int[] inputArray) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < inputArray.length; i++) {
            minHeap.offer(inputArray[i]);
        }

        if (!minHeap.isEmpty()) {
            minHeap.poll();
        }

        int secondSmallest = minHeap.isEmpty() ? -1 : minHeap.poll();
        return secondSmallest;
    }
}
