class TreeNode {
    int key;
    TreeNode left;
    TreeNOde right;
    public TreeNode(int k) {
        int key = k;
    }
}

class Solution {
    public Integer countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return 1 + left + right;
    }
}