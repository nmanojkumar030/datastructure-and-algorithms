package pattern.depthfirstsearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfPathNumbersTest {

    @Test
    void shouldCalculateSumOfAllPathNumbersInComplexTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(5);
        SumOfPathNumbers sumOfPathNumbers = new SumOfPathNumbers();
        assertEquals(332,sumOfPathNumbers.sumNumbers(root));
    }

    @Test
    void shouldReturnZeroWhenTreeIsEmpty() {
        SumOfPathNumbers sumOfPathNumbers = new SumOfPathNumbers();
        assertEquals(0,sumOfPathNumbers.sumNumbers(null));
    }

    @Test
    void shouldReturnValueWhenTreeHasSingleNode() {
        TreeNode root = new TreeNode(1);
        SumOfPathNumbers sumOfPathNumbers = new SumOfPathNumbers();
        assertEquals(1,sumOfPathNumbers.sumNumbers(root));
    }

    @Test
    void shouldCalculateSumWithTwoLevelTreeAndLeftChild() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        SumOfPathNumbers sumOfPathNumbers = new SumOfPathNumbers();
        assertEquals(10,sumOfPathNumbers.sumNumbers(root));
    }
}