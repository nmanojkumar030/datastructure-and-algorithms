package pattern.reverselinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReverseEveryKElementsTest {

    private ListNode buildList(int... values) {
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    private void assertListEquals(ListNode head, int... expected) {
        ListNode current = head;
        for (int value : expected) {
            assertEquals(value, current.value);
            current = current.next;
        }
        assertNull(current);
    }

    @Test
    void shouldReverseEveryKSizedSubList() {
        ListNode head = buildList(1, 2, 3, 4, 5, 6, 7, 8);
        ListNode result = ReverseEveryKElements.reverse(head, 3);
        assertListEquals(result, 3, 2, 1, 6, 5, 4, 8, 7);
    }

    @Test
    void shouldReturnListUnchangedWhenKIsOne() {
        ListNode head = buildList(1, 2, 3, 4, 5);
        ListNode result = ReverseEveryKElements.reverse(head, 1);
        assertListEquals(result, 1, 2, 3, 4, 5);
    }

    @Test
    void shouldReverseWholeListWhenKEqualsListLength() {
        ListNode head = buildList(1, 2, 3, 4);
        ListNode result = ReverseEveryKElements.reverse(head, 4);
        assertListEquals(result, 4, 3, 2, 1);
    }

    @Test
    void shouldReverseTrailingSubListWhenKDoesNotEvenlyDivideLength() {
        ListNode head = buildList(1, 2, 3, 4, 5);
        ListNode result = ReverseEveryKElements.reverse(head, 2);
        assertListEquals(result, 2, 1, 4, 3, 5);
    }
}
