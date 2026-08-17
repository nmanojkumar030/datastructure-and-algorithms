package pattern.subsets;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubsetsTest {

    @Test
    public void testFindSubsetsWithTwoElements() {
        List<List<Integer>> result = Subsets.findSubsets(Arrays.asList(1, 3));

        assertEquals(4, result.size());
        assertTrue(result.contains(List.of()));
        assertTrue(result.contains(List.of(1)));
        assertTrue(result.contains(List.of(3)));
        assertTrue(result.contains(List.of(1, 3)));
    }

    @Test
    public void testFindSubsetsWithThreeElements() {
        List<List<Integer>> result = Subsets.findSubsets(Arrays.asList(1, 5, 3));

        assertEquals(8, result.size());
        assertTrue(result.contains(List.of()));
        assertTrue(result.contains(List.of(1)));
        assertTrue(result.contains(List.of(5)));
        assertTrue(result.contains(List.of(3)));
        assertTrue(result.contains(List.of(1, 5)));
        assertTrue(result.contains(List.of(1, 3)));
        assertTrue(result.contains(List.of(5, 3)));
        assertTrue(result.contains(List.of(1, 5, 3)));
    }

    @Test
    public void testFindSubsetsWithEmptyInput() {
        List<List<Integer>> result = Subsets.findSubsets(List.of());

        assertEquals(1, result.size());
        assertTrue(result.contains(List.of()));
    }

    @Test
    public void testFindSubsetsWithOneElements() {
        List<List<Integer>> result = Subsets.findSubsets(List.of(1));

        assertEquals(2, result.size());
        assertTrue(result.contains(List.of()));
        assertTrue(result.contains(List.of(1)));
    }
}