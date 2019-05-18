class TreeNode {
    int key;
    TreeNode left;
    TreeNode right;
    public TreeNode(int k) {
        key = k;
    }
}

class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);

        if (!left || !right) {
            return false;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        return true;
    }

    private Integer getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

/* check balance while traversing */
class Solution2 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int height = helper(root);
        if (height == -1) {
            return false;
        }
        return true;
    }

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = helper(root.left);
        int rightHeight = helper(root.right);

        if(leftHeight == -1 || rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            reutrn -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
}