package practice.strings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramFinderTest {

    @Test
    void shouldGroupAnagramsTogether() {
        List<String> input = Arrays.asList("cat", "dog", "god", "cat");
        Map<String, List<String>> grouped = AnagramFinder.groupAnagrams(input);

        assertEquals(2, grouped.size());
        assertTrue(grouped.values().stream().anyMatch(group -> group.equals(List.of("cat", "cat"))));
        assertTrue(grouped.values().stream().anyMatch(group -> group.equals(List.of("dog", "god"))));
    }

    @Test
    void shouldGroupAnagramsCaseInsensitively() {
        List<String> input = Arrays.asList("Cat", "tac");
        Map<String, List<String>> grouped = AnagramFinder.groupAnagrams(input);

        assertEquals(1, grouped.size());
        assertEquals(List.of("Cat", "tac"), grouped.values().iterator().next());
    }

    @Test
    void shouldReturnEmptyMapForEmptyInput() {
        assertTrue(AnagramFinder.groupAnagrams(Collections.emptyList()).isEmpty());
    }

    @Test
    void shouldReturnSingleGroupForSingleWord() {
        Map<String, List<String>> grouped = AnagramFinder.groupAnagrams(List.of("solo"));
        assertEquals(1, grouped.size());
        assertEquals(List.of("solo"), grouped.values().iterator().next());
    }

    @Test
    void shouldReturnSeparateGroupsWhenNoWordsAreAnagrams() {
        Map<String, List<String>> grouped = AnagramFinder.groupAnagrams(List.of("hello", "world"));
        assertEquals(2, grouped.size());
    }
}
