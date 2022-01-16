package stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestStackArrayImpl {

    @Test
    public void testStack() throws Exception {
        StackWithLinkedListImplImpl stackArray = new StackWithLinkedListImplImpl();
        stackArray.push("a");
        stackArray.push("b");
        stackArray.push("c");

        assertEquals("c", stackArray.pop());
        assertEquals("b", stackArray.pop());
        assertEquals("a", stackArray.pop());
    }

}