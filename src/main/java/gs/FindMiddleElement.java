package gs;

import java.util.Iterator;
import java.util.List;

/**
 * Given a list of integers find the middle element in the list.
 * Do not use the list.size() method anywhere in the collection
 */
public class FindMiddleElement {

    public int findTheMiddleElementUsingStreams(List<Integer> integerList) {
        if (integerList == null || integerList.isEmpty()) {
            throw new IllegalArgumentException("List is null or empty");
        }

        long size = integerList.stream().count();
        return integerList.get((int) size / 2);
    }

    public int findTheMiddleElementUsingPointers(List<Integer> integerList) {
        if (integerList == null || integerList.isEmpty()) {
            throw new IllegalArgumentException("List is null or empty");
        }

        Iterator<Integer> slowIterator = integerList.iterator();
        Iterator<Integer> fastIterator = integerList.iterator();

        int middle = slowIterator.next();
        while (slowIterator.hasNext() && fastIterator.hasNext()) {
            fastIterator.next();

            if (fastIterator.hasNext()) {
                fastIterator.next();
                middle = slowIterator.next();
            }
        }
        return middle;
    }
}
