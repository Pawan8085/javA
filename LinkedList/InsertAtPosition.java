import org.w3c.dom.Node;

public class InsertAtPosition {
    // Linkedlist : insert at position
    
    public static void insertAtPositon(int data, Node head, int pos){
        Node toAdd = new Node(data);
        if(pos==0){
            toAdd.next=head;
            head=toAdd;
            return;
        }
         Node prev=head;
        for(int i=0;i<pos-1;++i){
            prev=prev.next;
        }

        toAdd.next=prev.next;
        prev.next=toAdd;
        
       
    }
}
