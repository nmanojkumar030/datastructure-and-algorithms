package datastructures.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackWithArrayImplTest {

    @Test
    public void pushPopLIFOAndPeek() throws Exception {
        StackWithArrayImpl<String> s = new StackWithArrayImpl<>();
        s.push("a");
        s.push("b");
        s.push("c");

        // peek/top should return the last pushed element without removing it
        assertEquals("c", s.peek());
        assertFalse(s.isEmpty());

        // pops should follow LIFO order
        assertEquals("c", s.pop());
        assertEquals("b", s.pop());
        assertEquals("a", s.pop());
        assertTrue(s.isEmpty());
    }

    @Test
    public void overflowThrowsException() throws Exception {
        StackWithArrayImpl<Integer> s = new StackWithArrayImpl<>();
        // push up to the intended capacity
        for (int i = 0; i < 10; i++) {
            s.push(i);
        }
        // pushing beyond capacity should throw an exception (implementation may throw ArrayIndexOutOfBounds or a custom Exception)
        assertThrows(Exception.class, () -> s.push(10));
    }

    @Test
    public void pushNullAllowed() throws Exception {
        StackWithArrayImpl<String> s = new StackWithArrayImpl<>();
        s.push(null);
        s.push("x");

        assertEquals("x", s.pop());
        assertNull(s.pop());
        assertTrue(s.isEmpty());
    }
}
