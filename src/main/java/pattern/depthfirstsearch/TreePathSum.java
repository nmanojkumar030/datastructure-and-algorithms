package pattern.depthfirstsearch;

public class TreePathSum {
    public boolean hasPath(TreeNode root, int targetSum) {
        if (null == root) {
            return false;
        }

        if (root.data == targetSum && null == root.left && null == root.right) {
            return true;
        }

        return hasPath(root.left, targetSum - root.data) || hasPath(root.right, targetSum - root.data);
    }
}

