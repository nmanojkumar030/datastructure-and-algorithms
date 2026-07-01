package practice.strings;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Character.isLetterOrDigit;
import static java.lang.Character.toLowerCase;

public class PrintPalindrome {

    public static void main(String[] args) {
        String palindrome = "aabbcadad";
        System.out.println(isPalindromeUsingHashMap(palindrome));

        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindromeWithTwoPointers(s1));

        String s2 = "race a car";
        System.out.println(isPalindromeWithTwoPointers(s2));
    }

    public static boolean isPalindromeUsingHashMap(String palindrome) {
        Map<Character, Integer> frequencyMap = new HashMap<Character, Integer>();
        for (int i = 0; i < palindrome.length(); i++) {
            if (frequencyMap.containsKey(palindrome.charAt(i))) {
                Integer count = frequencyMap.get(palindrome.charAt(i));
                frequencyMap.put(palindrome.charAt(i), ++count);
            } else {
                frequencyMap.put(palindrome.charAt(i), 1);
            }
        }

        int oddCount = 0;
        for (int count : frequencyMap.values()) {
            if (count % 2 == 1) {
                oddCount++;
            }
        }

        if (oddCount == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindromeWithTwoPointers(String s) {
        StringBuilder filteredStringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (isLetterOrDigit(c)) {
                filteredStringBuilder.append(toLowerCase(c));
            }
        }

        int left = 0;
        int right = filteredStringBuilder.length() - 1;

        while (left <= right) {
            if (filteredStringBuilder.charAt(left++) != filteredStringBuilder.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
