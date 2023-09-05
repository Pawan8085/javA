package javA.Graph;

import java.util.ArrayList;
import java.util.List;

public class AdjencyListOfUnDirectedGraph {
    
    public List<List<Integer>> adjencyList(int V, int edges[][]) {
        
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i=0; i<V; ++i){
            adj.add(new ArrayList<>());
        }
        
        
        for(int i=0; i<edges.length; ++i){
            
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            
            adj.get(v1).add(v2);
            adj.get(v2).add(v1);
        }
        
        return adj;
    }
}
