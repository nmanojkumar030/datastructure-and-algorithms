package pattern.subsets;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> findSubsets(List<Integer> inputList) {
        List<List<Integer>> subsetsList = new ArrayList<>((int) Math.pow(2, inputList.size()));
        subsetsList.add(new ArrayList<>()); // empty subset

        for (Integer element : inputList) { // [1,3]
            int size = subsetsList.size();
            for (int i = 0; i < size; i++) { // [], [1], [3], [1,3]
                List<Integer> set = new ArrayList<>(subsetsList.get(i));
                set.add(element);
                subsetsList.add(set);
            }
        }
        return subsetsList;
    }
}