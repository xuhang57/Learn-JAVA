class GraphNode {
    public int value;
    public List<GraphNode> nei;
    public boolean visited = false;
}

class Solution {
    public void bfs(GraphNode start) {
        Queue<GraphNode> q = new LinkedList<>();
        start.visited = true;
        q.offer(start);
        while(!q.isEmpty()) {
            GraphNode cur = q.poll();
            System.out.println(cur.value);
            for(GraphNode nei: cur.nei) {
                if(!nei.visited) {
                    nei.visited = true;
                    q.offer(nei);
                }
            }
        }
    }
}