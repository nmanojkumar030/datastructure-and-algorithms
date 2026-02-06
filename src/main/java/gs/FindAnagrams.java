package gs;

import java.util.*;

/**
 * -	Input = [“cat”, “dog”, “god”, “cat”];
 * -	Output = [[cat], [dog, god]]
 */
public class FindAnagrams {
    public static void main(String[] args) {
        String[] strings = new String[]{"cat", "dog", "god", "cat"};
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String string : strings) {
            char[] characterArray = string.toCharArray();
            Arrays.sort(characterArray);

            anagramMap.computeIfPresent(Arrays.toString(characterArray), (key, value) -> {
                if (!value.contains(string)) {
                    value.add(string);
                }
                return value;
            });

            anagramMap.computeIfAbsent(Arrays.toString(characterArray), (key) -> {
                List<String> anagramList = new ArrayList<>();
                anagramList.add(string);
                return anagramList;
            });
        }

        for (Map.Entry<String, List<String>> entry : anagramMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
