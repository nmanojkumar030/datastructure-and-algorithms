package basicmath;

import java.util.Arrays;

public class AnagramSort {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String string1 = "geeksforgeeks";
        String string2 = "forgeeksgeeks";

        if (IsAnagram(string1, string2)) {
            System.out.println("The two strings are Anagram to eachother");
        } else {
            System.out.println("The two strings are not Anagram to eachother");
        }
    }

    public static boolean IsAnagram(String string1, String string2) {
        // Both strings should not be null
        if (string1 != null && string2 != null) {
            // Both strings should be of same length
            if (string1.length() == string2.length()) {
                char[] charArray1 = string1.toCharArray();
                char[] charArray2 = string2.toCharArray();
                Arrays.sort(charArray1);
                Arrays.sort(charArray2);
                for (int i = 0; i < charArray1.length; i++) {
                    if (charArray1[i] != charArray2[i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
