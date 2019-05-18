import java.util.List;
import java.util.ArrayList;

public class TreeNode {
    int key;
    TreeNode left;
    TreeNode right;
    public TreeNode(int k) {
        key = k;
    }
}


public class Solution {
    public List<Integer> inOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        helper(root, res);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        helper(root.left, res);
        res.add(root.key);
        helper(root.right, res);
    }
}