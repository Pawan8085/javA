package javA.Array;

public class FirstMissingPositive {
    // Leetcode : 41. First Missing Positive

    public int firstMissingPositive(int[] nums) {

        // first will replace non negative value with nums.length+1;
        for(int i=0;i<nums.length;++i){
           if(nums[i]<=0)nums[i]=nums.length+1; 
        }

        // mark present positive numbers's index with arr[arr[i]-1]*=-1;

        for(int i=0;i<nums.length;++i){
            int ind = Math.abs(nums[i])-1;

            if(ind<nums.length){
                if(nums[ind]>0) // will handle duplicate
               nums[ind] *= -1;
            }
           
        }
        
        for(int i=0;i<nums.length;++i){
            if(nums[i]>0)return i+1;
        }

        // all negative case
        return nums.length+1;
    }
}
