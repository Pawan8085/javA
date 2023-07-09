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
            }

            // if left and right element both are negative then will increment our left variable cause we have to look for positive element 
            else if(arr[left]<0 && arr[right]<0){
                left++;
            }

            else{
                right--;
            }
           
        }
    }
}
