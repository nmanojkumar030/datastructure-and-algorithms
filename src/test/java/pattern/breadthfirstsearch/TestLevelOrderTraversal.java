package pattern.breadthfirstsearch;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLevelOrderTraversal {

    @Test
    public void testEmptyTree() {
        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        List<List<TreeNode>> result = levelOrderTraversal.traverse(null);
        assertEquals(0, result.size());
    }

    @Test
    public void testOneNodeTree() {
        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        List<List<TreeNode>> result = levelOrderTraversal.traverse(new TreeNode(12));
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

        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        List<List<TreeNode>> result = levelOrderTraversal.traverse(root);
        assertTrue(result.get(0).get(0).val == 12);
        assertTrue(result.get(1).get(0).val == 7);
        assertTrue(result.get(1).get(1).val == 1);
        assertTrue(result.get(2).get(0).val == 9);
        assertTrue(result.get(2).get(1).val == 10);
        assertTrue(result.get(2).get(2).val == 5);
    }
}