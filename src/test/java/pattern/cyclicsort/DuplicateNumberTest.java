package pattern.cyclicsort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateNumberTest {

    @Test
    public void testFindNumber_duplicateAtEnd() {
        assertEquals(4, DuplicateNumber.findNumber(new int[]{1, 4, 4, 3, 2}));
    }

    @Test
    public void testFindNumber_duplicateInMiddle() {
        assertEquals(3, DuplicateNumber.findNumber(new int[]{2, 1, 3, 3, 5, 4}));
    }

    @Test
    public void testFindNumber_repeatedMultipleTimes() {
        assertEquals(4, DuplicateNumber.findNumber(new int[]{2, 4, 1, 4, 4}));
    }

    @Test
    public void testFindNumber_noDuplicate() {
        assertEquals(-1, DuplicateNumber.findNumber(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testFindNumber_singleElement() {
        assertEquals(-1, DuplicateNumber.findNumber(new int[]{1}));
    }
}
