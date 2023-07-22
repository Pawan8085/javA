public class SQRT {

    long findSqrt(long x) {
    
        // O(long N) solution for square root of number 
        // algorithm : binary search

        long left = 1;
        long right = x;
        long ans = -1;
        while (left <= right) {
            
            long mid = (left+right)/2;
            long sqr = mid*mid;

            if (sqr == x) {
                return mid;
            } else if (sqr<x) {
                ans = mid;
                left = mid+1;
            } else {
                right = mid-1;
            }
        }

        return ans;
    }
}
