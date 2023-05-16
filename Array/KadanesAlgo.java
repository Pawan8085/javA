public class KadanesAlgo {
    // Leetcode : 53. Maximum Subarray

    public static int maxSubArray(int[] nums) {
        int cursum=0;
        int max=nums[0];

        for(int i=0;i<nums.length;++i){
            cursum+=nums[i];
            if(cursum>max)max=cursum;
             if(cursum<0)cursum=0;
        }
        return max;
    }

    public static void main(String[] args) {
        
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max = maxSubArray(nums);

        System.out.println(max);
    }
}
