package practice.math;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MaxAgeRangeInClassTest {

    @Test
    public void shouldReturnClassWithMaxAgeRange() {
        List<MaxAgeRangeInClass.Student> students = List.of(
                new MaxAgeRangeInClass.Student(1, "Alice", 15),
                new MaxAgeRangeInClass.Student(1, "Bob", 16),
                new MaxAgeRangeInClass.Student(2, "Charles", 12),
                new MaxAgeRangeInClass.Student(2, "David", 18),
                new MaxAgeRangeInClass.Student(3, "John", 14),
                new MaxAgeRangeInClass.Student(3, "Karen", 14));

        MaxAgeRangeInClass maxAgeRangeInClass = new MaxAgeRangeInClass();
        assertEquals(2, maxAgeRangeInClass.findClassWithMaxAgeRange(students));
    }

    @Test
    public void shouldReturnOnlyClassWhenSingleClassPresent() {
        List<MaxAgeRangeInClass.Student> students = List.of(
                new MaxAgeRangeInClass.Student(5, "Alice", 10),
                new MaxAgeRangeInClass.Student(5, "Bob", 20));

        MaxAgeRangeInClass maxAgeRangeInClass = new MaxAgeRangeInClass();
        assertEquals(5, maxAgeRangeInClass.findClassWithMaxAgeRange(students));
    }

    @Test
    public void shouldThrowExceptionWhenListIsEmpty() {
        MaxAgeRangeInClass maxAgeRangeInClass = new MaxAgeRangeInClass();
        assertThrows(IllegalArgumentException.class, () -> maxAgeRangeInClass.findClassWithMaxAgeRange(List.of()));
    }

    @Test
    public void shouldReturnClassWithMaxAgeRangeUsingSecondImplementation() {
        List<MaxAgeRangeInClass.Student> students = List.of(
                new MaxAgeRangeInClass.Student(1, "Alice", 15),
                new MaxAgeRangeInClass.Student(1, "Bob", 16),
                new MaxAgeRangeInClass.Student(2, "Charles", 12),
                new MaxAgeRangeInClass.Student(2, "David", 18),
                new MaxAgeRangeInClass.Student(3, "John", 14),
                new MaxAgeRangeInClass.Student(3, "Karen", 14));

        MaxAgeRangeInClass maxAgeRangeInClass = new MaxAgeRangeInClass();
        assertEquals(2, maxAgeRangeInClass.findClassWithMaxAgeRange2(students));
    }

    @Test
    public void shouldReturnZeroWhenListIsEmptyUsingSecondImplementation() {
        MaxAgeRangeInClass maxAgeRangeInClass = new MaxAgeRangeInClass();
        assertEquals(0, maxAgeRangeInClass.findClassWithMaxAgeRange2(List.of()));
    }

    @Test
    public void shouldReturnAClassWhenTiedAgeRangesExist() {
        List<MaxAgeRangeInClass.Student> students = List.of(
                new MaxAgeRangeInClass.Student(1, "Alice", 10),
                new MaxAgeRangeInClass.Student(1, "Bob", 20),
                new MaxAgeRangeInClass.Student(2, "Charles", 5),
                new MaxAgeRangeInClass.Student(2, "David", 15));

        MaxAgeRangeInClass maxAgeRangeInClass = new MaxAgeRangeInClass();
        int result = maxAgeRangeInClass.findClassWithMaxAgeRange(students);
        assertTrue(result == 1 || result == 2);
    }
}