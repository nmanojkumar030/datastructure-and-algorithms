package pattern.depthfirstsearch;

public class PathWithGivenSequence {

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
