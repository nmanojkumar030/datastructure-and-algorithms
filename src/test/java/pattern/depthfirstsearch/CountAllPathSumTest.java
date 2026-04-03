package pattern.depthfirstsearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountAllPathSumTest {

    @Test
    void shouldCountPathsThatSumToTargetValue() {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        CountAllPathSum countAllPathSum = new CountAllPathSum();
        assertEquals(2, countAllPathSum.countPaths(root, 11));
    }

    @Test
    void shouldReturnZeroWhenTreeIsEmpty() {
        CountAllPathSum countAllPathSum = new CountAllPathSum();
        assertEquals(0, countAllPathSum.countPaths(null, 11));
    }

    @Test
    void shouldCountAllPathsWithMultipleMatchesInComplexTree() {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        CountAllPathSum countAllPathSum = new CountAllPathSum();
        assertEquals(2, countAllPathSum.countPaths(root, 11));
    }
}