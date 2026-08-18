package practice.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MostFrequentElementsTest {

    private static final int[] INPUT = {6, 6, 6, 7, 7, 9};

    @Test
    void shouldReturnTopKElementsPaddedWithZeroWhenKExceedsUniqueCount() {
        assertArrayEquals(new int[]{6, 7, 9, 0}, MostFrequentElements.findKMostFrequentElements(INPUT, 4));
        assertArrayEquals(new int[]{6, 7, 9, 0}, MostFrequentElements.findKMostFrequentElementsUsingPriorityQueue(INPUT, 4));
    }

    @Test
    void shouldReturnTopKElementsWithoutPaddingUsingStreamsWhenKExceedsUniqueCount() {
        assertArrayEquals(new int[]{6, 7, 9}, MostFrequentElements.findKMostFrequentElementsUsingStreams(INPUT, 4));
    }

    @Test
    void shouldReturnTopKElementsWhenKIsSmallerThanUniqueCount() {
        assertArrayEquals(new int[]{6, 7}, MostFrequentElements.findKMostFrequentElements(INPUT, 2));
        assertArrayEquals(new int[]{6, 7}, MostFrequentElements.findKMostFrequentElementsUsingPriorityQueue(INPUT, 2));
        assertArrayEquals(new int[]{6, 7}, MostFrequentElements.findKMostFrequentElementsUsingStreams(INPUT, 2));
    }

    @Test
    void shouldReturnEmptyArrayWhenKIsZero() {
        assertArrayEquals(new int[]{}, MostFrequentElements.findKMostFrequentElements(INPUT, 0));
        assertArrayEquals(new int[]{}, MostFrequentElements.findKMostFrequentElementsUsingPriorityQueue(INPUT, 0));
        assertArrayEquals(new int[]{}, MostFrequentElements.findKMostFrequentElementsUsingStreams(INPUT, 0));
    }
}
