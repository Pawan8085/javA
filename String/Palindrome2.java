
public class Palindrome2 {
    // Leetcode : 680. Valid Palindrome II
    // Question : Given a string s, return true if the s can be palindrome after deleting at most one character from it.
    public static boolean validPalindrome(String s) {
        
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return isPalindrome(left+1, right, s) || isPalindrome(left, right-1, s);
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome(int left, int right, String str){

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abca";

        String s2 = "abc";

       boolean ans =  validPalindrome(s1);

       System.out.println(ans);

    }
}
