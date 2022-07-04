package tree;

public class Tree {

    private Node root;

    public void findThroughRecursion(int key, Node node) {
        if (null == node) {
            System.out.println("Key not found!!");
        } else {
            if (node.getData() == key) {
                System.out.println("Key found!!");
            } else if (node.getData() > key) {
                findThroughRecursion(key, node.getRight());
            } else if (node.getData() < key) {
                findThroughRecursion(key, node.getLeft());
            }
        }
    }

    public void findThroughIteration(int key) {
        Node currentNode = root;
        boolean found = false;
        while (null != currentNode) {
            if (currentNode.getData() == key) {
                found = true;
                System.out.println("Key found!");
            } else if (currentNode.getData() > key) {
                currentNode = currentNode.getRight();
            } else if (currentNode.getData() < key) {
                currentNode = currentNode.getLeft();
            }
        }

        if (!found) {
            System.out.println("key not found!");
        }
    }

    public void insert(int key) {
        Node node = new Node(key);

        if (null == root) {
            root = node;
        } else {
            Node parentNode = root;
            while (parentNode != null) {
                if (key < parentNode.getData()) {
                    Node left = parentNode.getLeft();
                    if (left == null) {
                        parentNode.setLeft(node);
                        return;
                    } else {
                        parentNode = left;
                    }

                } else if (key > parentNode.getData()) {
                    Node right = parentNode.getRight();
                    if (right == null) {
                        parentNode.setRight(node);
                        return;
                    } else {
                        parentNode = right;
                    }
                }
            }
        }
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.getData() + " ");
            if (root.getLeft() != null) {
                preOrder(root.getLeft());
            }
            if (root.getRight() != null) {
                preOrder(root.getRight());
            }
        }
    }

    public void postOrder(Node root) {
        if (root != null) {
            if (root.getLeft() != null) {
                postOrder(root.getLeft());
            }
            if (root.getRight() != null) {
                postOrder(root.getRight());
            }
            System.out.print(root.getData() + " ");
        }
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getData() + " ");
            inOrder(root.getRight());
        }
    }

    public Node minimum() {  // Minimum node will be available in extreme left
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.getLeft() == null) {
                return currentNode;
            } else
                currentNode = currentNode.getLeft();
        }
        return null;
    }

    public Node maximum() { // Maximum node will be available in extreme right
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.getRight() == null) {
                return currentNode;
            } else
                currentNode = currentNode.getRight();
        }
        return null;

    }

    public int getHeight(Node root) {
        if (null == root) {
            return -1;
        } else {
            int heightLeft = getHeight(root.getLeft());
            int heightRight = getHeight(root.getRight());
            if (heightLeft > heightRight) {
                return ++heightLeft;
            } else {
                return ++heightRight;
            }
        }
    }

    public boolean delete(int key) {
        Node currentNode = root;
        Node parentNode = currentNode;
        boolean isLeftChild = false;
        while (currentNode.getData() != key) {
            parentNode = currentNode;
            if (currentNode.getData() < key) {
                isLeftChild = true;
                currentNode = currentNode.getLeft();
            } else if (currentNode.getData() > key) {
                isLeftChild = false;
                currentNode = currentNode.getRight();
            }
            if (null == currentNode) {
                return false;
            }
        }

        // deleting leaf node
        if (currentNode.getLeft() == null && currentNode.getRight() == null) {
            if (currentNode == root) {
                root = null;
            } else if (isLeftChild) {
                parentNode.setLeft(null);
            } else {
                parentNode.setRight(null);
            }
            return true;
        }
        // deleting node with one child, left child
        else if (currentNode.getLeft() != null
                && currentNode.getRight() == null) {
            if (currentNode == root) {
                root = currentNode.getLeft();
            } else if (isLeftChild) {
                parentNode.setLeft(currentNode.getLeft());
            } else {
                parentNode.setRight(currentNode.getLeft());
            }
            return true;

        } else if (currentNode.getRight() != null
                && currentNode.getLeft() == null) {
            if (currentNode == root) {
                root = currentNode.getRight();
            } else if (isLeftChild) {
                parentNode.setLeft(currentNode.getRight());
            } else {
                parentNode.setRight(currentNode.getRight());
            }
            return true;
        } else {
            Node successor = getSuccessor(currentNode);
            if (root == currentNode) {
                root = successor;
            } else if (isLeftChild) {
                parentNode.setLeft(successor);
            } else {
                parentNode.setRight(successor);
            }
            return true;

        }
    }

    public Node getSuccessor(Node deleteNode) {
        Node successorParentNode = deleteNode;
        Node successorNode = deleteNode;
        Node currentNode = deleteNode.getRight();
        while (null != currentNode) {
            successorParentNode = successorNode;
            successorNode = currentNode;
            successorNode = currentNode.getLeft();
        }

        if (deleteNode.getRight() != successorNode) {
            successorParentNode.setLeft(successorNode.getRight());
            successorNode.setRight(deleteNode.getRight());
        }
        return successorNode;
    }

    public void top_view(Node root) {
        Node currentNode = root;
        printleft(currentNode);
        printRight(root.getRight());
    }

    private void printleft(Node currentNode) {
        if (null != currentNode) {
            printleft(currentNode.getLeft());
            System.out.print(currentNode.getData());
        }
    }

    private void printRight(Node currentNode) {
        if (null != currentNode) {
            System.out.println(currentNode.getData());
            printRight(currentNode.getRight());
        }
    }

    void levelOrder(Node root) {
        Node currentNode = root;
        System.out.println(currentNode.getData());

        Node left = currentNode.getLeft();
        Node right = currentNode.getRight();


    }

}
