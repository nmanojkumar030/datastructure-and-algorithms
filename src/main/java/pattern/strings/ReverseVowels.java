package pattern.strings;

import java.util.Set;

public class ReverseVowels {
    public String reverseVowels(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        Set<Character> vowelChars = Set.of('a', 'e', 'i', 'o', 'u');
        int left = 0;
        int right = s.length() - 1;

        char[] resultCharArray = s.toCharArray();
        while (left < right) {
            boolean leftContains = vowelChars.contains(Character.toLowerCase(s.charAt(left)));
            boolean rightContains = vowelChars.contains(Character.toLowerCase(s.charAt(right)));
            if (leftContains && rightContains) {
                char leftChar = s.charAt(left);
                char rightChar = s.charAt(right);

                resultCharArray[left] = rightChar;
                resultCharArray[right] = leftChar;

                left++;
                right--;
            } else if (!leftContains && rightContains) {
                left++;
            } else if (leftContains && !rightContains) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        return new String(resultCharArray);
    }
}
