package gs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Example- “apple” -> ‘a’, “ababc” -> ‘c’, ‘aaccc’ -> 0
 */
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "pineapple";
        char ch = findFirstNonRepeatingCharacter(input);
        System.out.println(ch);
    }

    private static char findFirstNonRepeatingCharacter(String input) {
        Map<Character, Integer> characterCountMap = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            characterCountMap.put(input.charAt(i), characterCountMap.getOrDefault(input.charAt(i), 0) + 1);
        }

        char firstNonRepeatCharacter = '\0';
        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                firstNonRepeatCharacter = entry.getKey();
                break;
            }
        }
        return firstNonRepeatCharacter;
    }
}
