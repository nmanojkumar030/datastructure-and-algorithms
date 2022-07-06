package pattern.depthfirstsearch;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CountAllPathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        CountAllPathSum countAllPathSum = new CountAllPathSum();
        System.out.println("Tree has path: " + countAllPathSum.countPaths(root, 11));
    }

    public int countPaths(TreeNode root, int targetSum) {
        List<TreeNode> currentPath = new ArrayList<>();
        countPathsMatchingSumRecursively(root, targetSum, currentPath);
        return currentPath.size();
    }

    private int countPathsMatchingSumRecursively(TreeNode node, int targetSum, List<TreeNode> currentPath) {
        if (node == null) {
            return 0;
        }
        currentPath.add(node);

        int pathSum = 0;
        int pathCount = 0;
        ListIterator<TreeNode> listIterator = currentPath.listIterator();
        while (listIterator.hasPrevious()) {
            TreeNode previousNode = listIterator.previous();
            pathSum += previousNode.data;

            if (pathSum == targetSum) {
                pathCount++;
            }
        }

        pathCount += countPathsMatchingSumRecursively(node.left, targetSum, currentPath);
        pathCount += countPathsMatchingSumRecursively(node.right, targetSum, currentPath);

        return pathCount;
    }
}
