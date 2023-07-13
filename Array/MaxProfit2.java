package javA.Array;

public class MaxProfit2 {
    // Leetcode : Best Time to Buy and Sell Stock II

    public int maxProfit(int[] prices) {
        int n=prices.length;

           int maxProfit = 0;
           for(int i=1;i<n;++i){

              if(prices[i]>prices[i-1]){
                 maxProfit += prices[i]-prices[i-1]; // subtracting current high price with previous  low price 


              }
   
           }
           return maxProfit;
   }
}
