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
        list.add(node.data);
        traversePreOrderRecursively(node.left, list);
        traversePreOrderRecursively(node.right, list);
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
        traversePostOrderRecursively(node.left, list);
        traversePostOrderRecursively(node.right, list);
        list.add(node.data);
    }

    public List<Integer> binaryTreeInorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverseInorderRecursively(root, list);
        return list;
    }

    private void traverseInorderRecursively(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        traverseInorderRecursively(node.left, list);
        list.add(node.data);
        traverseInorderRecursively(node.right, list);
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
                levelList.add(node.data);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
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
                levelList.add(node.data);
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
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
                levelList.add(node.data);
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
            }
            list.add(levelList);
        }
        Collections.reverse(list);
        return list;
    }
}
