package LinkedList.SinglyLL.Deletion;

import LinkedList.SinglyLL.Node;
import LinkedList.SinglyLL.Traverse;

public class AtEnd {
    public static Node deleteAtEnd(Node head){
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;

        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        
        System.out.print("Original: ");
        Traverse.printLL(head);

        head = deleteAtEnd(head);
        System.out.print("New: ");
        Traverse.printLL(head);
    }
}
