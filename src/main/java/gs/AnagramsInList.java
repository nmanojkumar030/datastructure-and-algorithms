package gs;

import java.util.ArrayList;
import java.util.List;

/**
 * Input = [“cat”, “dog”, “god”, “cat”];
 * Output = [[cat], [dog, god]]
 */
public class AnagramsInList {

    public static void main(String[] args) {
        String[] inputArray = new String[]{"cat", "dog", "god", "cat"};
        List<List<String>> anagramsList = findAllAnagrams(inputArray);
        for (List<String> anagram : anagramsList) {
            System.out.println(anagram);
        }
    }

    private static List<List<String>> findAllAnagrams(String[] inputArray) {
        List<List<String>> anagramsList = new ArrayList<>();

        return anagramsList;
    }
}
