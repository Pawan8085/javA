public class SortColors {
    // Leetcode : 75. Sort Colors
    // Dutch Flag Algo
    public void sortColors(int[] nums) {
        int low = 0;
        int high=nums.length-1;
        int mid=0;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, low++, mid++);
                
            }

            else if(nums[mid]==1){
                mid++;
            }

            else if(nums[mid]==2){
                 swap(nums, mid, high--);
                 
            }
        }
    }

    public void swap(int[] nums, int left, int right){
        int temp=nums[left];
        nums[left] = nums[right];
        nums[right]=temp;
    }
}
