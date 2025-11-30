package LinkedList.SinglyLL.Deletion;

import LinkedList.SinglyLL.Node;
import LinkedList.SinglyLL.Traverse;

public class AtSpot {
    public static Node deleteAtSpot(Node head,int pos){
        if(pos == 1){
            head = head.next;
            return head;
        }
        Node curr = head;
        for(int i=1;i<pos-1;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    } 
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        System.out.print("Original: ");
        Traverse.printLL(head);
        int pos = 3;

        head = deleteAtSpot(head, pos);

        System.out.print("New: ");
        Traverse.printLL(head);
    }
}
