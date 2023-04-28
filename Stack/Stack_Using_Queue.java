import java.util.*;
public class Stack_Using_Queue{
     
    Queue<Integer> q1, q2;
    public Stack_Using_Queue(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    public void push(int data){
       
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        q1.add(data);
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
    }
    public int pop(){
        return q1.remove();
    }
    public int top(){
        return q1.peek();
    }
    public boolean empty(){
        return q1.isEmpty();
    }
    
    public static void main(String[] args) {
        Stack_Using_Queue s= new Stack_Using_Queue();
        s.push(15);
        s.push(10);
        s.push(2001);
        System.out.println(s.top());
    }
}