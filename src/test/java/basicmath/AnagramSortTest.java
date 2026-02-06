package basicmath;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramSortTest {

    @Test
    public void testIsAnagram_ValidAnagrams() {
        // Test case for valid anagrams
        assertTrue(AnagramSort.IsAnagram("listen", "silent"));
        assertTrue(AnagramSort.IsAnagram("triangle", "integral"));
        assertTrue(AnagramSort.IsAnagram("debit card", "bad credit"));
    }

    @Test
    public void testIsAnagram_NonAnagrams() {
        // Test case for non-anagrams
        assertFalse(AnagramSort.IsAnagram("hello", "world"));
        assertFalse(AnagramSort.IsAnagram("java", "python"));
        assertFalse(AnagramSort.IsAnagram("test", "text"));
    }

    @Test
    public void testIsAnagram_DifferentLengths() {
        // Test case for strings with different lengths
        assertFalse(AnagramSort.IsAnagram("hello", "hellos"));
        assertFalse(AnagramSort.IsAnagram("abc", "abcd"));
    }

    @Test
    public void testIsAnagram_NullInputs() {
        // Test case for null inputs
        assertFalse(AnagramSort.IsAnagram(null, "hello"));
        assertFalse(AnagramSort.IsAnagram("hello", null));
        assertFalse(AnagramSort.IsAnagram(null, null));
    }

    @Test
    public void testIsAnagram_EmptyStrings() {
        // Test case for empty strings
        assertTrue(AnagramSort.IsAnagram("", ""));
    }

    @Test
    public void testIsAnagram_CaseSensitive() {
        // Test case for case sensitivity
        assertFalse(AnagramSort.IsAnagram("Hello", "hello"));
        assertFalse(AnagramSort.IsAnagram("World", "world"));
    }
} 