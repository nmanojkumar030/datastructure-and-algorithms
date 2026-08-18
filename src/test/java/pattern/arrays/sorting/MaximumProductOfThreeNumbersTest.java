package pattern.arrays.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumProductOfThreeNumbersTest {

    @Test
    void shouldFindMaxProductOfPositiveNumbers() {
        MaximumProductOfThreeNumbers sol = new MaximumProductOfThreeNumbers();
        assertEquals(24, sol.maximumProduct(new int[]{1, 2, 3, 4}));
    }

    @Test
    void shouldPreferTwoLargestNegativesWithLargestPositive() {
        MaximumProductOfThreeNumbers sol = new MaximumProductOfThreeNumbers();
        assertEquals(8, sol.maximumProduct(new int[]{-1, -2, 3, 4}));
    }

    @Test
    void shouldFindMaxProductOfExactlyThreeNumbers() {
        MaximumProductOfThreeNumbers sol = new MaximumProductOfThreeNumbers();
        assertEquals(6, sol.maximumProduct(new int[]{1, 2, 3}));
    }

    @Test
    void shouldFindMaxProductWithAllNegativeNumbers() {
        MaximumProductOfThreeNumbers sol = new MaximumProductOfThreeNumbers();
        assertEquals(-6, sol.maximumProduct(new int[]{-5, -4, -3, -2, -1}));
    }
}
