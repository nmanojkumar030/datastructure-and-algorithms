package stack;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class JavaUtilStackTest {

    @Test
    public void pushPeekPopBehavior() {
        Stack<String> s = new Stack<>();
        assertTrue(s.isEmpty(), "new stack should be empty");

        s.push("a");
        s.push("b");
        assertEquals(2, s.size(), "size after two pushes");

        // peek shouldn't remove
        assertEquals("b", s.peek(), "peek returns top element");
        assertEquals(2, s.size(), "size unchanged after peek");

        // pop removes
        assertEquals("b", s.pop(), "pop returns and removes top");
        assertEquals(1, s.size(), "size after one pop");
        assertEquals("a", s.peek(), "new top after pop");
    }

    @Test
    public void emptyPopPeekThrows() {
        Stack<Integer> s = new Stack<>();
        assertThrows(EmptyStackException.class, s::pop, "pop on empty should throw");
        assertThrows(EmptyStackException.class, s::peek, "peek on empty should throw");
    }

    @Test
    public void searchAndContains() {
        Stack<String> s = new Stack<>();
        s.push("one");
        s.push("two");
        s.push("three");

        // search uses 1-based position from top
        assertEquals(1, s.search("three"));
        assertEquals(2, s.search("two"));
        assertEquals(3, s.search("one"));
        assertEquals(-1, s.search("absent"));
    }

    @Test
    public void pushNullIsAllowed() {
        Stack<String> s = new Stack<>();
        s.push(null);
        assertFalse(s.isEmpty());
        assertNull(s.peek());
        assertNull(s.pop());
        assertTrue(s.isEmpty());
    }
}

