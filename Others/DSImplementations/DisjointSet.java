import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * Applications: Represents network connectivity; imaging processing, Kruskal's minimum spanning tree, find cycle in undirected graph.
 */
public class DisjointSet {
    static class Edge {
        int source;
        int destination;

        public Edge(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }
    }

    static class Graph {
        int vertices;
        LinkedList<Edge>[] adjList;
        ArrayList<Edge> allEdges = new ArrayList<>();

        Graph(int vertices) {
            this.vertices = vertices;
            adjList = new LinkedList[vertices];
            for(int i = 0; i < vertices; i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        public void addEdge(int source, int destination) {
            Edge edge = new Edge(source, destination);
            // why add first here? 
            adjList[source].addFirst(edge);
            allEdges.add(edge);
        }

        /**
         * Make set: creating a new element with  a parent pointer to itself
         */
        public void makeSet(int[] parent) {
            for(int i = 0; i < vertices; i++) {
                parent[i] = i;
            }
        }

        /**
         * find: chain of parent pointers from x upwards through the tree
         *       until an element is reached whose parent is itself
         */
        public int find(int[] parent, int vertex) {
            if(parent[vertex] != vertex) {
                return find(parent, parent[vertex]);
            }
            return vertex;
        }

        /**
         *  Union: combine two trees(sets)
         */
        public void union(int[] parent, int x, int y) {
            int xSetParent = find(parent, x);
            int ySetParent = find(parent, y);
            parent[ySetParent] = xSetParent;
        }

        public void disjointSets() {
            int[] parent = new int[vertices];

            makeSet(parent);

            // iterate through all the edges and keep making the sets
            for (int i = 0; i < allEdges.size(); i++) {
                Edge edge = allEdges.get(i);
                int xSet = find(parent, edge.source);
                int ySet  = find(parent, edge.destination);

                // check if source vertex and destination vertex belongs to the same set
                // if in the same, we have found a cycle, otherwise, combine into one set
                if (xSet != ySet) {
                    union(parent, xSet, ySet);
                }
            }


            printSets(parent);
        }

        public void printSets(int[] parent) {
            Map<Integer, ArrayList<Integer>> map = new HashMap<>();
            for(int i= 0; i < parent.length; i++) {
                if(map.containsKey(parent[i])) {
                    ArrayList<Integer> list = map.get(parent[i]);
                    list.add(i);
                    map.put(parent[i], list);
                } else {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i);
                    map.put(parent[i], list);
                }
            }
            Set<Integer> set = map.keySet();
            Iterator<Integer> iterator = set.iterator();

            while(iterator.hasNext()) {
                int key = iterator.next();
                System.out.println("Set Id: " + key + " elements " + map.get(key));
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 6;
        Graph graph = new Graph(vertices);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(4, 5);
        graph.disjointSets();
    }
}