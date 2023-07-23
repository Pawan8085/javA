public class NumberOfOccurrence {
    // *number occurrence in sorted array using binary search

    int count(int[] arr, int n, int x) {

        int startIndex = lowerBound(arr, x);
        int endIndex = upperBound(arr, x);
        
        if(startIndex==-1)return 0;
        
        return endIndex-startIndex+1;
    }
    
    public int lowerBound(int[] arr, int x ){
        int index = -1;
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            
            if(x==arr[mid]){
                index = mid;
                right = mid-1;
                
            }else if(x<arr[mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        
        return index;
    }
    public int upperBound(int[] arr, int x){
        int index = -1;
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            
            if(x==arr[mid]){
                index = mid;
                left = mid+1;
                
            }else if(x<arr[mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return index;
    }
}
