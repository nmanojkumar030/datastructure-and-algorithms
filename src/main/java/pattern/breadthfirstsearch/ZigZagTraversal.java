package pattern.breadthfirstsearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        root.right.left.left = new TreeNode(20);
        root.right.left.right = new TreeNode(17);
        ZigZagTraversal zigzagTraversal = new ZigZagTraversal();
        List<List<TreeNode>> result = zigzagTraversal.traverse(root);
        System.out.println("Zigzag traversal: " + result);
    }

    // Time Complexity is O(N), where N is the number of nodes
    // Space Complexity is O(N), as we return list containing N nodes.
    public List<List<TreeNode>> traverse(TreeNode root) {
        List<List<TreeNode>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> levelQueue = new LinkedList<>();
        levelQueue.offer(root);
        boolean leftToRight = true;
        while (isLevelQueueNotEmpty(levelQueue)) {
            List<TreeNode> levelList = new LinkedList<>();
            int levelSize = levelQueue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = levelQueue.poll();
                if (leftToRight) {
                    levelList.add(node);
                }
                levelList.add(0, node);
                addNodeToQueue(levelQueue, node.left);
                addNodeToQueue(levelQueue, node.right);
            }
            result.add(levelList);
            leftToRight = false;
        }
        return result;
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

