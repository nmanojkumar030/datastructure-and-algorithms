package pattern.arrays.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterReplacementTest {

    @Test
    void shouldFindLongestRepeatingSubstringAfterReplacements() {
        assertEquals(5, CharacterReplacement.findLength("aabccbb", 2));
    }

    @Test
    void shouldFindLongestRepeatingSubstringWithSingleReplacement() {
        assertEquals(4, CharacterReplacement.findLength("abbcb", 1));
    }

    @Test
    void shouldFindLongestRepeatingSubstringWithNoUsefulReplacements() {
        assertEquals(3, CharacterReplacement.findLength("abccde", 1));
    }

    @Test
    void shouldReturnZeroForEmptyString() {
        assertEquals(0, CharacterReplacement.findLength("", 2));
    }

    @Test
    void shouldReturnFullLengthWhenNoReplacementsNeeded() {
        assertEquals(4, CharacterReplacement.findLength("aaaa", 0));
    }
}
