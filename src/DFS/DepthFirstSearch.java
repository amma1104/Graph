package DFS;

import java.util.*;

class DepthFirstSearch {
    private LinkedList<Integer> adj[];
    private boolean visited[];

    DepthFirstSearch(int v) {
        adj = new LinkedList[v];
        visited = new boolean[v];

        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<Integer>();
    }

    void insertEdge(int src, int dest) {
        adj[src].add(dest);
    }

    void DFS(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> it = adj[vertex].listIterator();
        while (it.hasNext()) {
            int n = it.next();
            if (!visited[n])
                DFS(n);
        }
    }

    public static void main(String[] args) {
        DepthFirstSearch graph = new DepthFirstSearch(8);

        graph.insertEdge(3, 2);
        graph.insertEdge(2, 1);
        graph.insertEdge(2, 4);
        graph.insertEdge(1, 5);
        graph.insertEdge(1, 0);
        graph.insertEdge(5, 0);
        graph.insertEdge(5, 4);
        graph.insertEdge(1, 4);

        System.out.println("Depth First Traversal:");
        graph.DFS(3);
    }
}
