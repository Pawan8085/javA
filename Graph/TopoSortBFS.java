package javA.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopoSortBFS {

    // Topological sort BFS 
    
     static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int[] inDegree = new int[V];
        for(int i=0; i<adj.size(); ++i){
            for(int it : adj.get(i)){
                inDegree[it]++;
            }
        }
        
        ArrayList<Integer> ansList = new ArrayList<>();
        
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<V; ++i){
            if(inDegree[i]==0) queue.add(i);
        }
        
        
        
        while(!queue.isEmpty()){
            
            int cur = queue.poll();
            ansList.add(cur);
            
            for(Integer neigbhor : adj.get(cur)){
                
                inDegree[neigbhor]--;
                if(inDegree[neigbhor]==0){
                    queue.add(neigbhor);
                }
            }
        }
      
        int[] ans = new int[V];
        int index = 0;
        for(Integer it : ansList){
            ans[index++] = it;
        }
            
        return ans;
    }
}
