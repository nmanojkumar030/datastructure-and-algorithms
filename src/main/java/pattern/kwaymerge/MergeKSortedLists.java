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

    public ListNode<Integer> merge(ListNode<Integer>[] lists) {
        ListNode<Integer> resultHead = null;
        ListNode<Integer> resultTail = null;
        PriorityQueue<ListNode<Integer>> minHeap = new PriorityQueue<>((o1, o2) -> o1.data - o2.data);

        for (ListNode<Integer> listNode : lists) {
            minHeap.offer(listNode);
        }

        while (!minHeap.isEmpty()) {
            ListNode<Integer> node = minHeap.poll();
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

    public ListNode<Integer> merge2(ListNode<Integer>[] lists) {
        ListNode<Integer>  result = null;

        if (lists == null || lists.length == 0) {
            return result;
        }

        PriorityQueue<ListNode<Integer>> minHeap = new PriorityQueue<>((o1, o2) -> o1.data - o2.data);

        for (ListNode<Integer> listNode : lists) {
            ListNode<Integer> currentNode = listNode;

            while (currentNode != null) {
                minHeap.offer(currentNode);
                currentNode = currentNode.next;
            }
        }

        ListNode<Integer> tailNode = null;
        while (!minHeap.isEmpty()) {
            ListNode<Integer> node = minHeap.poll();
            if (result == null) {
                result = node;
                tailNode = node;
            } else {
                tailNode.next = node;
                tailNode = node;
            }
        }

        return result;
    }
}
