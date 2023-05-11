import java.util.*;
public class LongestSubstring {
    // Leetcode : 3. Longest Substring Without Repeating Characters
    public static int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();
 
        int max =0;
        int l=0;
        int r=0;
 
        while(r<s.length()){
 
            if(set.contains(s.charAt(r))){
                set.remove(s.charAt(l++));
            }
            else{
                set.add(s.charAt(r++));
                 max = Math.max(max, set.size());
            }
        }
 
        return max;
     }
     
     public static void main(String[] args) {
        String s = "abcabcbb";

        int maxLength = lengthOfLongestSubstring(s);

        System.out.println(maxLength);
     }
}
