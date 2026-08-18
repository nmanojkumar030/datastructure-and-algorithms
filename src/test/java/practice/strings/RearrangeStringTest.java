package practice.strings;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RearrangeStringTest {

    @Test
    void shouldRearrangeSoNoTwoAdjacentCharactersAreEqual() {
        String result = RearrangeString.rearrangeString("aabbcc");
        assertValidRearrangement("aabbcc", result);
    }

    @Test
    void shouldReturnNotPossibleWhenOneCharacterDominates() {
        assertEquals("Not possible", RearrangeString.rearrangeString("aaab"));
    }

    @Test
    void shouldReturnNotPossibleWhenTwoOfTheSameCharacterCannotBeSeparated() {
        assertEquals("Not possible", RearrangeString.rearrangeString("aa"));
    }

    @Test
    void shouldRearrangeUnevenFrequencyString() {
        String result = RearrangeString.rearrangeString("aaabbc");
        assertValidRearrangement("aaabbc", result);
    }

    @Test
    void shouldReturnEmptyStringForEmptyInput() {
        assertEquals("", RearrangeString.rearrangeString(""));
    }

    @Test
    void shouldReturnSameCharacterForSingleCharacterInput() {
        assertEquals("a", RearrangeString.rearrangeString("a"));
    }

    private void assertValidRearrangement(String original, String result) {
        assertEquals(original.length(), result.length());
        for (int i = 1; i < result.length(); i++) {
            assertNotEquals(result.charAt(i - 1), result.charAt(i));
        }

        Map<Character, Integer> originalCounts = charCounts(original);
        Map<Character, Integer> resultCounts = charCounts(result);
        assertTrue(originalCounts.equals(resultCounts));
    }

    private Map<Character, Integer> charCounts(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        return counts;
    }
}
