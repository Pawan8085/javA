package javA.LinkedList;

public class PalindromeLinkedList {
    // Leetcode : 234. Palindrome Linked List

    public boolean isPalindrome(ListNode head) {
       
        ListNode mid = middleNode(head);
        ListNode last = reverse(mid);
 
 
         while(last!=null){
             if(head.val != last.val)return false;
             last = last.next;
             head = head.next;
         }
         return true;
         
     }
 
     public ListNode reverse(ListNode node){
         ListNode prev = null;
 
         while(node!=null){
             ListNode temp = node.next;
             node.next = prev;
             prev = node;
             node = temp;
         }
         return prev;
     }
 
     public ListNode middleNode(ListNode node){
 
         ListNode slow = node;
         ListNode fast = node;
 
         while(fast!=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
         }
         return slow;
     }
}
