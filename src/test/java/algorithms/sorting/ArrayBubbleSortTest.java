package algorithms.sorting;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayBubbleSortTest {

    @Test
    public void bubbleSortSortsUnsortedArray() {
        assertSortedAfter(new int[]{5, 3, 8, 1, 9, 2}, false);
    }

    @Test
    public void bubbleSortHandlesAlreadySortedArray() {
        assertSortedAfter(new int[]{1, 2, 3, 4, 5}, false);
    }

    @Test
    public void bubbleSortHandlesReverseSortedArray() {
        assertSortedAfter(new int[]{5, 4, 3, 2, 1}, false);
    }

    @Test
    public void bubbleSortHandlesDuplicates() {
        assertSortedAfter(new int[]{4, 2, 4, 1, 2}, false);
    }

    @Test
    public void bubbleSortHandlesSingleElement() {
        assertSortedAfter(new int[]{42}, false);
    }

    @Test
    public void bubbleSortHandlesEmptyArray() {
        assertSortedAfter(new int[]{}, false);
    }

    @Test
    public void bubbleSortEfficientSortsUnsortedArray() {
        assertSortedAfter(new int[]{5, 3, 8, 1, 9, 2}, true);
    }

    @Test
    public void bubbleSortEfficientHandlesReverseSortedArray() {
        assertSortedAfter(new int[]{5, 4, 3, 2, 1}, true);
    }

    @Test
    public void bubbleSortEfficientHandlesDuplicates() {
        assertSortedAfter(new int[]{4, 2, 4, 1, 2}, true);
    }

    @Test
    public void bubbleSortEfficientHandlesEmptyArray() {
        assertSortedAfter(new int[]{}, true);
    }

    private void assertSortedAfter(int[] input, boolean efficient) {
        ArrayBubbleSort sorter = new ArrayBubbleSort(input.length);
        for (int value : input) {
            sorter.insert(value);
        }

        if (efficient) {
            sorter.bubbleSortEfficient();
        } else {
            sorter.bubbleSort();
        }

        List<Integer> actual = capturedDisplayOutput(sorter);
        List<Integer> expected = new ArrayList<>(actual);
        expected.sort(Integer::compareTo);

        assertEquals(expected, actual);
    }

    private List<Integer> capturedDisplayOutput(ArrayBubbleSort sorter) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream captured = new ByteArrayOutputStream();
        try {
            System.setOut(new PrintStream(captured));
            sorter.display();
        } finally {
            System.setOut(originalOut);
        }

        List<Integer> values = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(captured.toString());
        while (tokenizer.hasMoreTokens()) {
            values.add(Integer.parseInt(tokenizer.nextToken()));
        }
        return values;
    }
}
