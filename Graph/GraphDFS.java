package javA.Graph;

import java.util.ArrayList;

public class GraphDFS {
    // Graph dfs
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       
        boolean[] visited = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i=0; i<V; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, result);
            }
        }
        
        return result;
    }
    
   
    private void dfs(int vertex, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result) {
        
        visited[vertex] = true;
        result.add(vertex);
        
        for (int neighbor : adj.get(vertex)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, result);
            }
        }
    }
}
