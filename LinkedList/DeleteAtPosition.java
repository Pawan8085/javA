

public class DeleteAtPosition {
    // linkedlist : delete at position

    public static void deleteAtPostion(Node head, int pos){
       if(pos==0){
        head=head.next;
        return;
       } 

       Node prev=head;

       for(int i=0;i<pos-1;++i){
        prev=prev.next;
       }

       prev.next=prev.next.next;
    }
}
