package practice.strings;

import java.util.*;

public class RearrangeString {

    public static String rearrangeString(String s) {

        // Step 1: Count frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Max-heap based on frequency
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(freqMap.entrySet());

        StringBuilder result = new StringBuilder();

        // Step 3: Keep track of the "previous" character to re-insert after cooldown
        Map.Entry<Character, Integer> prevEntry = null;

        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> current = maxHeap.poll();
            result.append(current.getKey());
            current.setValue(current.getValue() - 1);

            // Push the previous entry back into the heap if it still has count left
            if (prevEntry != null && prevEntry.getValue() > 0) {
                maxHeap.offer(prevEntry);
            }

            prevEntry = current;
        }

        // Step 4: Validate result length
        if (result.length() != s.length()) {
            return "Not possible";
        }

        return result.toString();
    }

    static void main(String[] args) {
        System.out.println(rearrangeString("aabbcc"));  // e.g. abcabc / acbacb
        System.out.println(rearrangeString("aaab"));     // Not possible
        System.out.println(rearrangeString("aaabbc"));   // e.g. ababac / abacab
        System.out.println(rearrangeString("aaabbbcc")); // ababacbc etc.
    }
}