package pattern.cyclicsort;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindAllDuplicateTest {

    @Test
    public void testFindNumbers_twoDuplicates() {
        List<Integer> result = FindAllDuplicate.findNumbers(new int[]{3, 4, 4, 5, 5});
        assertEquals(List.of(5, 4), result);
    }

    @Test
    public void testFindNumbers_unorderedInput() {
        List<Integer> result = FindAllDuplicate.findNumbers(new int[]{5, 4, 7, 2, 3, 5, 3});
        assertEquals(List.of(3, 5), result);
    }

    @Test
    public void testFindNumbers_noDuplicates() {
        List<Integer> result = FindAllDuplicate.findNumbers(new int[]{1, 2, 3, 4});
        assertEquals(0, result.size());
    }

    @Test
    public void testFindNumbers_emptyArray() {
        List<Integer> result = FindAllDuplicate.findNumbers(new int[]{});
        assertEquals(0, result.size());
    }
}
