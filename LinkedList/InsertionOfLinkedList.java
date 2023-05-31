package javA.LinkedList;

public class InsertionOfLinkedList {
    // Leetcode : 160. Intersection of Two Linked Lists

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode cur = headA;

        int a=0, b=0;
        while(cur!=null){
            cur=cur.next;
            a++;
        }
        cur = headB;

        while(cur!=null){
            cur=cur.next;
            b++;
        }

        int dif = Math.abs(a-b);

       
        if(a>b){
            for(int i=0;i<dif;++i){
                headA = headA.next;
            }
        }

        if(b>a){
             for(int i=0;i<dif;++i){
                headB = headB.next;
            }
        }

        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;

       
    }
}
