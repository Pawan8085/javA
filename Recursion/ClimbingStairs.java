package javA.Recursion;

public class ClimbingStairs {
    // climbing stairs problem dynamic programming
    public  int climbStairs(int n) {
    
        int[] dp = new int[n+1];
        return numberOfWays(n, dp);
        
      }
    
      public static int numberOfWays(int n, int[] dp){
    
        if(n<=0)return 0;
        if(n==1 || n==2)return n;
        if(dp[n]!=0)return dp[n];
    
        return dp[n] = numberOfWays(n-1, dp)+numberOfWays(n-2, dp);
    
      }
}
