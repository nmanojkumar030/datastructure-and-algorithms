package practice.math;

import java.util.*;
import java.util.stream.Collectors;

public class AverageOfStudent {
    static void main(String[] args) {
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
        Map<String, List<Integer>> studentMarksMap = new HashMap<>();

        for (String[] row : studentArray) {
            studentMarksMap.computeIfAbsent(row[0], (key) -> {
                List<Integer> marksList = new ArrayList<>();
                marksList.add(Integer.parseInt(row[1]));
                return marksList;
            });

            List<Integer> marks = studentMarksMap.get(row[0]);
            marks.add(Integer.parseInt(row[1]));
            studentMarksMap.put(row[0], marks);
        }

        Map<String, Double> studentAverageMarks = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : studentMarksMap.entrySet()) {
            studentAverageMarks.put(entry.getKey(), (entry.getValue().stream().reduce(0, (a, b) -> {
                return a + b;
            }).doubleValue() / entry.getValue().size()));
        }

        Double maxAverage = 0.0;
        for (Map.Entry<String, Double> student : studentAverageMarks.entrySet()) {
            if (student.getValue() >= maxAverage) {
                maxAverage = Math.max(student.getValue(), maxAverage);
            }
        }
        return maxAverage;
    }

    private static double calculateAverageOfEachStudent(String[][] marksOfStudents) {
        Map<String, Double> averageOfEachStudent = Arrays.stream(marksOfStudents)
                .collect(Collectors.groupingBy(
                        arr -> arr[0],
                        Collectors.averagingDouble(arr -> Double.parseDouble(arr[1]))));

        return averageOfEachStudent.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getValue)
                .orElse(0.0);
    }

    private static double calculateAverageOfEachStudentUsingStreams(String[][] marksOfStudents) {
        Map<String, Double> averageOfEachStudent = Arrays.stream(marksOfStudents)
                .collect(Collectors.groupingBy(arr -> arr[0], Collectors.averagingDouble(arr -> Double.parseDouble(arr[1]))));

        return averageOfEachStudent.entrySet()
                .stream()
                .max((e1, e2)-> Double.compare(e2.getValue() , e1.getValue()))
                .map(Map.Entry::getValue)
                .orElse(0.0);
    }

}
