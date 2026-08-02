package datastructures.tree;

public class BinaryTree<E> {

    Node<E> root;

    public BinaryTree(Node<E> root) {
        this.root = root;
    }

    public void doubleTree(Node<E> node) {
        if (node == null) {
            return;
        }

        doubleTree(node.left);
        doubleTree(node.right);

        Node<E> previousLeft = node.left;
        Node<E> newNode = new Node<>(node.data);
        node.left = newNode;
        newNode.left = previousLeft;
    }

    void printInOrderTraversal(Node<E> node) {
        if (node == null) {
            return;
        }
        printInOrderTraversal(node.left);
        System.out.println("Node Data " + node.data);
        printInOrderTraversal(node.right);
    }

    public static class Node<E> {
        int data;
        Node<E> left;
        Node<E> right;

        public Node(int data) {
            this.data = data;
        }
    }


    static void main(String[] args) {
        Node<Integer> root = new Node<>(1);
        root.left = new Node<>(2);
        root.right = new Node<>(3);
        root.left.left = new Node<>(4);
        root.left.right = new Node<>(5);

        BinaryTree<Integer> tree = new BinaryTree<>(root);

        System.out.println("Original tree is : ");
        tree.printInOrderTraversal(tree.root);
        tree.doubleTree(tree.root);
        System.out.println("");
        System.out.println("Inorder traversal of double tree is : ");
        tree.printInOrderTraversal(tree.root);
    }
}


