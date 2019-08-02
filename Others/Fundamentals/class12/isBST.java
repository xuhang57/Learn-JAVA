class TreeNode {
    int key;
    TreeNodee left;
    TreeNode right;
    public TreeNode(int k) {
        key = k;
    }
}

class Solution {
    public boolean isBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isBST(root. Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(TreeNode root, int min, int max) {
        if(root == null) {
            return true;
        }
        if (root.key <= min || root.key >= max) {
            return false;
        }

        return isBST(root.left, min, root.key) && isBST(root.right, root.key, max);
    }
}