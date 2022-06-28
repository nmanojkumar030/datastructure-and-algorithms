package pattern.breadthfirstsearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/m2N6GwARL8r
 * <p>
 * Given a binary tree, populate an array to represent its level-by-level traversal in reverse order, i.e., the lowest level comes first.
 * You should populate the values of all nodes in each level from left to right in separate sub-arrays.
 */
public class ReverseLevelOrderTraversal {

    // Time Complexity - O(N), Space Complexity O(N)
    public List<List<TreeNode>> traverse(TreeNode root) {
        List<List<TreeNode>> reverseOrderTraverseList = new LinkedList<>(); // Using Linked List to append the elements at the beginning.

        if (root == null) {
            return reverseOrderTraverseList;
        }

        Queue<TreeNode> levelQueue = new LinkedList<>();
        levelQueue.offer(root);

        while (isLevelQueueNotEmpty(levelQueue)) {
            List<TreeNode> levelList = new ArrayList<>(levelQueue.size());

            final int size = levelQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = levelQueue.poll();
                addNodeToQueue(levelQueue, treeNode.left);
                addNodeToQueue(levelQueue, treeNode.right);
                levelList.add(treeNode);
            }
            reverseOrderTraverseList.add(0, levelList);
        }
        return reverseOrderTraverseList;
    }

    private boolean isLevelQueueNotEmpty(Queue<TreeNode> levelQueue) {
        return !levelQueue.isEmpty();
    }

    private void addNodeToQueue(Queue<TreeNode> levelQueue, TreeNode treeNode) {
        if (null != treeNode) {
            levelQueue.offer(treeNode);
        }
    }
}
