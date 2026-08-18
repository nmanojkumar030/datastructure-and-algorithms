package pattern.breadthfirstsearch;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeLevelAverageTest {

    @Test
    public void testEmptyTree() {
        BinaryTreeLevelAverage binaryTreeLevelAverage = new BinaryTreeLevelAverage();
        List<Double> result = binaryTreeLevelAverage.findLevelAverages(null);
        assertEquals(0, result.size());
    }

    @Test
    public void testSingleNodeTree() {
        BinaryTreeLevelAverage binaryTreeLevelAverage = new BinaryTreeLevelAverage();
        List<Double> result = binaryTreeLevelAverage.findLevelAverages(new TreeNode(5));
        assertEquals(1, result.size());
        assertEquals(5.0, result.get(0));
    }

    @Test
    public void testMultiLevelTree() {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        BinaryTreeLevelAverage binaryTreeLevelAverage = new BinaryTreeLevelAverage();
        List<Double> result = binaryTreeLevelAverage.findLevelAverages(root);

        assertEquals(3, result.size());
        assertEquals(12.0, result.get(0));
        assertEquals(4.0, result.get(1));
        assertEquals(6.5, result.get(2));
    }

    @Test
    public void testSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(5);

        BinaryTreeLevelAverage binaryTreeLevelAverage = new BinaryTreeLevelAverage();
        List<Double> result = binaryTreeLevelAverage.findLevelAverages(root);

        assertEquals(3, result.size());
        assertEquals(1.0, result.get(0));
        assertEquals(3.0, result.get(1));
        assertEquals(5.0, result.get(2));
    }
}
