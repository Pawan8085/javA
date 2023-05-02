import java.util.*;
public class NextGreaterElement {

    //496. Next Greater Element I
    
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> map=new HashMap<>();
        Stack<Integer> stk=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!stk.isEmpty() && stk.peek()<=nums2[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                map.put(nums2[i],-1);
            }else{
                map.put(nums2[i], stk.peek());
            }
            stk.push(nums2[i]);
        }


        for(int j=0;j<nums1.length;++j){
          nums1[j]=  map.get(nums1[j]);
        }

        return nums1;
    }
    public static void main(String[] args) {
        
        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};

       int[] ans= nextGreaterElement(nums1,nums2);

       System.out.println(Arrays.toString(ans));

    }

}
