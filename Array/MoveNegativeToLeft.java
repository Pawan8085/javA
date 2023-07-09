package javA.Array;

public class MoveNegativeToLeft {
    
    public static void moveToLeft(int[] arr, int n){
        int left=0;
        int right=n-1;
        while(left<right){

            // if left element is positive and right is negative then we have to swap them
            if(arr[left]>0 && arr[right]<0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            // if left and right element both are negative then will increment our left variable cause we have to look for positive element 
            else if(arr[left]<0 && arr[right]<0){
                left++;
            }

            // if both are positive then right element is in right positon will look for negative element and decrease our right pointer
            else if (arr[left]>0 && arr[right]>0){
                right--;
            }

            // if we are getting negative left side & positive right side then they are in right position will simply move our left & right pointer
            else{
                right--;
                left++;
            }
           
        }
    }
}
