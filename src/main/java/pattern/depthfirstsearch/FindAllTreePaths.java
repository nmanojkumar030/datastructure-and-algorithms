package pattern.depthfirstsearch;

import java.util.ArrayList;
import java.util.List;

public class FindAllTreePaths {

    public List<List<Integer>> findAllPathSum(TreeNode node, int targetSum) {
        List<List<Integer>> allTreePaths = new ArrayList<>();
        findPathSumRecursively(node, targetSum, allTreePaths, new ArrayList<>());
        return allTreePaths;
    }

    private void findPathSumRecursively(TreeNode node, int targetSum, List<List<Integer>> allTreePaths,
                                                       List<Integer> currentPath) {
        if (node == null) {
            return;
        }
        currentPath.add(node.data);
        if (node.data == targetSum && node.left == null && node.right == null) {
            allTreePaths.add(new ArrayList<>(currentPath));
        }
        findPathSumRecursively(node.left, targetSum - node.data, allTreePaths, currentPath);
        findPathSumRecursively(node.right, targetSum-node.data, allTreePaths, currentPath);
        currentPath.remove(currentPath.size() - 1);
    }
}
