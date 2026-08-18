package practice.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountUniqueElementsTest {

    @Test
    public void shouldReturnCountOfUniqueElementsCountUsingStreams() {
        List<Integer> integerList = Arrays.asList(5, 2, 8, 2, 9, 1, 5, 8, 3);

        CountUniqueElements  countUniqueElements = new CountUniqueElements();
        assertEquals(6,countUniqueElements.countUniqueUsingStreams(integerList));
    }

    @Test
    public void shouldReturnCountOfUniqueElementsUsingHashSet (){
        List<Integer> integerList = Arrays.asList(5, 2, 8, 2, 9, 1, 5, 8, 3);

        CountUniqueElements  countUniqueElements = new CountUniqueElements();
        assertEquals(6,countUniqueElements.countUniqueUsingHashSet(integerList));
    }

    @Test
    public void shouldReturnCountOfUniqueElementsUsingTreeSet (){
        List<Integer> integerList = Arrays.asList(5, 2, 8, 2, 9, 1, 5, 8, 3);

        CountUniqueElements  countUniqueElements = new CountUniqueElements();
        assertEquals(6,countUniqueElements.countUniqueUsingTreeSet(integerList));
    }

    @Test
    public void shouldReturnCountOfUniqueElementsUsingManualCount (){
        List<Integer> integerList = Arrays.asList(5, 2, 8, 2, 9, 1, 5, 8, 3);

        CountUniqueElements  countUniqueElements = new CountUniqueElements();
        assertEquals(6,countUniqueElements.countUniqueUsingManualMethod(integerList));
    }

    @Test
    public void shouldReturnZeroForEmptyListUsingStreams() {
        CountUniqueElements countUniqueElements = new CountUniqueElements();
        assertEquals(0, countUniqueElements.countUniqueUsingStreams(Collections.emptyList()));
    }

    @Test
    public void shouldReturnZeroForEmptyListUsingHashSet() {
        CountUniqueElements countUniqueElements = new CountUniqueElements();
        assertEquals(0, countUniqueElements.countUniqueUsingHashSet(Collections.emptyList()));
    }

    @Test
    public void shouldReturnZeroForEmptyListUsingTreeSet() {
        CountUniqueElements countUniqueElements = new CountUniqueElements();
        assertEquals(0, countUniqueElements.countUniqueUsingTreeSet(Collections.emptyList()));
    }

    @Test
    public void shouldReturnZeroForEmptyListUsingManualMethod() {
        CountUniqueElements countUniqueElements = new CountUniqueElements();
        assertEquals(0, countUniqueElements.countUniqueUsingManualMethod(Collections.emptyList()));
    }

    @Test
    public void shouldReturnOneForListWithAllDuplicateValuesUsingManualMethod() {
        CountUniqueElements countUniqueElements = new CountUniqueElements();
        assertEquals(1, countUniqueElements.countUniqueUsingManualMethod(Arrays.asList(5, 5, 5)));
    }
}
