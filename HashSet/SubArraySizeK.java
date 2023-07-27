import java.util.HashMap;
import java.util.Map;

public class SubArraySizeK {
    // Leetcode : 560. Subarray Sum Equals K

    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        // map.put(0,1);
        int sum=0;
        int ans = 0;
        for(int i=0;i<nums.length;++i){
            sum+=nums[i];
            
            int rsum = sum-k;
            if(sum==k)ans++;

            if(map.containsKey(rsum)){

                ans += map.get(rsum);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
            
        }
        return ans;
        
    }
}
