package pattern.arrays.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LongestSubstringKDistinctTest {

    @Test
    void shouldFindLongestSubstringWithTwoDistinctChars() {
        assertEquals(4, LongestSubstringKDistinct.findLength("araaci", 2));
    }

    @Test
    void shouldFindLongestSubstringWithOneDistinctChar() {
        assertEquals(2, LongestSubstringKDistinct.findLength("araaci", 1));
    }

    @Test
    void shouldFindLongestSubstringWithThreeDistinctChars() {
        assertEquals(5, LongestSubstringKDistinct.findLength("cbbebi", 3));
    }

    @Test
    void shouldThrowExceptionForNullString() {
        assertThrows(IllegalArgumentException.class, () -> LongestSubstringKDistinct.findLength(null, 2));
    }

    @Test
    void shouldThrowExceptionForEmptyString() {
        assertThrows(IllegalArgumentException.class, () -> LongestSubstringKDistinct.findLength("", 2));
    }

    @Test
    void shouldReturnFullLengthWhenKExceedsDistinctCharCount() {
        assertEquals(3, LongestSubstringKDistinct.findLength("abc", 5));
    }
}
