package pattern.kwaymerge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MergeKSortedListsTest {

    @Test
    public void testMergeUsingPriorityQueueOfListHeads() {
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        ListNode<Integer> listNode1 = new ListNode<Integer>(2);
        listNode1.next = new ListNode<Integer>(6);
        listNode1.next.next = new ListNode<Integer>(8);

        ListNode<Integer> listNode2 = new ListNode<Integer>(3);
        listNode2.next = new ListNode<Integer>(6);
        listNode2.next.next = new ListNode<Integer>(7);

        ListNode<Integer> listNode3 = new ListNode<Integer>(1);
        listNode3.next = new ListNode<Integer>(3);
        listNode3.next.next = new ListNode<Integer>(4);

        ListNode<Integer> sortedListNode = mergeKSortedLists.merge(new ListNode[]{listNode1, listNode2, listNode3});
        assertEquals(1, sortedListNode.data);
        assertEquals(2, sortedListNode.next.data);
        assertEquals(3, sortedListNode.next.next.data);
        assertEquals(3, sortedListNode.next.next.next.data);
        assertEquals(4, sortedListNode.next.next.next.next.data);
        assertEquals(6, sortedListNode.next.next.next.next.next.data);
        assertEquals(6, sortedListNode.next.next.next.next.next.next.data);
        assertEquals(7, sortedListNode.next.next.next.next.next.next.next.data);
        assertEquals(8, sortedListNode.next.next.next.next.next.next.next.next.data);
    }

    @Test
    public void testMergeReturnsNullForEmptyListsArray() {
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        ListNode<Integer> result = mergeKSortedLists.merge(new ListNode[]{});
        assertNull(result);
    }

    @Test
    public void testMerge2ReturnsNullForEmptyListsArray() {
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        ListNode<Integer> result = mergeKSortedLists.merge2(new ListNode[]{});
        assertNull(result);
    }

    @Test
    public void testMergeWithUnequalLengthLists() {
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        ListNode<Integer> listNode1 = new ListNode<Integer>(1);
        listNode1.next = new ListNode<Integer>(4);
        listNode1.next.next = new ListNode<Integer>(5);

        ListNode<Integer> listNode2 = new ListNode<Integer>(1);
        listNode2.next = new ListNode<Integer>(3);
        listNode2.next.next = new ListNode<Integer>(4);

        ListNode<Integer> listNode3 = new ListNode<Integer>(2);
        listNode3.next = new ListNode<Integer>(6);

        ListNode<Integer> sortedListNode = mergeKSortedLists.merge(new ListNode[]{listNode1, listNode2, listNode3});
        assertEquals(1, sortedListNode.data);
        assertEquals(1, sortedListNode.next.data);
        assertEquals(2, sortedListNode.next.next.data);
        assertEquals(3, sortedListNode.next.next.next.data);
        assertEquals(4, sortedListNode.next.next.next.next.data);
        assertEquals(4, sortedListNode.next.next.next.next.next.data);
        assertEquals(5, sortedListNode.next.next.next.next.next.next.data);
        assertEquals(6, sortedListNode.next.next.next.next.next.next.next.data);
    }

    @Test
    public void testMergeKSortedList() {
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        ListNode<Integer> listNode1 = new ListNode<Integer>(2);
        listNode1.next = new ListNode<Integer>(6);
        listNode1.next.next = new ListNode<Integer>(8);

        ListNode<Integer> listNode2 = new ListNode<Integer>(3);
        listNode2.next = new ListNode<Integer>(6);
        listNode2.next.next = new ListNode<Integer>(7);

        ListNode<Integer> listNode3 = new ListNode<Integer>(1);
        listNode3.next = new ListNode<Integer>(3);
        listNode3.next.next = new ListNode<Integer>(4);

        ListNode<Integer> sortedListNode = mergeKSortedLists.merge2(new ListNode[]{listNode1, listNode2, listNode3});
        assertEquals(1, sortedListNode.data);
        assertEquals(2, sortedListNode.next.data);
        assertEquals(3, sortedListNode.next.next.data);
        assertEquals(3, sortedListNode.next.next.next.data);
        assertEquals(4, sortedListNode.next.next.next.next.data);
        assertEquals(6, sortedListNode.next.next.next.next.next.data);
        assertEquals(6, sortedListNode.next.next.next.next.next.next.data);
        assertEquals(7, sortedListNode.next.next.next.next.next.next.next.data);
        assertEquals(8, sortedListNode.next.next.next.next.next.next.next.next.data);
    }
}