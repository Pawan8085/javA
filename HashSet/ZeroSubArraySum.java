import java.util.HashMap;

public class ZeroSubArraySum {
    // max subarray  with zero sum
     int maxLen(int arr[], int n){
       
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int max = 0;
        int sum = 0;
        
        // this is for 0 subarray conditon
        map.put(0 , -1);
        
        for(int i=0;i<n;++i){
            sum+=arr[i];
            
            if(map.containsKey(sum)){
                
                int len = i-map.get(sum);
                max = Math.max(len, max);
            }
            else{
                
                map.put(sum, i);
                
            }
        }
        return max;
    }
}
