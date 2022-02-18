package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackArrayImplTest {

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