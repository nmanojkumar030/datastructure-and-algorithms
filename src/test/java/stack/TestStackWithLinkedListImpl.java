package stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestStackWithLinkedListImpl {

    @Test
    public void testStack() throws Exception {
        StackWithLinkedListImplImpl stackWithLinkedListImpl = new StackWithLinkedListImplImpl();
        stackWithLinkedListImpl.push("a");
        stackWithLinkedListImpl.push("b");
        stackWithLinkedListImpl.push("c");

        assertEquals("c", stackWithLinkedListImpl.pop());
        assertEquals("b", stackWithLinkedListImpl.pop());
        assertEquals("a", stackWithLinkedListImpl.pop());
    }
}