package pattern.depthfirstsearch;

import java.util.ArrayList;
import java.util.List;

public class FindAllTreePaths {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        int sum = 23;
        FindAllTreePaths findAllTreePaths = new FindAllTreePaths();
        List<List<Integer>> result = findAllTreePaths.findPaths(root, sum);
        System.out.println("Tree paths with sum " + sum + ": " + result);
    }

    public List<List<Integer>> findPaths(TreeNode node, int sum) {
        List<List<Integer>> allTreePaths = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        findPathRecursive(node, sum, allTreePaths, currentPath);
        return allTreePaths;
    }

    private void findPathRecursive(TreeNode node, int targetSum, List<List<Integer>> allTreePaths, List<Integer> currentPath) {
        if (node == null) {
            return;
        }

        currentPath.add(node.data);
        if (node.data == targetSum && node.left == null && node.right == null) {
            allTreePaths.add(new ArrayList<>(currentPath));
        }

        findPathRecursive(node.left, targetSum - node.data, allTreePaths, currentPath);
        findPathRecursive(node.right, targetSum - node.data, allTreePaths, currentPath);
        currentPath.remove(currentPath.size() - 1);
    }

}
