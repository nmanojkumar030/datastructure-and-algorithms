package pattern.cyclicsort;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllMissingNumbersTest {

    @Test
    public void testFindNumbers_multipleMissing() {
        List<Integer> result = AllMissingNumbers.findNumbers(new int[]{2, 3, 1, 8, 2, 3, 5, 1});
        assertEquals(List.of(4, 6, 7), result);
    }

    @Test
    public void testFindNumbers_singleMissing() {
        List<Integer> result = AllMissingNumbers.findNumbers(new int[]{2, 4, 1, 2});
        assertEquals(List.of(3), result);
    }

    @Test
    public void testFindNumbers_missingLast() {
        List<Integer> result = AllMissingNumbers.findNumbers(new int[]{2, 3, 2, 1});
        assertEquals(List.of(4), result);
    }

    @Test
    public void testFindNumbers_noneMissing() {
        List<Integer> result = AllMissingNumbers.findNumbers(new int[]{1, 2, 3, 4});
        assertEquals(0, result.size());
    }

    @Test
    public void testFindNumbers_emptyArray() {
        List<Integer> result = AllMissingNumbers.findNumbers(new int[]{});
        assertEquals(0, result.size());
    }
}
