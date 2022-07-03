package gs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AverageOfStudent {
    public static void main(String[] args) {
        String[][] studentArray = new String[][]{{"Charles", "65"}, {"David", "100"}, {"John", "70"}, {"Charles", "61"}};
        double average = calculateAverage(studentArray);
        System.out.println("Maximum Average : " + average);
    }

    private static double calculateAverage(String[][] studentArray) {
        Map<String, List<Integer>> studentMarksMap = new HashMap<>();
        for (String[] eachRow : studentArray) {
            studentMarksMap.computeIfPresent(eachRow[0], (key, value) -> {
                value.add(Integer.parseInt(eachRow[1]));
                return value;
            });

            studentMarksMap.computeIfAbsent(eachRow[0], (key) -> {
                List<Integer> marksList = new ArrayList<>();
                marksList.add(Integer.parseInt(eachRow[1]));
                return marksList;
            });
        }

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

}
