package pattern.mergeintervals;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two lists of intervals, find the intersection of these two lists.
 * Each list consists of disjoint intervals sorted on their start time.
 * <p>
 * Input: arr1=[[1, 3], [5, 6], [7, 9]], arr2=[[2, 3], [5, 7]]
 * Output: [2, 3], [5, 6], [7, 7]
 * Explanation: The output list contains the common intervals between the two lists.
 * <p>
 * Input: arr1=[[1, 3], [5, 7], [9, 12]], arr2=[[5, 10]]
 * Output: [5, 7], [9, 10]
 * Explanation: The output list contains the common intervals between the two lists.
 */
public class IntervalsIntersection {
    public static Interval[] merge(Interval[] arr1, Interval[] arr2) {
        List<Interval> result = new ArrayList<Interval>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            // check if the interval arr[i] intersects with arr2[j]
            // check if one of the interval's start time lies within the other interval
            if ((arr1[i].getStart() >= arr2[j].getStart() && arr1[i].getStart() <= arr2[j].getEnd())
                    || (arr2[j].getStart() >= arr1[i].getStart() && arr2[j].getStart() <= arr1[i].getEnd())) {
                // store the intersection part
                result.add(new Interval(Math.max(arr1[i].getStart(), arr2[j].getStart()), Math.min(arr1[i].getEnd(), arr2[j].getEnd())));
            }

            // move next from the interval which is finishing first
            if (arr1[i].getEnd() < arr2[j].getEnd())
                i++;
            else
                j++;
        }

        return result.toArray(new Interval[result.size()]);
    }


    public static void main(String[] args) {
        Interval[] input1 = new Interval[]{new Interval(1, 3), new Interval(5, 6), new Interval(7, 9)};
        Interval[] input2 = new Interval[]{new Interval(2, 3), new Interval(5, 7)};
        Interval[] result = IntervalsIntersection.merge(input1, input2);
        System.out.print("Intervals Intersection: ");
        for (Interval interval : result)
            System.out.print("[" + interval.getStart() + "," + interval.getEnd() + "] ");
        System.out.println();

        input1 = new Interval[]{new Interval(1, 3), new Interval(5, 7), new Interval(9, 12)};
        input2 = new Interval[]{new Interval(5, 10)};
        result = IntervalsIntersection.merge(input1, input2);
        System.out.print("Intervals Intersection: ");
        for (Interval interval : result)
            System.out.print("[" + interval.getStart() + "," + interval.getEnd() + "] ");
    }
}
