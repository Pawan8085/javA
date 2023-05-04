import java.util.*;
public class NextGreaterElement2 {

  //   503. Next Greater Element II
    public static int[] nextGreaterElements(int[] nums) {
        
       
        
        Stack<Integer> stk = new Stack<>();

        for(int i=nums.length-2;i>=0;--i){

            while(!stk.isEmpty() && stk.peek()<=nums[i]){
                stk.pop();
            }
            stk.push(nums[i]);
        }

        int ans[]=new int[nums.length];
         for(int i=nums.length-1;i>=0;--i){

            while(!stk.isEmpty() && stk.peek()<=nums[i]){
                stk.pop();
            }

            if(stk.size()==0)ans[i]=-1;
            else ans[i]=stk.peek();
            stk.push(nums[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={1,2,1};

        int[] ans= nextGreaterElements(nums);

        System.out.println(Arrays.toString(ans));
      }
}
