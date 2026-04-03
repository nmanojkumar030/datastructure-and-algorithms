package pattern.depthfirstsearch;

public class SumOfPathNumbers {

    public int sumNumbers(TreeNode root) {
        return sumNumbersRecursively(root, 0);
    }

    private int sumNumbersRecursively(TreeNode node, int targetSum) {
        if (node == null) {
            return 0;
        }
        targetSum = targetSum * 10 + node.data;
        if (node.left == null && node.right == null) {
            return targetSum;
        }
        return sumNumbersRecursively(node.left, targetSum) + sumNumbersRecursively(node.right, targetSum);
    }
}
