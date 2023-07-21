package javA.Array;

public class OrderNotKnownSearch {
    
    public static void main(String[] args) {

        // *Binary search to find element in reversed sorted array

        int ans = -1;
        int[] arr=new int[]{10, 9, 7, 5, 3, 2}; // Sorted descending order
       // arr = new int[]{1,2,3,5,6, 9}; // Sorted ascending order
        int k=3;
        if(arr.length>1){
            if(arr[0]<arr[1]){
              ans =  binarySearchAscending(arr, k);
            }else{
               ans = binarySearchDescending(arr, k);
            }
        }
        
        System.out.println("Element "+ k +" Present at index : "+ans);
        
    }
    
    public static int binarySearchAscending(int[] arr, int target){
        
        int left = 0;
        int right = arr.length-1;
        
        while(left<=right){
            int mid = (left+right)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target<arr[mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }
    public static int binarySearchDescending(int[] arr, int target){
        
        int left = 0;
        int right = arr.length-1;
        
        while(left<=right){
            int mid = (left+right)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target<arr[mid]){
                
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        
        return -1;
    }
}
