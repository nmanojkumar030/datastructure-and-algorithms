package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackWithLinkedListImplTest {

    @Test
    public void popOnEmptyThrowsUnderflow() {
        StackWithLinkedListImpl<String> s = new StackWithLinkedListImpl<>();
        assertThrows(Exception.class, s::pop);
    }

    @Test
    public void peekDoesNotRemove() throws Exception {
        StackWithLinkedListImpl<Integer> s = new StackWithLinkedListImpl<>();
        s.push(1);
        s.push(2);

        Integer peek = s.peek();
        Integer popped = s.pop();

        assertEquals(peek, popped);
        assertEquals(Integer.valueOf(2), peek);
        // one element should remain after one pop
        assertFalse(s.isEmpty());
        // pop remaining element and assert empty
        assertEquals(Integer.valueOf(1), s.pop());
        assertTrue(s.isEmpty());
    }

    @Test
    public void genericsAndNulls() throws Exception {
        StackWithLinkedListImpl<Integer> s = new StackWithLinkedListImpl<>();
        s.push(10);
        s.push(null);
        s.push(20);

        assertEquals(Integer.valueOf(20), s.pop());
        assertNull(s.pop());
        assertEquals(Integer.valueOf(10), s.pop());
        assertTrue(s.isEmpty());
    }
}