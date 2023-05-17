public class BinarySerach {
    
    static int binarySearch(int[] arr, int target){

        int left=0;
        int right = arr.length-1;

        while(left<=right){

            // Calculation the middle index
            int mid = (left+right)/2;

            // if arr[mid] equal to target then return that index
            if(arr[mid]==target){
                return mid;
            }

            // if arr[mid] less then target then ignore the left half
            else if(arr[mid]<target){
                left = mid+1; 
            }

            // if arr[mid] greater then target then ignore the right half
            else {
                right = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int[] array = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int target = 12;

        int index = binarySearch(array, target);

        if(index==-1) System.out.println("elment not found!");
        else System.out.println("Element present at index : "+index);
    }
}
