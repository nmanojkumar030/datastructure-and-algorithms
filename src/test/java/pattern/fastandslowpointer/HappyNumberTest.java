package pattern.fastandslowpointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HappyNumberTest {

    @Test
    void findShouldReturnTrueForHappyNumber() {
        assertTrue(HappyNumber.find(23));
    }

    @Test
    void findShouldReturnFalseForNonHappyNumber() {
        assertFalse(HappyNumber.find(12));
    }

    @Test
    void findShouldReturnTrueForOne() {
        assertTrue(HappyNumber.find(1));
    }

    @Test
    void findShouldReturnFalseForNumberStuckInCycle() {
        assertFalse(HappyNumber.find(2));
    }
}
