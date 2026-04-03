package pattern.depthfirstsearch;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindAllTreePathsTest {

    @Test
    public void findAllPathSumShouldReturnMultiplePathsWhenComplexTreeMatches() {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        FindAllTreePaths findAllTreePaths = new FindAllTreePaths();
        List<List<Integer>> result = findAllTreePaths.findAllPathSum(root, 23);

        assertEquals(2, result.size());
    }


    @Test
    public void findAllPathSumShouldReturnOnePathWhenSingleNodeMatches() {
        TreeNode root = new TreeNode(12);

        FindAllTreePaths findAllTreePaths = new FindAllTreePaths();
        List<List<Integer>> result = findAllTreePaths.findAllPathSum(root, 12);

        assertEquals(1, result.size());
    }

    @Test
    public void findAllPathSumShouldReturnEmptyListWhenSingleNodeDoesNotMatch() {
        TreeNode root = new TreeNode(12);

        FindAllTreePaths findAllTreePaths = new FindAllTreePaths();
        List<List<Integer>> result = findAllTreePaths.findAllPathSum(root, 19);

        assertEquals(0, result.size());
    }

    @Test
    public void findAllPathSumShouldReturnOnePathWhenTreeWithTwoNodesMatches() {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);

        FindAllTreePaths findAllTreePaths = new FindAllTreePaths();
        List<List<Integer>> result = findAllTreePaths.findAllPathSum(root, 19);

        assertEquals(1, result.size());
    }
}