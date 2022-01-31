package pattern.kwaymerge;

import java.util.PriorityQueue;

/**
 * Given an array of ‘K’ sorted LinkedLists, merge them into one sorted list.
 * <p>
 * Input: L1=[2, 6, 8],
 * L2=[3, 6, 7],
 * L3=[1, 3, 4]
 * Output: [1, 2, 3, 3, 4, 6, 6, 7, 8]
 */
public class MergeKSortedLists {

    public ListNode merge(ListNode[] lists) {
        ListNode resultHead = null;
        ListNode resultTail = null;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((o1, o2) -> o1.data - o2.data);

        for (ListNode listNode : lists) {
            minHeap.offer(listNode);
        }

        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            if (resultHead == null) {
                resultHead = node;
                resultTail = node;
            } else {
                resultTail.next = node;
                resultTail = node;
            }
            if (null != node.next) {
                minHeap.offer(node.next);
            }
        }
        resultTail.next = null;
        return resultHead;
    }

    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }
}
