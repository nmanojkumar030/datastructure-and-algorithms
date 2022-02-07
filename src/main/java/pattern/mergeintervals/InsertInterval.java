package pattern.mergeintervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {

    public List<Interval> insert(List<Interval> intervalList, Interval intervalToInsert) {
        if (null == intervalList || intervalList.isEmpty()) {
            return Arrays.asList(intervalToInsert);
        }

        List<Interval> mergedIntervals = new ArrayList<>();

        int start = intervalToInsert.getStart();
        int end = intervalToInsert.getEnd();
        for (Interval interval : intervalList) {
            if (interval.getEnd() < start) {
                mergedIntervals.add(interval);
            } else {
                if (interval.getStart() <= end) {
                    start = Math.min(start, interval.getStart());
                    end = Math.max(end, interval.getEnd());
                } else {
                    mergedIntervals.add(new Interval(start, end));
                    start = interval.getStart();
                    end = interval.getEnd();
                }
            }
        }
        mergedIntervals.add(new Interval(start, end));
        return mergedIntervals;
    }
}
