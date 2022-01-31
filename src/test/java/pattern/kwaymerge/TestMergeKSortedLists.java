package pattern.kwaymerge;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMergeKSortedLists {

    @Test
    public void testMergeKSortedList() {
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        MergeKSortedLists.ListNode listNode1 = new MergeKSortedLists.ListNode(2);
        listNode1.next = new MergeKSortedLists.ListNode(6);
        listNode1.next.next = new MergeKSortedLists.ListNode(8);

        MergeKSortedLists.ListNode listNode2 = new MergeKSortedLists.ListNode(3);
        listNode2.next = new MergeKSortedLists.ListNode(6);
        listNode2.next.next = new MergeKSortedLists.ListNode(7);

        MergeKSortedLists.ListNode listNode3 = new MergeKSortedLists.ListNode(1);
        listNode3.next = new MergeKSortedLists.ListNode(3);
        listNode3.next.next = new MergeKSortedLists.ListNode(4);

        MergeKSortedLists.ListNode sortedListNode = mergeKSortedLists.merge(new MergeKSortedLists.ListNode[]{listNode1, listNode2, listNode3});
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