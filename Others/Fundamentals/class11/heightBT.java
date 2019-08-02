class TreeNode {
    int key;
    TreeNode left;
    TreeNode right;
    public TreeNode(int k) {
        int key = k;
    }
}

public class Solution {
    public Integer heightBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = heightBinaryTree(root.left);
        int rightHeight =  heightBinaryTree(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}