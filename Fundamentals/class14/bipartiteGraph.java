class GraphNode {
    public int value;
    public List<GraphNode> nei;
    public boolean visited = false;
}

class Bipartite {
    public boolean isBipartite(List<GraphNode> graph) {
        HashMap<GraphNode, Integer> visited = new HashMap<>();
        for(GraphNode node: graph) {
            if(!BFS(node, visited)) {
                return false;
            }
        }
        return true;
    }

    private boolean BFS(GraphNode node, HashMap<GraphNode, Integer> visited) {
        if(visited.containsKey(node)) {
            return true;
        }
        Queue<GraphNode> queue = new LinkedList<GraphNode>();
        queue.offer(node);
        visited.put(node, 0);
        while(!queue.isEmpty) {
            GraphNode cur = queue.poll();
            int curGroup = visited.get(cur);
            int neiGroup = curGroup == 0 ? 1 : 0;
            for(GraphNode nei: cur.nei) {
                if(!visited.containsKey(nei)) {
                    visited.put(nei, neiGroup);
                    queue.offer(nei);
                } else if(visited.get(nei) != neiGroup) {
                    return false;
                }
            }
        }
        return true;
    }
}