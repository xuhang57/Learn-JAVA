class TreeNode {
    int key;
    TreeNode left;
    TreeNode right;
    public TreeNode(int k) {
        key = k;
    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TreeNode A, TreeNode B) {
        if (A == null && B == null) {
            return true;
        }

        if (A == null || B == null) {
            return false;
        }

        if (A.key != B.key) {
            return false;
        }

        boolean firstSym = isSymmetric(A.left, B.right);
        boolean secondSym = isSymmetric(A.right, B.left);

        return firstSym && secondSym;
    }
}