package pattern.depthfirstsearch;

public class SumOfPathNumbers {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(5);
        SumOfPathNumbers sumOfPathNumbers = new SumOfPathNumbers();
        System.out.println("Total Sum of Path Numbers: " + sumOfPathNumbers.findSumOfPathNumbers(root));
    }

    public int findSumOfPathNumbers(TreeNode root) {
        return findSumOfPathRecursive(root, 0);
    }

    private int findSumOfPathRecursive(TreeNode node, int targetSum) {
        if (node == null) {
            return 0;
        }
        targetSum = targetSum * 10 + node.data;
        if (node.left == null && node.right == null) {
            return targetSum;
        }

        return findSumOfPathRecursive(node.left, targetSum) + findSumOfPathRecursive(node.right, targetSum);
    }
}
