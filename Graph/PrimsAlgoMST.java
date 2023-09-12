package javA.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class PrimsAlgoMST {
    
    static int spanningTree(int V, int E, int edges[][]){
	    
	    ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int weight = edges[i][2];

            adj.get(u).add(new ArrayList<>(Arrays.asList(v, weight)));
            adj.get(v).add(new ArrayList<>(Arrays.asList(u, weight)));
        }
        
        return spanningTree(V, adj);
	}
	 static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj){
                           
        boolean[] vis = new boolean[V];
        PriorityQueue<Pair> q = new PriorityQueue<>();
        
        q.add(new Pair(0, 0));
        int ans = 0;
        
        while(!q.isEmpty()){
            
            Pair cur = q.remove();
            
            int u = cur.v;
            
            if(vis[u]) {
                continue;
            }
            
            ans += cur.w;
            vis[u] = true;
            
           ArrayList<ArrayList<Integer>> nbr = adj.get(u);
           
           for(ArrayList<Integer> list : nbr){
               
               int vertex = list.get(0);
               int wt = list.get(1);
               
               if(vis[vertex]==false){
                   q.add(new Pair(vertex, wt));
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
