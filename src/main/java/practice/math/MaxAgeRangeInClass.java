package practice.math;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given a List of Students {classNo, name, age}, find the classNo with the maximum
 * age range (maxAge - minAge) among students in that class.
 */
public class MaxAgeRangeInClass {

    public int findClassWithMaxAgeRange(List<Student> students) {
        Map<Integer, IntSummaryStatistics> ageStatsByClass = students.stream()
                .collect(Collectors.groupingBy(Student::classNo, Collectors.summarizingInt(Student::age)));

        return ageStatsByClass.entrySet().stream()
                .max(Comparator.comparingInt(entry -> entry.getValue().getMax() - entry.getValue().getMin()))
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new IllegalArgumentException("students must not be empty"));
    }

    public int findClassWithMaxAgeRange2(List<Student> students) {
        Map<Integer, IntSummaryStatistics> summaryStatisticsMap = students.stream()
                .collect(Collectors.groupingBy(Student::classNo, Collectors.summarizingInt(Student::age)));

        return summaryStatisticsMap.entrySet()
                .stream()
                .max((e1, e2) -> (e2.getValue().getMax() - e2.getValue().getMin()) - (e1.getValue().getMax() - e1.getValue().getMin()))
                .map(Map.Entry::getKey)
                .orElse(0);
    }

    public record Student(int classNo, String name, int age) {
    }
}