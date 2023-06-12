public class SlidingWindow {
    
    public static int maxSum(int[] arr, int k){
        int n=arr.length;

        int left=0;
        int right=k-1;
        int sum=0;
        for(int j=0;j<k;++j){
            sum+=arr[j];
        }
        int max=sum;
        while(right<n-1){
            right++;
            sum+=arr[right];
            sum-=arr[left];
            left++;
            if(sum>max){
                max=sum;
            }
        }
       return max;
    }
}
