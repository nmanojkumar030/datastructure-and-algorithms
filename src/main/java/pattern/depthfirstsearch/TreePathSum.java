package pattern.depthfirstsearch;

public class TreePathSum {
    public boolean hasPathSum(TreeNode node, int targetSum) {
        if (null == node) {
            return false;
        }
        if (node.data == targetSum && node.left == null && node.right == null) {
            return true;
        }

        return hasPathSum(node.left, targetSum - node.data) ||
                hasPathSum(node.right, targetSum - node.data);
    }
}

