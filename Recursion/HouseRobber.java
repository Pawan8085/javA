package javA.Recursion;

import java.util.Arrays;

public class HouseRobber {
    // Leetcode : 198. House Robber 
    public int rob(int[] nums) {
        
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return maxMoney(nums, memo, 0);
    }

    int maxMoney(int[] nums, int[] memo, int i){
       
        if(i >= nums.length) return 0;

        if(memo[i] != -1) return memo[i];

        int option1 = nums[i] + maxMoney(nums, memo, i+2);
        int option2 = maxMoney(nums, memo, i+1);

        memo[i] = Math.max(option1, option2);
        return memo[i];
    }
}
