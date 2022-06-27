package pattern.breadthfirstsearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

        while (isLevelQueueNotEmpty(levelQueue)) {
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

    private boolean isLevelQueueNotEmpty(Queue<TreeNode> levelQueue) {
        return !levelQueue.isEmpty();
    }

    private void addNodeToQueue(Queue<TreeNode> levelQueue, TreeNode treeNode) {
        if (null != treeNode) {
            levelQueue.offer(treeNode);
        }
    }
}

