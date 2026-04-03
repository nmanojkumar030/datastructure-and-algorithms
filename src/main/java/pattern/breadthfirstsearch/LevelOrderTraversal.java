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

        while (!levelQueue.isEmpty()) {
            List<TreeNode> levelList = new ArrayList<>(levelQueue.size());
            int levelSize = levelQueue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = levelQueue.poll();
                levelList.add(node);
                if (null != node.left) {
                    levelQueue.offer(node.left);
                }
                if (null != node.right) {
                    levelQueue.offer(node.right);
                }
            }
            result.add(levelList);
        }
        return result;
    }
}

