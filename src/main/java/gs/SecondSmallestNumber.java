package gs;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        int[] inputArray = new int[]{4, 2, 1, 3, 5};
        int secondSmallestNumber = findSecondSmallestNumber(inputArray);
        System.out.println(secondSmallestNumber);
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
}
