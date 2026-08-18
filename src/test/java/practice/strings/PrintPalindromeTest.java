package practice.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrintPalindromeTest {

    @Test
    void shouldReturnTrueWhenCharactersCanFormAPalindrome() {
        assertTrue(PrintPalindrome.isPalindromeUsingHashMap("aabbcadad"));
    }

    @Test
    void shouldReturnFalseWhenCharactersCannotFormAPalindrome() {
        assertFalse(PrintPalindrome.isPalindromeUsingHashMap("abcdef"));
    }

    @Test
    void shouldReturnTrueForActualPalindromeIgnoringPunctuationAndCase() {
        assertTrue(PrintPalindrome.isPalindromeWithTwoPointers("A man, a plan, a canal: Panama"));
    }

    @Test
    void shouldReturnFalseForNonPalindromeSentence() {
        assertFalse(PrintPalindrome.isPalindromeWithTwoPointers("race a car"));
    }

    @Test
    void shouldReturnTrueForEmptyString() {
        assertTrue(PrintPalindrome.isPalindromeWithTwoPointers(""));
    }

    @Test
    void shouldReturnTrueForSingleCharacterString() {
        assertTrue(PrintPalindrome.isPalindromeWithTwoPointers("a"));
    }
}
