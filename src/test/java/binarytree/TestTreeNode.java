package binarytree;

import org.junit.Test;

import java.util.List;

public class TestTreeNode {

    @Test
    public void testPreOrderTraversal() {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Solution solution = new Solution();
        List<Integer> nodeValues = solution.preorderTraversal(treeNode);
        nodeValues.stream().forEach(System.out::println);
    }

    @Test
    public void testInorderTraversal() {
        TreeNode rootNode = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Solution solution = new Solution();
        List<Integer> nodeValues = solution.inorderTraversal(rootNode);
        nodeValues.stream().forEach(System.out::println);
    }

    @Test
    public void testPostOrderTraversal() {
        TreeNode rootNode = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Solution solution = new Solution();
        List<Integer> nodeValues = solution.postorderTraversal(rootNode);
        nodeValues.stream().forEach(System.out::println);
    }
}
