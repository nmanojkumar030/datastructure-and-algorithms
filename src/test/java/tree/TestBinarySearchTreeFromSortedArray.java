package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestBinarySearchTreeFromSortedArray {

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
}