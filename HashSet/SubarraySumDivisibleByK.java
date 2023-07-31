import java.util.HashMap;
import java.util.Map;

public class SubarraySumDivisibleByK {
    // Leetcode : 974. Subarray Sums Divisible by K

     public int subarraysDivByK(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int remainder = 0;

        int ans = 0;
        for(int i=0;i<nums.length;++i){
            
            sum+=nums[i];

            remainder = sum%k;

            if(remainder<0){
                remainder+=k;
            }

            if(map.containsKey(remainder)){
                ans+=map.get(remainder);
                map.put(remainder, map.get(remainder)+1);
            }else{
                map.put(remainder, 1);
            }

        }
        return ans;
    }
}
