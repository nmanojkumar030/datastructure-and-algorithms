package pattern.mergeintervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Statement #
 * Given a list of non-overlapping intervals sorted by their start time,
 * insert a given interval at the correct position and merge all
 * necessary intervals to produce a list that has only mutually exclusive intervals.
 *
 * Input: Intervals=[[1,3], [5,7], [8,12]], New Interval=[4,6]
 * Output: [[1,3], [4,7], [8,12]]
 * Explanation: After insertion, since [4,6] overlaps with [5,7], we merged them into one [4,7].
 *
 * Input: Intervals=[[1,3], [5,7], [8,12]], New Interval=[4,10]
 * Output: [[1,3], [4,12]]
 * Explanation: After insertion, since [4,10] overlaps with [5,7] & [8,12], we merged them into [4,12].
 *
 * Input: Intervals=[[2,3],[5,7]], New Interval=[1,4]
 * Output: [[1,4], [5,7]]
 * Explanation: After insertion, since [1,4] overlaps with [2,3], we merged them into one [1,4].
 *
 */
public class InsertInterval {

    // Time Complexity - O(N), Space Complexity - O(N)
    public List<Interval> insert(List<Interval> intervalList, Interval intervalToInsert) {
        if (null == intervalList || intervalList.isEmpty()) {
            return Arrays.asList(intervalToInsert);
        }

        List<Interval> mergedIntervals = new ArrayList<>();

        int intervalToInsertStart = intervalToInsert.getStart();
        int intervalToInsertEnd = intervalToInsert.getEnd();
        for (Interval interval : intervalList) {
            if (interval.getEnd() < intervalToInsertStart) {
                mergedIntervals.add(interval);
            } else {
                if (interval.getStart() <= intervalToInsertEnd) {
                    intervalToInsertStart = Math.min(intervalToInsertStart, interval.getStart());
                    intervalToInsertEnd = Math.max(intervalToInsertEnd, interval.getEnd());
                } else {
                    mergedIntervals.add(new Interval(intervalToInsertStart, intervalToInsertEnd));
                    intervalToInsertStart = interval.getStart();
                    intervalToInsertEnd = interval.getEnd();
                }
            }
        }
        mergedIntervals.add(new Interval(intervalToInsertStart, intervalToInsertEnd));
        return mergedIntervals;
    }
}
