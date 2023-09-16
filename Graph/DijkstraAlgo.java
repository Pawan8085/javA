package javA.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class DijkstraAlgo {

    // Dijkstra Algorithm
    
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
      
        PriorityQueue<Pair> q = new PriorityQueue<>();
        
        q.add(new Pair(S, 0));
        int[] ans = new int[V];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[S] = 0;
        
        while(!q.isEmpty()){
            
            Pair cur = q.remove();
            
            int u = cur.v;
            
           ArrayList<ArrayList<Integer>> nbr = adj.get(u);
           
           for(ArrayList<Integer> list : nbr){
               
               int vertex = list.get(0);
               int wt = list.get(1);
               
               if(ans[vertex] > ans[u] + wt){
                   ans[vertex] = ans[u] + wt;
                   q.add(new Pair(vertex, ans[vertex]));
               }
           }
            
            
        }
        
        return ans;
    }
}

class Pair implements Comparable<Pair>{
    int v;
    int w;
    
    public Pair(int v, int w){
        this.v = v;
        this.w = w;
    }
    
    public int compareTo(Pair p){
        return this.w-p.w;
        
    }
}
