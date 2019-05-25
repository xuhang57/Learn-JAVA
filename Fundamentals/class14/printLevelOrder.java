class TreeNode {
    int value;
    TreeNode left;
    TreeNOde right;
    public TreeNode(int v) {
        value = v;
    }
}

class Solution {
    public List<Integer> bfs(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            list.add(cur.value);
            if(curr.left != null) {
                queue.offer(curr.left);
            }
            if(curr.right != null) {
                queue.offer(curr.right);
            }
        }
        return list;ß
    }
}