import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int key;
    TreeNode left;
    TreeNode right;
    public TreeNode(int k) {
        key = k;
    }
}

/*
 * Pre-Order Tree Traversal 
 */
public class Solution {
    /* Recursion version */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        helper(root, result);
        return result;
    }

    private void helper(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        res.add(node.key);
        helper(node.left, res);
        helper(node.right, res);
    }
}