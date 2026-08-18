package pattern.arrays.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NoRepeatSubstringTest {

    @Test
    void shouldFindLongestSubstringWithoutRepeatingChars() {
        assertEquals(3, NoRepeatSubstring.findLength("aabccbb"));
    }

    @Test
    void shouldFindLongestSubstringWhenRepeatIsAtStart() {
        assertEquals(2, NoRepeatSubstring.findLength("abbbb"));
    }

    @Test
    void shouldFindLongestSubstringWithRepeatInMiddle() {
        assertEquals(2, NoRepeatSubstring.findLength("babbb"));
    }

    @Test
    void shouldFindLongestSubstringWithMultipleRepeats() {
        assertEquals(3, NoRepeatSubstring.findLength("abccde"));
    }

    @Test
    void shouldReturnZeroForEmptyString() {
        assertEquals(0, NoRepeatSubstring.findLength(""));
    }

    @Test
    void shouldReturnFullLengthWhenAllCharsAreUnique() {
        assertEquals(4, NoRepeatSubstring.findLength("abcd"));
    }
}
