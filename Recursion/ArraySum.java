package javA.Recursion;

public class ArraySum {
    
    static int sum(int[] arr, int n){
        // base condition
        if(n==0)return 0;

        return arr[n-1]+sum(arr, n-1);
    }
}
