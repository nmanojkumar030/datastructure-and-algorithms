package gs;

public class BinaryTree {

    Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        BinaryTree tree = new BinaryTree(root);

        System.out.println("Original tree is : ");
        tree.printInOrderTraversal(tree.root);
        tree.doubleTree(tree.root);
        System.out.println("");
        System.out.println("Inorder traversal of double tree is : ");
        tree.printInOrderTraversal(tree.root);
    }

    public void doubleTree(Node node) {
        if (node == null) {
            return;
        }

        doubleTree(node.left);
        doubleTree(node.right);

        Node previousLeft = node.left;
        Node newNode = new Node(node.data);
        node.left = newNode;
        newNode.left = previousLeft;
    }

    void printInOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        printInOrderTraversal(node.left);
        System.out.println("Node Data " + node.data);
        printInOrderTraversal(node.right);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}
