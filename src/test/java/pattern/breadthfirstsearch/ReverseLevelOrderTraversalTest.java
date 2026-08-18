package pattern.breadthfirstsearch;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLevelOrderTraversalTest {
    @Test
    public void testEmptyTree() {
        ReverseLevelOrderTraversal reverseLevelOrderTraversal = new ReverseLevelOrderTraversal();
        List<List<TreeNode>> result = reverseLevelOrderTraversal.traverse(null);
        assertEquals(0, result.size());
    }

    @Test
    public void testOneNodeTree() {
        ReverseLevelOrderTraversal reverseLevelOrderTraversal = new ReverseLevelOrderTraversal();
        List<List<TreeNode>> result = reverseLevelOrderTraversal.traverse(new TreeNode(12));
        assertEquals(1, result.size());
        assertTrue(result.get(0).get(0).val == 12);
    }

    @Test
    public void testLevelOrderTravseral() {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        ReverseLevelOrderTraversal reverseLevelOrderTraversal = new ReverseLevelOrderTraversal();
        List<List<TreeNode>> result = reverseLevelOrderTraversal.traverse(root);
        assertTrue(result.get(0).get(0).val == 9);
        assertTrue(result.get(0).get(1).val == 10);
        assertTrue(result.get(0).get(2).val == 5);
        assertTrue(result.get(1).get(0).val == 7);
        assertTrue(result.get(1).get(1).val == 1);
        assertTrue(result.get(2).get(0).val == 12);
        assertEquals(3, result.size());
        assertEquals(3, result.get(0).size());
        assertEquals(2, result.get(1).size());
        assertEquals(1, result.get(2).size());
    }

    @Test
    public void testRightSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        ReverseLevelOrderTraversal reverseLevelOrderTraversal = new ReverseLevelOrderTraversal();
        List<List<TreeNode>> result = reverseLevelOrderTraversal.traverse(root);

        assertEquals(3, result.size());
        assertTrue(result.get(0).get(0).val == 3);
        assertTrue(result.get(1).get(0).val == 2);
        assertTrue(result.get(2).get(0).val == 1);
    }

}