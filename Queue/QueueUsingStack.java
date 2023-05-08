package javA.Queue;
import java.util.*;
public class QueueUsingStack {
    // *Leetcode 232. Implement Queue using Stacks

    Stack<Integer> stk1, stk2;
    public QueueUsingStack(){
        stk1=new Stack<Integer>();
        stk2=new Stack<Integer>();
    }
    void push(int data){
        stk1.push(data);
    }

    int pop(){
        while(!stk1.isEmpty()){
            stk2.push(stk1.pop());
        }
       int poppedData = stk2.pop();

       while(!stk2.isEmpty()){
        stk1.push(stk2.pop());
       }
       return poppedData;
    }

    int peek(){
         while(!stk1.isEmpty()){
            stk2.push(stk1.pop());
        }
       int poppedData = stk2.peek();

       while(!stk2.isEmpty()){
        stk1.push(stk2.pop());
       }
       return poppedData;
    }

    boolean empty(){
        return stk1.size()==0;
    }

    
}
