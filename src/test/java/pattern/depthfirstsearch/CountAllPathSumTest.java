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
    void shouldReturnZeroWhenNoPathMatchesTargetInNonEmptyTree() {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        CountAllPathSum countAllPathSum = new CountAllPathSum();
        assertEquals(0, countAllPathSum.countPaths(root, 100));
    }

    @Test
    void shouldCountSingleNodeWhenNodeValueEqualsTarget() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);

        CountAllPathSum countAllPathSum = new CountAllPathSum();
        assertEquals(1, countAllPathSum.countPaths(root, 5));
    }

    @Test
    void shouldCountLongPathInSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        CountAllPathSum countAllPathSum = new CountAllPathSum();
        assertEquals(1, countAllPathSum.countPaths(root, 9));
    }

    @Test
    void shouldCountPathsWithNegativeNodeValues() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(-1);
        root.right = new TreeNode(1);

        CountAllPathSum countAllPathSum = new CountAllPathSum();
        assertEquals(2, countAllPathSum.countPaths(root, -1));
    }

    @Test
    void shouldCountOverlappingMatchesAlongSameBranch() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(5);

        CountAllPathSum countAllPathSum = new CountAllPathSum();
        assertEquals(3, countAllPathSum.countPaths(root, 5));
    }
}