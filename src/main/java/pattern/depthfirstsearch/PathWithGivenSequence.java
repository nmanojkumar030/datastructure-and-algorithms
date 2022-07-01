package pattern.depthfirstsearch;

public class PathWithGivenSequence {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(5);

        PathWithGivenSequence pathWithGivenSequence = new PathWithGivenSequence();

        //System.out.println("Tree has path sequence: " + pathWithGivenSequence.findPath(root, new int[]{1, 0, 7}));
        System.out.println("Tree has path sequence: " + pathWithGivenSequence.findPath(root, new int[]{1, 1, 6}));
    }

    public boolean findPath(TreeNode root, int[] sequence) {
        return findPathWithGivenSequenceRecursive(root, sequence, 0);
    }

    private boolean findPathWithGivenSequenceRecursive(TreeNode node, int[] sequence, int sequenceIndex) {
        if (node == null) {
            return false;
        }

        if (node.data != sequence[sequenceIndex]) {
            return false;
        }

        if (node.left == null && node.right == null && node.data == sequence[sequenceIndex]) {
            return true;
        }

        return findPathWithGivenSequenceRecursive(node.left, sequence, sequenceIndex + 1) ||
                findPathWithGivenSequenceRecursive(node.right, sequence, sequenceIndex + 1);
    }

}
