package javA.Math;

public class PalindromeNumber {
    // Palindrome number
    public boolean isPalindrome(int x) {
        
        if(x<0) return false;
        int num = x;
        int res = 0;

        while(num!=0){

             int digit = num%10;
             res = (res*10) + digit;
             num = num/10;

        }

        return res==x;
    }
}
