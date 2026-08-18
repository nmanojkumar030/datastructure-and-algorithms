package datastructures.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BinaryTreeTest {

    @Test
    public void doubleTreeOnSingleNodeAddsOneTwin() {
        BinaryTree.Node<Integer> root = new BinaryTree.Node<>(1);
        BinaryTree<Integer> tree = new BinaryTree<>(root);

        tree.doubleTree(tree.root);

        assertEquals(1, tree.root.data);
        assertEquals(1, tree.root.left.data);
        assertNull(tree.root.left.left);
        assertNull(tree.root.right);
    }

    @Test
    public void doubleTreeDoublesEveryNodeInChain() {
        BinaryTree.Node<Integer> root = new BinaryTree.Node<>(1);
        root.left = new BinaryTree.Node<>(2);
        BinaryTree<Integer> tree = new BinaryTree<>(root);

        tree.doubleTree(tree.root);

        assertEquals(1, tree.root.data);
        assertEquals(1, tree.root.left.data);
        assertEquals(2, tree.root.left.left.data);
        assertEquals(2, tree.root.left.left.left.data);
        assertNull(tree.root.left.left.left.left);
        assertNull(tree.root.left.left.right);
        assertNull(tree.root.right);
    }

    @Test
    public void doubleTreeOnEmptyTreeIsNoOp() {
        BinaryTree<Integer> tree = new BinaryTree<>(null);

        tree.doubleTree(tree.root);

        assertNull(tree.root);
    }
}
