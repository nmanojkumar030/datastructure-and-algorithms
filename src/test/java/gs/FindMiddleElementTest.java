package gs;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FindMiddleElementTest {

    @Test
    public void shouldThrowExceptionWhenListIsEmptyUsingStreams() {
        List<Integer> integerList = Collections.emptyList();
        FindMiddleElement findMiddleElement = new FindMiddleElement();
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> findMiddleElement.findTheMiddleElementUsingStreams(integerList));
        assertEquals("List is null or empty", illegalArgumentException.getMessage());
    }

    @Test
    public void shouldThrowExceptionWhenListIsNullUsingStreams() {
        FindMiddleElement findMiddleElement = new FindMiddleElement();
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> findMiddleElement.findTheMiddleElementUsingStreams(null));
        assertEquals("List is null or empty", illegalArgumentException.getMessage());
    }

    @Test
    public void shouldReturnTheMiddleElementWhenTheListHasOddNumbersUsingStreams() {
        List<Integer> integerList = List.of(1, 2, 3);
        FindMiddleElement findMiddleElement = new FindMiddleElement();
        assertEquals(2, findMiddleElement.findTheMiddleElementUsingStreams(integerList));
    }

    @Test
    public void shouldReturnTheMiddleElementWhenTheListHasEvenNumbersUsingStreams() {
        List<Integer> integerList = List.of(1, 2, 3, 4);
        FindMiddleElement findMiddleElement = new FindMiddleElement();
        assertEquals(3, findMiddleElement.findTheMiddleElementUsingStreams(integerList));
    }

    @Test
    public void shouldThrowExceptionWhenListIsEmptyUsingPointers() {
        List<Integer> integerList = Collections.emptyList();
        FindMiddleElement findMiddleElement = new FindMiddleElement();
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> findMiddleElement.findTheMiddleElementUsingPointers(integerList));
        assertEquals("List is null or empty", illegalArgumentException.getMessage());
    }

    @Test
    public void shouldThrowExceptionWhenListIsNullUsingPointers() {
        FindMiddleElement findMiddleElement = new FindMiddleElement();
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> findMiddleElement.findTheMiddleElementUsingPointers(null));
        assertEquals("List is null or empty", illegalArgumentException.getMessage());
    }

    @Test
    public void shouldReturnTheMiddleElementWhenTheListHasOddNumbersUsingPointers() {
        List<Integer> integerList = List.of(1, 2, 3);
        FindMiddleElement findMiddleElement = new FindMiddleElement();
        assertEquals(2, findMiddleElement.findTheMiddleElementUsingPointers(integerList));
    }


    @Test
    public void shouldReturnTheMiddleElementWhenTheListHasEvenNumbersUsingPointers() {
        List<Integer> integerList = List.of(1, 2, 3, 4);
        FindMiddleElement findMiddleElement = new FindMiddleElement();
        assertEquals(3, findMiddleElement.findTheMiddleElementUsingPointers(integerList));
    }

}