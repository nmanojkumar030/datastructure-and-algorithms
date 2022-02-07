package pattern.mergeintervals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestInsertInterval {

    @Test
    public void testInsert() {
        List<Interval> input = new ArrayList<Interval>();
        input.add(new Interval(1, 3));
        input.add(new Interval(5, 7));
        input.add(new Interval(8, 12));

        InsertInterval insertInterval = new InsertInterval();
        List<Interval> result = insertInterval.insert(input, new Interval(4, 6));
        assertEquals(3, result.size());
        assertEquals(1, result.get(0).getStart());
        assertEquals(3, result.get(0).getEnd());

        assertEquals(4, result.get(1).getStart());
        assertEquals(7, result.get(1).getEnd());

        assertEquals(8, result.get(2).getStart());
        assertEquals(12, result.get(2).getEnd());
    }

    @Test
    public void testInsert2() {
        List<Interval> input = new ArrayList<Interval>();
        input.add(new Interval(1, 3));
        input.add(new Interval(5, 7));
        input.add(new Interval(8, 12));

        InsertInterval insertInterval = new InsertInterval();
        List<Interval> result = insertInterval.insert(input, new Interval(4, 10));
        assertEquals(2, result.size());
        assertEquals(1, result.get(0).getStart());
        assertEquals(3, result.get(0).getEnd());

        assertEquals(4, result.get(1).getStart());
        assertEquals(12, result.get(1).getEnd());
    }

    @Test
    public void testInsert3() {
        List<Interval> input = new ArrayList<Interval>();
        input.add(new Interval(2, 3));
        input.add(new Interval(5, 7));

        InsertInterval insertInterval = new InsertInterval();
        List<Interval> result = insertInterval.insert(input, new Interval(1, 4));
        assertEquals(2, result.size());
        assertEquals(1, result.get(0).getStart());
        assertEquals(4, result.get(0).getEnd());

        assertEquals(5, result.get(1).getStart());
        assertEquals(7, result.get(1).getEnd());
    }
}