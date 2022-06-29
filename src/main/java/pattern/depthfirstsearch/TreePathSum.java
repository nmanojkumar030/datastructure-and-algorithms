package pattern.depthfirstsearch;

public class TreePathSum {
    public boolean hasPath(TreeNode node, int targetSum) {
        if (null == node) {
            return false;
        }

        if (node.data == targetSum && null == node.left && null == node.right) { // Has Path and its leaf node
            return true;
        }

        return hasPath(node.left, targetSum - node.data) || hasPath(node.right, targetSum - node.data);
    }
}

