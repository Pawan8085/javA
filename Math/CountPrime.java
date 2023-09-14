package javA.Math;

import java.util.Arrays;

public class CountPrime {

    // prime number counting algo
    
    class Solution {
    public int countPrimes(int n) {

        if(n<2) return 0;
        
        boolean[] primes = primeArray(n);
        int count = 0;

        for(int i=2; i<n; ++i){
            if(primes[i]) count++;
        }

        return count;

        

    }

   boolean[] primeArray(int n){

       boolean[] isPrime = new boolean[n+1];
       Arrays.fill(isPrime, true);
       isPrime[0] = false;
       isPrime[1] = false;

       for(int i=2; i*i<=n; ++i){

           for(int j=2*i; j<=n; j+=i){
               isPrime[j] = false;
           }
       }

       return isPrime;
   }
}
}
