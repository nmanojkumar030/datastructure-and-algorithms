package pattern.breadthfirstsearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelAverage {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        LevelAverage levelAverage = new LevelAverage();
        List<Double> result = levelAverage.findLevelAverages(root);
        System.out.print("Level averages are: " + result);
    }

    // Time Complexity is O(N), where N is the number of nodes
    // Space Complexity is O(N), as we return list containing N nodes.
    public List<Double> findLevelAverages(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> levelQueue = new LinkedList<>();
        levelQueue.offer(root);

        while (isLevelQueueNotEmpty(levelQueue)) {
            double sum = 0;
            int levelSize = levelQueue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = levelQueue.poll();
                sum += node.val;
                addNodeToQueue(levelQueue, node.left);
                addNodeToQueue(levelQueue, node.right);
            }
            result.add(sum / levelSize);
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
