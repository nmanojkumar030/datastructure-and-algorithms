package pattern.breadthfirstsearch;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZigZagTraversalTest {

    @Test
    public void testEmptyTree() {
        ZigZagTraversal zigZagTraversal = new ZigZagTraversal();
        List<List<TreeNode>> result = zigZagTraversal.traverse(null);
        assertEquals(0, result.size());
    }

    @Test
    public void testSingleNodeTree() {
        ZigZagTraversal zigZagTraversal = new ZigZagTraversal();
        List<List<TreeNode>> result = zigZagTraversal.traverse(new TreeNode(12));
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals(12, result.get(0).get(0).val);
    }

    @Test
    public void testMultiLevelTree() {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        root.right.left.left = new TreeNode(20);
        root.right.left.right = new TreeNode(17);

        ZigZagTraversal zigZagTraversal = new ZigZagTraversal();
        List<List<TreeNode>> result = zigZagTraversal.traverse(root);

        assertEquals(4, result.size());

        assertEquals(1, result.get(0).size());
        assertEquals(12, result.get(0).get(0).val);

        assertEquals(2, result.get(1).size());
        assertEquals(1, result.get(1).get(0).val);
        assertEquals(7, result.get(1).get(1).val);

        assertEquals(3, result.get(2).size());
        assertEquals(9, result.get(2).get(0).val);
        assertEquals(10, result.get(2).get(1).val);
        assertEquals(5, result.get(2).get(2).val);

        assertEquals(2, result.get(3).size());
        assertEquals(17, result.get(3).get(0).val);
        assertEquals(20, result.get(3).get(1).val);
    }
}
