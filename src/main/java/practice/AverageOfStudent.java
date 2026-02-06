package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageOfStudent {
    public static void main(String[] args) {
        String[][] marksOfStudents = new String[][]{
                {"Charles", "65"},
                {"David", "100"},
                {"John", "70"},
                {"Charles", "61"}};
        double maxAverage = calculateAverageOfEachStudent(marksOfStudents);
        System.out.println(maxAverage);
    }

    private static double calculateAverageOfEachStudent(String[][] marksOfStudents) {
        Map<String, Double> averageOfEachStudent = Arrays.stream(marksOfStudents)
                .collect(Collectors.groupingBy(
                        arr -> arr[0],
                        Collectors.averagingDouble(arr -> Double.parseDouble(arr[1]))));

        averageOfEachStudent.forEach((key, value) -> System.out.println(key + " : " + value));

        return averageOfEachStudent.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getValue)
                .orElse(0.0);
    }
}
