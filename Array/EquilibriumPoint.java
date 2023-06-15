public class EquilibriumPoint {
    // GFG : Equilibrium Point
    public static int F(long arr[], int n) {
        
        if(n==1)return 1;
        int sum=0;
        for(int i=0;i<n;++i){
            sum+=arr[i];
        }
        
        int cursum=0;
        int ans=-1;
        for(int j=1;j<n;++j){
            cursum+=arr[j-1];
            
            if(sum-cursum-arr[j]==cursum){
                ans=j+1; // for 1 based index
                break;
            }
        }
        
        return ans;
    }
}
