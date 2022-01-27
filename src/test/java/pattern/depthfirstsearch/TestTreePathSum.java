package pattern.depthfirstsearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestTreePathSum {

    @Test
    public void testHasPath_emptyTree() {
        TreePathSum treePathSum = new TreePathSum();
        boolean result = treePathSum.hasPath(null, 23);
        assertFalse(result);
    }

    @Test
    public void testHasPath() {
        TreePathSum treePathSum = new TreePathSum();
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        boolean result = treePathSum.hasPath(root, 23);
        assertTrue(result);
    }
}