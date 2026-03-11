package pattern.priorityqueues;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class TopKFrequentNumbersTest {

    @Test
    public void testFindTopKFrequentNumbers() {
        List<Integer> result = TopKFrequentNumbers.findTopKFrequentNumbers(new int[]{1, 3, 5, 12, 11, 12, 11}, 2);
        // top two frequent numbers should be 11 and 12 (both frequency 2). Order is not guaranteed.
        assertEquals(2, result.size());
        assertTrue(result.contains(11));
        assertTrue(result.contains(12));
    }

    @Test
    public void testKGreaterThanUniqueReturnsAllUniques() {
        List<Integer> result = TopKFrequentNumbers.findTopKFrequentNumbers(new int[]{1, 2, 2}, 5);
        // unique elements are 1 and 2
        assertEquals(2, result.size());
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
    }

    @Test
    public void testEmptyArrayReturnsEmptyList() {
        List<Integer> result = TopKFrequentNumbers.findTopKFrequentNumbers(new int[]{}, 3);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testKZeroReturnsEmptyList() {
        List<Integer> result = TopKFrequentNumbers.findTopKFrequentNumbers(new int[]{1, 2, 3}, 0);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testTieFrequenciesAnyValidTopK() {
        List<Integer> result = TopKFrequentNumbers.findTopKFrequentNumbers(new int[]{1,2,3,1,2,3}, 2);
        // all numbers have same frequency (2), so any two of {1,2,3} are acceptable
        assertEquals(2, result.size());
        Set<Integer> allowed = new HashSet<>();
        allowed.add(1); allowed.add(2); allowed.add(3);
        assertTrue(allowed.contains(result.get(0)));
        assertTrue(allowed.contains(result.get(1)));
        // ensure they are distinct
        assertNotEquals(result.get(0), result.get(1));
    }
}

