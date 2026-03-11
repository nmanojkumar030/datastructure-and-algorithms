package pattern.priorityqueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementTest {

    @Test
    void testKthLargestElement() {
        KthLargestElement kthLargestElement = new KthLargestElement(new int[]{4,5,8,2}, 3);
        Assertions.assertEquals(4, kthLargestElement.add(3));
        Assertions.assertEquals(5, kthLargestElement.add(5));
        Assertions.assertEquals(5, kthLargestElement.add(10));
        Assertions.assertEquals(8, kthLargestElement.add(9));
        Assertions.assertEquals(8, kthLargestElement.add(4));
    }

}