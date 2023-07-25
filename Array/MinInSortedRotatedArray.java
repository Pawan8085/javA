package javA.Array;

public class MinInSortedRotatedArray {
    // Leetcode : 153. Find Minimum in Rotated Sorted Array (Binary Search)
    // 
    public int findMin(int[] nums) {
        
        // edge cases
        if(nums[0]<nums[nums.length-1])return nums[0];
        if(nums.length==1)return nums[0];
    
        int left=0;
        int right=nums.length-1;

        while(left<=right){

            int mid=(left+right)/2;
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }else if(nums[mid]<nums[mid-1]){
                return nums[mid];
            }else if(nums[left]<=nums[mid]){
                left = mid+1;
            }else if(nums[mid]<=nums[right]){
                right = mid-1;
            }
            
        }
        return -1;
    }
}
