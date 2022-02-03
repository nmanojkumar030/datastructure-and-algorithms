package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStackWithLinkedListImpl {

    @Test
    public void testStack() throws Exception {
        StackWithArrayImpl stackWithLinkedListImpl = new StackWithArrayImpl();
        stackWithLinkedListImpl.push("a");
        stackWithLinkedListImpl.push("b");
        stackWithLinkedListImpl.push("c");

        assertEquals("c", stackWithLinkedListImpl.pop());
        assertEquals("b", stackWithLinkedListImpl.pop());
        assertEquals("a", stackWithLinkedListImpl.pop());
    }
}