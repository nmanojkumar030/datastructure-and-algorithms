package gs;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class AnagramFinder {

    // Functional interface for grouping anagrams
    @FunctionalInterface
    interface AnagramGrouper {
        Map<String, List<String>> group(List<String> words);
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("cat", "dog", "god", "cat");

        // Lambda function to group anagrams
        AnagramGrouper grouper = (words) -> {
            return words.stream()
                    .collect(Collectors.groupingBy(
                            word -> {
                                char[] chars = word.toLowerCase().toCharArray();
                                Arrays.sort(chars);
                                return new String(chars);
                            }
                    ));
        };

        // Get grouped anagrams
        Map<String, List<String>> grouped = grouper.group(input);

        // Convert to list of lists (output format)
        List<List<String>> result = new ArrayList<>(grouped.values());

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);

        // Test with more examples
        System.out.println("\n--- More Examples ---");

        List<String> test2 = Arrays.asList("listen", "silent", "enlist", "hello", "world");
        grouped = grouper.group(test2);
        result = new ArrayList<>(grouped.values());
        System.out.println("Input: " + test2);
        System.out.println("Output: " + result);

        List<String> test3 = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        grouped = grouper.group(test3);
        result = new ArrayList<>(grouped.values());
        System.out.println("\nInput: " + test3);
        System.out.println("Output: " + result);
    }
}