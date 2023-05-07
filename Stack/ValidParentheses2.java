import java.util.*;
public class ValidParentheses2 {
    
    public static boolean isValid(String str){
         
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<str.length();++i){
            
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                stk.push(str.charAt(i));
            }else if(stk.peek()=='(' && str.charAt(i)==')' || stk.peek()=='{' && str.charAt(i)=='}' || stk.peek()=='[' && str.charAt(i)==']'){
                stk.pop();
            }else if(str.charAt(i)==')' || str.charAt(i)=='}' || str.charAt(i)==']'){
               
                return false;
            }
        }
        
        return stk.size()==0;
        
    }

    public static void main(String[] args) {
        
        String str="((((((((((Pawan))))))))))";
        System.out.println(isValid(str));
    }
}
