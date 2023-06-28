public class MaxElement {
    // maximum element in an array recursive solution

    public int largest(int arr[], int n)
    {
        // base condition
        if(n==0)return arr[0];
        
        return Math.max(largest(arr, n-1), arr[n-1]);
    }
}
