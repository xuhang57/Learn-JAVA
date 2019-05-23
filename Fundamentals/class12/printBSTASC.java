class TreeNode {
    int key;
    TreeNode left;
    TreeNode right;
    public TreeNode(int k) {
        
    }
}

public class Solution {
    /* in-order traversal a BST tree */
    public void printKeys(TreeNode root) {
        if(root == null) {
            return;
        }
        printKeys(root.left);
        System.out.println(root.key);
        printKeys(root.right);
    }
}