package javA.Array;

public class MaxProfit {
    // Leetcode : 121. Best Time to Buy and Sell Stock
    public int maxProfit(int[] prices) {

        // solution -> carry min price & subtract from each price & store the max profit

            int n=prices.length;

            int maxProfit = 0; 
            int minSofar = prices[0];

            for(int i=1;i<n;++i){

               maxProfit = Math.max(maxProfit, prices[i]-minSofar); // updating maxProfit 
               minSofar = Math.min(minSofar, prices[i]); // updating minPrice
    
            }
            return maxProfit;
    }
}
