import java.util.List;
import java.util.ArrayList;

class TreeNode {
    int key;
    TreeNode left;
    TreeNode right;
    public TreeNode(int k) {
        key = k;
    }
}

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        helper(root, result);
        return res;
    }

    private void helper(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        helper(node.left, res);
        helper(node.right, res);
        res.append(node.key);
    }
}