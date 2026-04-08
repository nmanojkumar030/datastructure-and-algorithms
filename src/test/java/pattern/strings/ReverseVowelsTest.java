package pattern.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsTest {

    @Test
    void ShouldReturnNullWhenInputIsNull() {
        ReverseVowels reverseVowels = new ReverseVowels();
        String result = reverseVowels.reverseVowels(null);
        assertNull(result);
    }

    @Test
    void ShouldReturnEmptyWhenInputIsEmpty() {
        ReverseVowels reverseVowels = new ReverseVowels();
        String result = reverseVowels.reverseVowels("");
        assertNotNull(result);
        assertEquals(result.length(), 0);
    }

    @Test
    void ShouldReturnReversedVowelString() {
        ReverseVowels reverseVowels = new ReverseVowels();
        String result = reverseVowels.reverseVowels("hello");
        assertNotNull(result);
        assertEquals("holle", result);
    }

    @Test
    void ShouldReturnReversedVowelStringWithCapital() {
        ReverseVowels reverseVowels = new ReverseVowels();
        String result = reverseVowels.reverseVowels("hEllo");
        assertNotNull(result);
        assertEquals("hollE", result);
    }
}