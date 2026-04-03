package pattern.depthfirstsearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaryTreePathSumTest {

    @Test
    public void hasPathShouldReturnFalseWhenTreeIsNull() {
        TreePathSum treePathSum = new TreePathSum();
        boolean result = treePathSum.hasPathSum(null, 23);
        assertFalse(result);
    }

    @Test
    public void hasPathShouldReturnTrueWhenPathExists() {
        TreePathSum treePathSum = new TreePathSum();
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        boolean result = treePathSum.hasPathSum(root, 23);
        assertTrue(result);
    }

    @Test
    public void hasPathSumShouldReturnFalseWhenTreeIsNull() {
        TreePathSum treePathSum = new TreePathSum();
        boolean result = treePathSum.hasPathSum(null, 23);
        assertFalse(result);
    }

    @Test
    public void hasPathSumShouldReturnTrueForSingleNodeWithMatchingSum() {
        TreePathSum treePathSum = new TreePathSum();
        TreeNode root = new TreeNode(12);

        boolean result = treePathSum.hasPathSum(root, 12);
        assertTrue(result);
    }

    @Test
    public void hasPathSumShouldReturnTrueForPathWithLeftChild() {
        TreePathSum treePathSum = new TreePathSum();
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(11);

        boolean result = treePathSum.hasPathSum(root, 23);
        assertTrue(result);
    }

    @Test
    public void hasPathSumShouldReturnTrueForPathWithRightChild() {
        TreePathSum treePathSum = new TreePathSum();
        TreeNode root = new TreeNode(12);
        root.right = new TreeNode(11);

        boolean result = treePathSum.hasPathSum(root, 23);
        assertTrue(result);
    }

    @Test
    public void hasPathSumShouldReturnTrueForComplexTreeWithMultiplePaths() {
        TreePathSum treePathSum = new TreePathSum();
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        boolean result = treePathSum.hasPathSum(root, 23);
        assertTrue(result);
    }
}