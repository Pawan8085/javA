package javA.LinkedList;

public class ReverseALinkedList {
    // Leetcode : 206. Reverse Linked List
    public ListNode reverseList(ListNode head) {
       
        ListNode prev = null;
        ListNode cur = head;
 
        while(cur!=null){
 
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
       
     }
}
