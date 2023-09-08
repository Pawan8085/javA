package javA.Graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopoSortDFS {

    // Topological sort DFS

    
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        boolean[] vis = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<V; ++i){
            if(!vis[i]){
                
                dfs(adj, i, stack, vis);
            }
        }
        
        int[] ans = new int[V];
        int index = 0;
        while(!stack.isEmpty()){
            ans[index++] = stack.pop();
        }
        return ans;
    }
    
    static void dfs(ArrayList<ArrayList<Integer>> adj, int v, Stack<Integer> stack, boolean[] vis){
        
        vis[v] = true;
        for(int neigbhor : adj.get(v)){
            
            if(!vis[neigbhor]){
                dfs(adj, neigbhor, stack, vis);
            }
        }
        
        stack.push(v);
    }
}
