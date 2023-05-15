package javA.Array;

public class TwoSum {
    //*  Two Sum Two Pointer 
    
    static String func(int left,int right,int[] arr,int k){
        while(left<right){
       if(arr[left]+arr[right]==k){
           return left+" "+right;
       }
       else if(arr[left]+arr[right]>k){
           right--;
       }
       else{
           left++;
        }
      } 
      return -1+" "+(-1);
   }
}
