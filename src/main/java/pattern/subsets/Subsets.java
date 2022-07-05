package pattern.subsets;

import java.util.ArrayList;
import java.util.Arrays;
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

    public static void main(String[] args) {
        List<List<Integer>> result = Subsets.findSubsets(Arrays.asList(new Integer[]{1, 3}));
        System.out.println("Here is the list of subsets: " + result);

        result = Subsets.findSubsets(Arrays.asList(new Integer[]{1, 5, 3}));
        System.out.println("Here is the list of subsets: " + result);

    }

}