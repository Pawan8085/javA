public class AddTwoNumbers {
    // Leetcode : 2. Add Two Numbers
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode ans=new ListNode(0);
         ListNode head=ans;
         int carry=0;
        while(l1!=null && l2!=null){
 
            int sum=l1.val+l2.val+carry;
            carry=sum/10;
            ans.next = new ListNode(sum%10);
 
            ans=ans.next;
            l1=l1.next;
            l2=l2.next;
 
        } 
 
        while(l1!=null){
            int sum=l1.val+carry;
            carry=sum/10;
            ans.next = new ListNode(sum%10);
 
            ans=ans.next;
            l1=l1.next;
 
        }
 
        while(l2!=null){
           int sum=l2.val+carry;
            carry=sum/10;
            ans.next = new ListNode(sum%10);
            ans=ans.next;
            l2=l2.next;
  
        }
        if(carry!=0){
            ans.next=new ListNode(carry);
        }
 
        return head.next;
     }
}
