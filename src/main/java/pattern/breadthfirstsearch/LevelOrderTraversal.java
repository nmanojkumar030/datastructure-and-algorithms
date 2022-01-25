package pattern.breadthfirstsearch;

import java.util.*;

public class LevelOrderTraversal {

    // Time Complexity is O(N), where N is the number of nodes
    // Space Complexity is O(N), as we return list containing N nodes.
    public List<List<TreeNode>> traverse(TreeNode root) {
        List<List<TreeNode>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> levelQueue = new LinkedList<>();
        levelQueue.offer(root);

        while (!levelQueue.isEmpty()) {
            List<TreeNode> levelList = new ArrayList<>(levelQueue.size());
            int levelSize = levelQueue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = levelQueue.poll();
                levelList.add(node);
                addNodeToQueue(levelQueue, node.left);
                addNodeToQueue(levelQueue, node.right);
            }
            result.add(levelList);
        }
        return result;
    }

    private void addNodeToQueue(Queue<TreeNode> levelQueue, TreeNode left) {
        if (null != left) {
            levelQueue.offer(left);
        }
    }
}

class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    public TreeNode(int val) {
        this.val = val;
    }
}
