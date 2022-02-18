package pattern.depthfirstsearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TreePathSumTest {

    @Test
    public void testHasPath_emptyTree() {
        TreePathSum treePathSum = new TreePathSum();
        boolean result = treePathSum.hasPath(null, 23);
        assertFalse(result);
    }

    @Test
    public void testHasPath() {
        TreePathSum treePathSum = new TreePathSum();
        TreePathSum.TreeNode root = new TreePathSum.TreeNode(12);
        root.left = new TreePathSum.TreeNode(7);
        root.right = new TreePathSum.TreeNode(1);
        root.left.left = new TreePathSum.TreeNode(9);
        root.right.left = new TreePathSum.TreeNode(10);
        root.right.right = new TreePathSum.TreeNode(5);

        boolean result = treePathSum.hasPath(root, 23);
        assertTrue(result);
    }
}