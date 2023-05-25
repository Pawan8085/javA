package javA.LinkedList;

public class LinkedListCycle {
    // Leetcode : 141. Linked List Cycle
    public boolean hasCycle(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)return true;
        }

        return false;
    }
}
