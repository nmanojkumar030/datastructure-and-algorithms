package pattern.mergeintervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntervalsIntersectionTest {

    @Test
    public void shouldFindIntersectionsBetweenTwoIntervalLists() {
        Interval[] arr1 = {new Interval(1, 3), new Interval(5, 6), new Interval(7, 9)};
        Interval[] arr2 = {new Interval(2, 3), new Interval(5, 7)};

        Interval[] result = IntervalsIntersection.merge(arr1, arr2);

        assertEquals(3, result.length);
        assertEquals(2, result[0].getStart());
        assertEquals(3, result[0].getEnd());
        assertEquals(5, result[1].getStart());
        assertEquals(6, result[1].getEnd());
        assertEquals(7, result[2].getStart());
        assertEquals(7, result[2].getEnd());
    }

    @Test
    public void shouldFindIntersectionsWhenOneListHasFewerIntervals() {
        Interval[] arr1 = {new Interval(1, 3), new Interval(5, 7), new Interval(9, 12)};
        Interval[] arr2 = {new Interval(5, 10)};

        Interval[] result = IntervalsIntersection.merge(arr1, arr2);

        assertEquals(2, result.length);
        assertEquals(5, result[0].getStart());
        assertEquals(7, result[0].getEnd());
        assertEquals(9, result[1].getStart());
        assertEquals(10, result[1].getEnd());
    }

    @Test
    public void shouldReturnEmptyArrayWhenNoIntersectionExists() {
        Interval[] arr1 = {new Interval(1, 2)};
        Interval[] arr2 = {new Interval(3, 4)};

        Interval[] result = IntervalsIntersection.merge(arr1, arr2);

        assertEquals(0, result.length);
    }

    @Test
    public void shouldReturnEmptyArrayWhenFirstListIsEmpty() {
        Interval[] arr1 = {};
        Interval[] arr2 = {new Interval(3, 4)};

        Interval[] result = IntervalsIntersection.merge(arr1, arr2);

        assertEquals(0, result.length);
    }

    @Test
    public void shouldReturnEmptyArrayWhenSecondListIsEmpty() {
        Interval[] arr1 = {new Interval(1, 2)};
        Interval[] arr2 = {};

        Interval[] result = IntervalsIntersection.merge(arr1, arr2);

        assertEquals(0, result.length);
    }
}
