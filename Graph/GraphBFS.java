package javA.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {
    // Graph bfs 
     public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       
       ArrayList<Integer> bfs = new ArrayList<>();
       boolean[] vis = new boolean[V];
       Queue<Integer> queue = new LinkedList<>();
       
       queue.add(0);
       vis[0] = true;
       
       while(!queue.isEmpty()){
           
           Integer node = queue.poll();
           bfs.add(node);
           
           for(Integer it : adj.get(node)){
               
               if(vis[it]==false){
                   vis[it] = true;
                   queue.add(it);
               }
           }
       }
       
       return bfs;
    }
}
