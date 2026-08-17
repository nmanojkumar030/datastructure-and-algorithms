package pattern.priorityqueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KthLargestElementTest {

    @Test
    void testKthLargestElement() {
        KthLargestElement kthLargestElement = new KthLargestElement(new int[]{4, 5, 8, 2}, 3);
        kthLargestElement.add(3);
        Assertions.assertEquals(4, kthLargestElement.getKthLargestElement());
        kthLargestElement.add(5);
        Assertions.assertEquals(5, kthLargestElement.getKthLargestElement());
        kthLargestElement.add(10);
        Assertions.assertEquals(5, kthLargestElement.getKthLargestElement());
        kthLargestElement.add(9);
        Assertions.assertEquals(8, kthLargestElement.getKthLargestElement());
        kthLargestElement.add(4);
        Assertions.assertEquals(8, kthLargestElement.getKthLargestElement());
    }

}