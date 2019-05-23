class TreeNode {
    int key;
    public TreeNode(int k) {
        key = k;
        left = null;
        right = null;
    }

}

class Solution {
    public boolean sameTree(TreeNode rootA, TreeNode rootB) {
        if (rootA == null && rootB == null) {
            return true;
        }
        
        if (rootA == null || rootB == null) {
            return false;
        }

        return rootA.key == rootB.key && sameTree(rootA.left, rootB.left) && sameTree(rootA.right, rootB.right);
    }
}