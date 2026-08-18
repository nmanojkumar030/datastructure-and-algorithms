package pattern.depthfirstsearch;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinaryTreeTraversalTest {

    private TreeNode buildTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        return root;
    }

    @Test
    void preorderTraversalShouldVisitRootLeftRight() {
        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
        assertEquals(List.of(1, 2, 4, 5, 3), binaryTreeTraversal.preorderTraversal(buildTree()));
    }

    @Test
    void preorderTraversalShouldReturnEmptyListWhenTreeIsNull() {
        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
        assertTrue(binaryTreeTraversal.preorderTraversal(null).isEmpty());
    }

    @Test
    void binaryTreePostorderTraversalShouldVisitLeftRightRoot() {
        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
        assertEquals(List.of(4, 5, 2, 3, 1), binaryTreeTraversal.binaryTreePostorderTraversal(buildTree()));
    }

    @Test
    void binaryTreePostorderTraversalShouldReturnEmptyListWhenTreeIsNull() {
        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
        assertTrue(binaryTreeTraversal.binaryTreePostorderTraversal(null).isEmpty());
    }

    @Test
    void binaryTreeInorderTraversalShouldVisitLeftRootRight() {
        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
        assertEquals(List.of(4, 2, 5, 1, 3), binaryTreeTraversal.binaryTreeInorderTraversal(buildTree()));
    }

    @Test
    void binaryTreeInorderTraversalShouldReturnEmptyListWhenTreeIsNull() {
        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
        assertTrue(binaryTreeTraversal.binaryTreeInorderTraversal(null).isEmpty());
    }

    @Test
    void binaryTreeLevelOrderTraversalShouldGroupNodesByLevel() {
        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
        List<List<Integer>> result = binaryTreeTraversal.binaryTreeLevelOrderTraversal(buildTree());
        assertEquals(List.of(List.of(1), List.of(2, 3), List.of(4, 5)), result);
    }

    @Test
    void binaryTreeLevelOrderTraversalShouldReturnEmptyListWhenTreeIsNull() {
        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
        assertTrue(binaryTreeTraversal.binaryTreeLevelOrderTraversal(null).isEmpty());
    }

    @Test
    void binaryTreeZigzagLevelOrderTraversalShouldAlternateDirectionPerLevel() {
        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
        List<List<Integer>> result = binaryTreeTraversal.binaryTreeZigzagLevelOrderTraversal(buildTree());
        assertEquals(List.of(List.of(1), List.of(3, 2), List.of(4, 5)), result);
    }

    @Test
    void binaryTreeZigzagLevelOrderTraversalShouldReturnEmptyListWhenTreeIsNull() {
        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
        assertTrue(binaryTreeTraversal.binaryTreeZigzagLevelOrderTraversal(null).isEmpty());
    }

    @Test
    void binaryTreeLevelOrderTraversalBottomUpShouldReverseLevelOrder() {
        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
        List<List<Integer>> result = binaryTreeTraversal.binaryTreeLevelOrderTraversalBottomUp(buildTree());
        assertEquals(List.of(List.of(4, 5), List.of(2, 3), List.of(1)), result);
    }

    @Test
    void binaryTreeLevelOrderTraversalBottomUpShouldReturnEmptyListWhenTreeIsNull() {
        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
        assertTrue(binaryTreeTraversal.binaryTreeLevelOrderTraversalBottomUp(null).isEmpty());
    }
}
