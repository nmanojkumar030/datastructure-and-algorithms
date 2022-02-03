package pattern.mergeintervals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMergeIntervals {

    @Test
    public void testMergeIntervals_EmptyInput() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        List<Interval> intervalList = new ArrayList<>();

        List<Interval> mergedIntervals = mergeIntervals.merge(intervalList);
        assertEquals(0, mergedIntervals.size());
    }

    @Test
    public void testMergeIntervals_SingleInterval() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        List<Interval> intervalList = new ArrayList<>();
        Interval interval1 = new Interval(1, 2);
        intervalList.add(interval1);

        List<Interval> mergedIntervals = mergeIntervals.merge(intervalList);
        assertEquals(1, mergedIntervals.size());
        assertEquals(1, mergedIntervals.get(0).getStart());
        assertEquals(2, mergedIntervals.get(0).getEnd());
    }

    @Test
    public void testMergeIntervals_intervals_not_overlap() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        List<Interval> intervalList = new ArrayList<>();
        Interval interval1 = new Interval(1, 2);
        intervalList.add(interval1);

        Interval interval2 = new Interval(3, 4);
        intervalList.add(interval2);

        List<Interval> mergedIntervals = mergeIntervals.merge(intervalList);
        assertEquals(2, mergedIntervals.size());
        assertEquals(1, mergedIntervals.get(0).getStart());
        assertEquals(2, mergedIntervals.get(0).getEnd());

        assertEquals(3, mergedIntervals.get(1).getStart());
        assertEquals(4, mergedIntervals.get(1).getEnd());
    }

    @Test
    public void testMergeIntervals_intervals_not_overlap2() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        List<Interval> intervalList = new ArrayList<>();

        Interval interval2 = new Interval(3, 4);
        intervalList.add(interval2);

        Interval interval1 = new Interval(1, 2);
        intervalList.add(interval1);

        List<Interval> mergedIntervals = mergeIntervals.merge(intervalList);
        assertEquals(2, mergedIntervals.size());
        assertEquals(1, mergedIntervals.get(0).getStart());
        assertEquals(2, mergedIntervals.get(0).getEnd());

        assertEquals(3, mergedIntervals.get(1).getStart());
        assertEquals(4, mergedIntervals.get(1).getEnd());
    }

    @Test
    public void testMergeIntervals_intervals_overlap_secondIntervalEndsAfterFirst() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        List<Interval> intervalList = new ArrayList<>();
        Interval interval1 = new Interval(1, 4);
        intervalList.add(interval1);

        Interval interval2 = new Interval(2, 5);
        intervalList.add(interval2);

        List<Interval> mergedIntervals = mergeIntervals.merge(intervalList);
        assertEquals(1, mergedIntervals.size());
        assertEquals(1, mergedIntervals.get(0).getStart());
        assertEquals(5, mergedIntervals.get(0).getEnd());
    }

    @Test
    public void testMergeIntervals_intervals_overlap_firstFullyOverlapsSecond() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        List<Interval> intervalList = new ArrayList<>();
        Interval interval1 = new Interval(1, 5);
        intervalList.add(interval1);

        Interval interval2 = new Interval(2, 4);
        intervalList.add(interval2);

        List<Interval> mergedIntervals = mergeIntervals.merge(intervalList);
        assertEquals(1, mergedIntervals.size());
        assertEquals(1, mergedIntervals.get(0).getStart());
        assertEquals(5, mergedIntervals.get(0).getEnd());
    }

    @Test
    public void testMergeIntervals_intervals_overlap_firstFullyOverlapsSecond_sameStart() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        List<Interval> intervalList = new ArrayList<>();
        Interval interval1 = new Interval(1, 5);
        intervalList.add(interval1);

        Interval interval2 = new Interval(1, 3);
        intervalList.add(interval2);

        List<Interval> mergedIntervals = mergeIntervals.merge(intervalList);
        assertEquals(1, mergedIntervals.size());
        assertEquals(1, mergedIntervals.get(0).getStart());
        assertEquals(5, mergedIntervals.get(0).getEnd());
    }

    @Test
    public void testMergeIntervals_multipleIntervals() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        List<Interval> intervalList = new ArrayList<>();
        Interval interval1 = new Interval(1, 4);
        intervalList.add(interval1);

        Interval interval2 = new Interval(2, 5);
        intervalList.add(interval2);

        Interval interval3 = new Interval(7, 9);
        intervalList.add(interval3);

        List<Interval> mergedIntervals = mergeIntervals.merge(intervalList);
        assertEquals(2, mergedIntervals.size());
        assertEquals(1, mergedIntervals.get(0).getStart());
        assertEquals(5, mergedIntervals.get(0).getEnd());

        assertEquals(7, mergedIntervals.get(1).getStart());
        assertEquals(9, mergedIntervals.get(1).getEnd());
    }
}