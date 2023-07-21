public class Lower_Upper_Bound {
    
    public int lowerBound(int[] arr, int target){
        int index = -1;
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(target==arr[mid]){
                index = mid;
                // check for lower bound in left array
                right = mid-1;
            }else if(target<arr[mid]){
                right=mid-1;
            }else{
                left = mid+1;
            }
        }
        return index;
    }

    public int upperBound(int[] arr, int target){
        int index = -1;
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(target==arr[mid]){
                index = mid;
                // check for upper bound in right array
                left = mid+1;
            }else if(target<arr[mid]){
                right=mid-1;
            }else{
                left = mid+1;
            }
        }
        return index;
    }
}
