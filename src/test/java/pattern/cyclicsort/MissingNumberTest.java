package pattern.cyclicsort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MissingNumberTest {

    @Test
    public void testMissingNumber1() {
        MissingNumber missingNumber = new MissingNumber();
        int result = missingNumber.findMissingNumber(new int[]{4, 0, 3, 1});
        assertEquals(2, result);
    }

    @Test
    public void testMissingNumber2() {
        MissingNumber missingNumber = new MissingNumber();
        int result = missingNumber.findMissingNumber(new int[]{8, 3, 5, 2, 4, 6, 0, 1});
        assertEquals(7, result);
    }
}