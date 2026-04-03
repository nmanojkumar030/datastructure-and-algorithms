package pattern.depthfirstsearch;

import java.util.ArrayList;
import java.util.List;

public class CountAllPathSum {

    public int countPaths(TreeNode node, int targetSum) {
        return findPathCountRecursively(node, targetSum, new ArrayList<>());
    }

    private int findPathCountRecursively(TreeNode node, int targetSum, List<TreeNode> currentPath) {
        int pathSumCount = 0;
        if (node == null) {
            return pathSumCount;
        }

        currentPath.add(node);
        int pathSum = 0;

        for (int i = currentPath.size() - 1; i >= 0; i--) {
            TreeNode previousNode = currentPath.get(i);
            pathSum += previousNode.data;
            if (pathSum == targetSum) {
                pathSumCount++;
            }
        }

        pathSumCount += findPathCountRecursively(node.left, targetSum, currentPath);
        pathSumCount += findPathCountRecursively(node.right, targetSum, currentPath);
        return pathSumCount;
    }
}
