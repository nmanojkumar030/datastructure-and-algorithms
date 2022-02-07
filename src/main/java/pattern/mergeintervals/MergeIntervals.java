package pattern.mergeintervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    // Time Complexity - O(N*logN) [Sorting O(N*logN) and algorithm O(N)]
    // Space Complexity O(N)
    public List<Interval> merge(List<Interval> intervalList) {
        List<Interval> mergedIntervals = new ArrayList<>();

        if (intervalList.isEmpty() || intervalList.size() == 1)
            return intervalList;

        Collections.sort(intervalList, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return Integer.compare(o1.getStart(), o2.getStart());
            }
        });

        int start = intervalList.get(0).getStart();
        int end = intervalList.get(0).getEnd();

        for (Interval interval : intervalList) {
            if (interval.getStart() <= end) {
                end = Math.max(end, interval.getEnd());
            } else {
                Interval mergeInterval = new Interval(start, end);
                mergedIntervals.add(mergeInterval);

                start = interval.getStart();
                end = interval.getEnd();
            }
        }
        mergedIntervals.add(new Interval(start, end));
        return mergedIntervals;
    }
}
