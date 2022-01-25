package stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestStackArrayImpl {

    @Test
    public void testStack() throws Exception {
        StackWithArrayImpl stackArray = new StackWithArrayImpl();
        stackArray.push("a");
        stackArray.push("b");
        stackArray.push("c");

        assertEquals("c", stackArray.pop());
        assertEquals("b", stackArray.pop());
        assertEquals("a", stackArray.pop());
    }

}