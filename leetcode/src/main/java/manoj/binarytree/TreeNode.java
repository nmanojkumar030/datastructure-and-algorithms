package manoj.binarytree;


import java.util.ArrayList;
import java.util.List;

//Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> integers = new ArrayList<>();
        if (null != root) {
            integers.add(root.val);
            TreeNode left = root.left;
            if (!preorderTraversal(left).isEmpty()) {
                integers.addAll(preorderTraversal(left));
            }
            TreeNode right = root.right;
            if (!preorderTraversal(right).isEmpty()) {
                integers.addAll(preorderTraversal(right));
            }
        }
        return integers;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> integers = new ArrayList<>();
        if (null != root) {
            TreeNode left = root.left;
            if (!inorderTraversal(left).isEmpty()) {
                integers.addAll(inorderTraversal(left));
            }
            integers.add(root.val);
            TreeNode right = root.right;
            if (!inorderTraversal(right).isEmpty()) {
                integers.addAll(inorderTraversal(right));
            }
        }
        return integers;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> integers = new ArrayList<>();
        if (null != root) {
            TreeNode left = root.left;
            if (!inorderTraversal(left).isEmpty()) {
                integers.addAll(postorderTraversal(left));
            }
            TreeNode right = root.right;
            if (!inorderTraversal(right).isEmpty()) {
                integers.addAll(postorderTraversal(right));
            }
            integers.add(root.val);
        }
        return integers;
    }
}
