package tree;

import java.util.Arrays;

public class BinarySearchTreeFromSortedArray {
    public Node binarySearchTree(int[] inputArray, int startIndex, int endIndex) {
        if (startIndex > endIndex || endIndex < startIndex)
            return null;

        int middleIndex = (startIndex + endIndex) / 2;
        Node node = new Node(inputArray[middleIndex]);

        node.setLeft(binarySearchTree(inputArray, startIndex, middleIndex - 1));
        node.setRight(binarySearchTree(inputArray, middleIndex + 1, endIndex));

        return node;
    }
}

