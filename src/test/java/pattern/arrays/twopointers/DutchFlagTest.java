package pattern.arrays.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DutchFlagTest {

    @Test
    void shouldSortUsingTwoPointers() {
        int[] arr = {1, 0, 2, 1, 0};
        DutchFlag.sortUsingTwoPointers(arr);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2}, arr);
    }

    @Test
    void shouldSortUsingTwoPointersWithRepeatedTwos() {
        int[] arr = {2, 2, 0, 1, 2, 0};
        DutchFlag.sortUsingTwoPointers(arr);
        assertArrayEquals(new int[]{0, 0, 1, 2, 2, 2}, arr);
    }

    @Test
    void shouldSortEmptyArrayUsingTwoPointers() {
        int[] arr = {};
        DutchFlag.sortUsingTwoPointers(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void shouldSortUsingCollectorsAndMap() {
        int[] arr = {1, 0, 2, 1, 0};
        DutchFlag.sortUsingCollectorsAndMap(arr);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2}, arr);
    }

    @Test
    void shouldSortUsingPriorityQueue() {
        int[] arr = {1, 0, 2, 1, 0};
        DutchFlag.sortUsingPriorityQueue(arr);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2}, arr);
    }
}
