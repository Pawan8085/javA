package javA.LinkedList;

public class RemoveNthNode {
    // Leetcode : 19. Remove Nth Node From End of List

    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode slow = head;
        ListNode fast = head;


        while(n-->0){
            fast = fast.next;
        }

        if(fast==null)return slow.next;

        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;

        }
        slow.next = slow.next.next;
        return head;
        
    }
}
