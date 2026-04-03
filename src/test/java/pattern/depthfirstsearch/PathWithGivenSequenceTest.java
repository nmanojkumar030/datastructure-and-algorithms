package pattern.depthfirstsearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathWithGivenSequenceTest {

    @Test
    void findPathShouldReturnTrueWhenTheGivenSequenceMatch() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(5);

        PathWithGivenSequence pathWithGivenSequence = new PathWithGivenSequence();
        Assertions.assertFalse(pathWithGivenSequence.findPath(root, new int[]{1, 0, 7}));
    }

    @Test
    void findPathShouldReturnFalseWhenTheGivenSequenceDoesNotMatch() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(5);

        PathWithGivenSequence pathWithGivenSequence = new PathWithGivenSequence();
        Assertions.assertTrue(pathWithGivenSequence.findPath(root, new int[]{1, 1, 6}));
    }
}