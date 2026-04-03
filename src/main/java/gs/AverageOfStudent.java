package gs;

import java.util.*;
import java.util.stream.Collectors;

public class AverageOfStudent {
    public static void main(String[] args) {
        String[][] studentArray = new String[][]{
                {"Charles", "65"},
                {"David", "100"},
                {"John", "70"},
                {"Charles", "61"}};
        double average = calculateAverage(studentArray);
        System.out.println("Maximum Average : " + average);

        String[][] marksOfStudents = new String[][]{
                {"Charles", "65"},
                {"David", "100"},
                {"John", "70"},
                {"Charles", "61"}};
        double maxAverage = calculateAverageOfEachStudent(marksOfStudents);
        System.out.println("Maximum Average : " + maxAverage);
    }

    private static double calculateAverage(String[][] studentArray) {
        Map<String, List<Integer>> studentMarksMap = getStringListMap(studentArray);

        Map<String, Double> studentAverageMarks = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : studentMarksMap.entrySet()) {
            studentAverageMarks.put(entry.getKey(), (entry.getValue().stream().reduce(0, (a, b) -> {
                return a + b;
            }).doubleValue() / entry.getValue().size()));
        }

        for (Map.Entry<String, Double> student : studentAverageMarks.entrySet()) {
            System.out.println(student.getKey() + " -- " + student.getValue());
        }

        Double maxAverage = 0.0;
        for (Map.Entry<String, Double> student : studentAverageMarks.entrySet()) {
            if (student.getValue() >= maxAverage) {
                maxAverage = Math.max(student.getValue(), maxAverage);
            }
        }
        return maxAverage;
    }

    private static Map<String, List<Integer>> getStringListMap(String[][] studentArray) {
        Map<String, List<Integer>> studentMarksMap = new HashMap<>();
        for (String[] row : studentArray) {
            studentMarksMap.computeIfPresent(row[0], (studentName, marksList) -> {
                marksList.add(Integer.parseInt(row[1]));
                return marksList;
            });

            studentMarksMap.computeIfAbsent(row[0], (key) -> {
                List<Integer> marksList = new ArrayList<>();
                marksList.add(Integer.parseInt(row[1]));
                return marksList;
            });
        }
        return studentMarksMap;
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
