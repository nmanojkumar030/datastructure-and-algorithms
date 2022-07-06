package gs;

import java.util.*;

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
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String word : inputArray) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);

            anagramsMap.computeIfPresent(new String(charArray), (key, value) -> {
                if (!value.contains(word)) {
                    value.add(word);
                }
                return value;
            });

            anagramsMap.computeIfAbsent(new String(charArray), (key) -> {
                List<String> list = new ArrayList<>();
                list.add(word);
                return list;
            });


        }

        for (Map.Entry<String, List<String>> entry : anagramsMap.entrySet()) {
            anagramsList.add(entry.getValue());
        }
        return anagramsList;
    }
}
