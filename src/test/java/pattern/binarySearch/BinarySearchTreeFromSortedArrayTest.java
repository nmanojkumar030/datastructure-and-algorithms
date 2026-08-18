package pattern.binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BinarySearchTreeFromSortedArrayTest {

    @Test
    public void testBinarySearchTree() {
        BinarySearchTreeFromSortedArray binarySearchTreeFromSortedArray = new BinarySearchTreeFromSortedArray();
        Node root = binarySearchTreeFromSortedArray.create(new int[]{1}, 0, 0);
        assertEquals(1, root.getData());
    }

    @Test
    public void testBinarySearchTree_TwoNodes() {
        BinarySearchTreeFromSortedArray binarySearchTreeFromSortedArray = new BinarySearchTreeFromSortedArray();
        Node root = binarySearchTreeFromSortedArray.create(new int[]{1, 2}, 0, 1);
        assertEquals(1, root.getData());
        assertEquals(2, root.getRight().getData());
    }

    @Test
    public void testBinarySearchTree_ThreeNodes() {
        BinarySearchTreeFromSortedArray binarySearchTreeFromSortedArray = new BinarySearchTreeFromSortedArray();
        Node root = binarySearchTreeFromSortedArray.create(new int[]{1, 2, 3}, 0, 2);
        assertEquals(2, root.getData());
        assertEquals(3, root.getRight().getData());
        assertEquals(1, root.getLeft().getData());
    }

    @Test
    public void testBinarySearchTree_EmptyArray() {
        BinarySearchTreeFromSortedArray binarySearchTreeFromSortedArray = new BinarySearchTreeFromSortedArray();
        Node root = binarySearchTreeFromSortedArray.create(new int[]{}, 0, -1);
        assertNull(root);
    }

    @Test
    public void testBinarySearchTree_FourNodes() {
        BinarySearchTreeFromSortedArray binarySearchTreeFromSortedArray = new BinarySearchTreeFromSortedArray();
        Node root = binarySearchTreeFromSortedArray.create(new int[]{1, 2, 3, 4}, 0, 3);
        assertEquals(2, root.getData());
        assertEquals(1, root.getLeft().getData());
        assertEquals(3, root.getRight().getData());
        assertEquals(4, root.getRight().getRight().getData());
    }
}
