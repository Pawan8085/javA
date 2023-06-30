package javA.Recursion;

public class Fibonacci {
    // fibonacci sequence recursive solution

    public static int fib(int n){
        // base case 
        if(n<=1) return n;
        
        return fib(n-1) + fib(n-2);
    }
}
