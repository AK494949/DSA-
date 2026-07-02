import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BFSGraph {
    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge(int source, int destination) {
        adjList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        adjList.computeIfAbsent(destination, k -> new ArrayList<>()).add(source);
    }

    public void runbFS(int startNode) {
        Set<Integer> visited = new HashSet<>();
        Deque<Integer> q=new ArrayDeque<>();
        visited.add(startNode);
        q.add(startNode);
        while(!q.isEmpty()){
            int node=q.pollFirst();
            System.out.print(node + " ");
            List<Integer> neighbors = adjList.getOrDefault(node, new ArrayList<>());
            Collections.sort(neighbors);
             for (int nei : neighbors) {
            if (!visited.contains(nei)) {
               visited.add(nei);
               q.add(nei);
            }
        }

        }
    }
    public static void main(String[] args) {
        BFSGraph g = new BFSGraph();
        g.addEdge(0,1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        System.out.println("Bfs Traversal starting from node 0: ");
        g.runbFS(0);
    }
}