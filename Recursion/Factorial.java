package javA.Recursion;

public class Factorial {
    
     static int factorial(int n){
        // base condition
        if(n==0 || n==1)return 1;

        return n*factorial(n-1);
    }
}
