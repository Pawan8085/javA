import java.util.*;
public class Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
            for(int j=0;j<s.length();++j){
                Character temp=s.charAt(j);
                
                if(temp=='('||temp=='[' || temp=='{'){
                    stk.add(temp);
                }
                 else {
                     if(stk.isEmpty())return false;
                     if(temp==')' && stk.peek() != '(')return false;
                     if(temp==']' && stk.peek() != '[')return false;
                     if(temp=='}' && stk.peek() != '{')return false;
                     stk.pop();
                 }
                
            }  
            return stk.isEmpty();
    }

    public static void main(String[] args) {
        
        String str = "{}()[]";
        String str2 = "(}";

        
        System.out.println(isValid(str));
        System.out.println(isValid(str2));
    }
}
