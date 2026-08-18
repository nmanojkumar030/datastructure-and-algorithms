package practice.strings;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramsInListTest {

    @Test
    void shouldGroupAnagramsAndDedupeExactDuplicateWords() {
        String[] input = {"cat", "dog", "god", "cat"};
        List<List<String>> result = AnagramsInList.findAllAnagrams(input);

        assertEquals(2, result.size());
        assertTrue(result.contains(List.of("cat")));
        assertTrue(result.contains(List.of("dog", "god")));
    }

    @Test
    void shouldReturnEmptyListForEmptyInput() {
        assertTrue(AnagramsInList.findAllAnagrams(new String[]{}).isEmpty());
    }

    @Test
    void shouldReturnSingletonGroupsWhenNoAnagramsExist() {
        String[] input = {"hello", "world"};
        List<List<String>> result = AnagramsInList.findAllAnagrams(input);

        assertEquals(2, result.size());
        assertTrue(result.contains(List.of("hello")));
        assertTrue(result.contains(List.of("world")));
    }

    @Test
    void shouldReturnSingleGroupForSingleWord() {
        List<List<String>> result = AnagramsInList.findAllAnagrams(new String[]{"solo"});
        assertEquals(List.of(List.of("solo")), result);
    }
}
