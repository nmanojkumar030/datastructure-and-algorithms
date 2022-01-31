package tree;

public class BinarySearchTreeFromSortedArray {
    public Node create(int[] inputArray, int startIndex, int endIndex) {
        if (startIndex > endIndex || endIndex < startIndex)
            return null;

        int middleIndex = (startIndex + endIndex) / 2;
        Node node = new Node(inputArray[middleIndex]);

        node.setLeft(create(inputArray, startIndex, middleIndex - 1));
        node.setRight(create(inputArray, middleIndex + 1, endIndex));

        return node;
    }
}

