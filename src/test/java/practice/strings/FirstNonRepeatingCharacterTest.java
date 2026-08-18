package practice.strings;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FirstNonRepeatingCharacterTest {

    @Test
    void shouldReturnFirstNonRepeatingCharacter() {
        assertEquals('i', FirstNonRepeatingCharacter.findFirstNonRepeatingCharacter("pineapple"));
        assertEquals('i', FirstNonRepeatingCharacter.findFirstNonRepeatingCharacterUsingStreams("pineapple"));
    }

    @Test
    void shouldReturnSingleCharacterForOneLetterString() {
        assertEquals('a', FirstNonRepeatingCharacter.findFirstNonRepeatingCharacter("a"));
        assertEquals('a', FirstNonRepeatingCharacter.findFirstNonRepeatingCharacterUsingStreams("a"));
    }

    @Test
    void shouldReturnNullCharacterWhenEveryCharacterRepeatsUsingManualMethod() {
        assertEquals('\0', FirstNonRepeatingCharacter.findFirstNonRepeatingCharacter("aabbcc"));
    }

    @Test
    void shouldThrowWhenEveryCharacterRepeatsUsingStreams() {
        assertThrows(NoSuchElementException.class,
                () -> FirstNonRepeatingCharacter.findFirstNonRepeatingCharacterUsingStreams("aabbcc"));
    }
}
