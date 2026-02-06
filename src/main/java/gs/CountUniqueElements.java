package gs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Given a List of Integers, the list to be sorted in ascending order.
 * Then find the unique elements in this list and then return the count of unique elements present.
 */
public class CountUniqueElements {

    public long countUniqueUsingStreams(List<Integer> integerList) {
        return integerList.stream().distinct().count();
    }

    public long countUniqueUsingHashSet(List<Integer> integerList) {
        Set<Integer> integerSet = new HashSet<>(integerList);
        return integerSet.size();
    }

    public long countUniqueUsingTreeSet(List<Integer> integerList) {
        Set<Integer> integerSet = new TreeSet<>(integerList);
        return integerSet.size();
    }

    public long countUniqueUsingManualMethod(List<Integer> integerList) {
       List<Integer> sortedList = integerList.stream().sorted().collect(Collectors.toList());

       int uniqueCount = 1;
       for (int i = 1; i < sortedList.size(); i++) {
           if (!sortedList.get(i).equals(sortedList.get(i - 1))) {
               uniqueCount++;
           }
       }

       return uniqueCount;
    }
}
