public class PowerOfTwo {
    
    public boolean isPowerOfTwo(int n) {
        // Leetcode : 231. Power of Two

        if(n<1)return false;
        if(n==1)return true;
        if(n%2==1)return false;

        return isPowerOfTwo(n/2);
    }
}
