package pattern.depthfirstsearch;

import java.util.*;

public class BinaryTreeTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversePreOrderRecursively(root, list);
        return list;
    }

    private void traversePreOrderRecursively(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.getData());
        traversePreOrderRecursively(node.getLeft(), list);
        traversePreOrderRecursively(node.getRight(), list);
    }

    public List<Integer> binaryTreePostorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversePostOrderRecursively(root, list);
        return list;
    }

    private void traversePostOrderRecursively(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        traversePostOrderRecursively(node.getLeft(), list);
        traversePostOrderRecursively(node.getRight(), list);
        list.add(node.getData());
    }

    public List<Integer> binaryTreeInorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverseInorderRecursively(root.getLeft(), list);
        return list;
    }

    private void traverseInorderRecursively(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        traverseInorderRecursively(node.getLeft(), list);
        list.add(node.getData());
        traverseInorderRecursively(node.getRight(), list);
    }

    public List<List<Integer>> binaryTreeLevelOrderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> levelList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                levelList.add(node.getData());
                if (node.getLeft() != null) {
                    queue.offer(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.offer(node.getRight());
                }
            }
            list.add(levelList);
        }
        return list;
    }

    public List<List<Integer>> binaryTreeZigzagLevelOrderTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if  (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int count = 1;
        while (!queue.isEmpty()) {
            List<Integer> levelList = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                levelList.add(node.getData());
                if (node.getLeft()!= null){
                    queue.offer(node.getLeft());
                }
                if (node.getRight()!= null){
                    queue.offer(node.getRight());
                }
            }
            if (count % 2 == 0){
                Collections.reverse(levelList);
            }
            list.add(levelList);
            count++;
        }
        return list;
    }

    public List<List<Integer>> binaryTreeLevelOrderTraversalBottomUp(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if  (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> levelList = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                levelList.add(node.getData());
                if (node.getLeft()!= null){
                    queue.offer(node.getLeft());
                }
                if (node.getRight()!= null){
                    queue.offer(node.getRight());
                }
            }
            list.add(levelList);
        }
        Collections.reverse(list);
        return list;
    }

    private class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }
}
