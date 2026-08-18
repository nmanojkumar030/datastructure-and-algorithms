package pattern.binarySearch;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinarySearchTreeTest {

    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream capturedOut;

    @BeforeEach
    public void redirectStdOut() {
        capturedOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(capturedOut));
    }

    @AfterEach
    public void restoreStdOut() {
        System.setOut(originalOut);
    }

    @Test
    public void testFindThroughRecursion_keyPresent() {
        Node root = new Node(5);
        root.setLeft(new Node(3));
        root.setRight(new Node(8));
        root.getLeft().setLeft(new Node(1));
        root.getLeft().setRight(new Node(4));

        new BinarySearchTree().findThroughRecursion(1, root);

        assertTrue(capturedOut.toString().contains("Key found!!"));
    }

    @Test
    public void testFindThroughRecursion_keyAbsent() {
        Node root = new Node(5);
        root.setLeft(new Node(3));
        root.setRight(new Node(8));

        new BinarySearchTree().findThroughRecursion(100, root);

        assertTrue(capturedOut.toString().contains("Key not found!!"));
    }

    @Test
    public void testInsertAndFindThroughIteration_keyPresent() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(8);
        tree.insert(1);
        tree.insert(4);

        tree.findThroughIteration(4);

        assertTrue(capturedOut.toString().contains("Key found!"));
    }

    @Test
    public void testFindThroughIteration_keyAbsent() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(8);

        tree.findThroughIteration(100);

        assertTrue(capturedOut.toString().contains("key not found!"));
    }

    @Test
    public void testMinimumAndMaximum() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(8);
        tree.insert(1);
        tree.insert(9);

        assertEquals(1, tree.minimum().getData());
        assertEquals(9, tree.maximum().getData());
    }

    @Test
    public void testMinimumAndMaximum_emptyTree() {
        BinarySearchTree tree = new BinarySearchTree();
        assertNull(tree.minimum());
        assertNull(tree.maximum());
    }

    @Test
    public void testGetHeight() {
        BinarySearchTree tree = new BinarySearchTree();
        Node root = new Node(5);
        root.setLeft(new Node(3));
        root.getLeft().setLeft(new Node(1));
        root.setRight(new Node(8));

        assertEquals(2, tree.getHeight(root));
    }

    @Test
    public void testGetHeight_emptyTree() {
        BinarySearchTree tree = new BinarySearchTree();
        assertEquals(-1, tree.getHeight(null));
    }

    @Test
    public void testGetHeight_singleNode() {
        BinarySearchTree tree = new BinarySearchTree();
        assertEquals(0, tree.getHeight(new Node(1)));
    }
}
