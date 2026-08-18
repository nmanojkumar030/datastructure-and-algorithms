package practice.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageOfStudentTest {

    private static final String[][] MARKS = {
            {"Charles", "65"},
            {"David", "100"},
            {"John", "70"},
            {"Charles", "61"}};

    @Test
    void shouldReturnMaxAverageAcrossStudents() {
        assertEquals(100.0, AverageOfStudent.calculateAverage(MARKS));
        assertEquals(100.0, AverageOfStudent.calculateAverageOfEachStudent(MARKS));
        assertEquals(100.0, AverageOfStudent.calculateAverageOfEachStudentUsingStreams(MARKS));
    }

    @Test
    void shouldReturnZeroForEmptyInput() {
        String[][] marks = {};
        assertEquals(0.0, AverageOfStudent.calculateAverage(marks));
        assertEquals(0.0, AverageOfStudent.calculateAverageOfEachStudent(marks));
        assertEquals(0.0, AverageOfStudent.calculateAverageOfEachStudentUsingStreams(marks));
    }

    @Test
    void shouldReturnSingleStudentAverageWhenOnlyOneMarkPresent() {
        String[][] marks = {{"Alice", "80"}};
        assertEquals(80.0, AverageOfStudent.calculateAverage(marks));
        assertEquals(80.0, AverageOfStudent.calculateAverageOfEachStudent(marks));
        assertEquals(80.0, AverageOfStudent.calculateAverageOfEachStudentUsingStreams(marks));
    }

    @Test
    void shouldReturnTheTiedMaxAverageWhenTwoStudentsMatch() {
        String[][] marks = {{"Alice", "90"}, {"Bob", "90"}};
        assertEquals(90.0, AverageOfStudent.calculateAverage(marks));
        assertEquals(90.0, AverageOfStudent.calculateAverageOfEachStudent(marks));
        assertEquals(90.0, AverageOfStudent.calculateAverageOfEachStudentUsingStreams(marks));
    }
}
