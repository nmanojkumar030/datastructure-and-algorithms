package pattern.cyclicsort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCyclicSort {

    @Test
    public void testSort_sortedInput() {
        CyclicSort cyclicSort = new CyclicSort();
        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6};

        cyclicSort.sort(inputArray);

        assertEquals(1, inputArray[0]);
        assertEquals(2, inputArray[1]);
        assertEquals(3, inputArray[2]);
        assertEquals(4, inputArray[3]);
        assertEquals(5, inputArray[4]);
        assertEquals(6, inputArray[5]);
    }

    @Test
    public void testSort_unsortedInput() {
        CyclicSort cyclicSort = new CyclicSort();
        int[] inputArray = new int[]{6, 2, 4, 3, 1, 5};

        cyclicSort.sort(inputArray);

        assertEquals(1, inputArray[0]);
        assertEquals(2, inputArray[1]);
        assertEquals(3, inputArray[2]);
        assertEquals(4, inputArray[3]);
        assertEquals(5, inputArray[4]);
        assertEquals(6, inputArray[5]);
    }
}