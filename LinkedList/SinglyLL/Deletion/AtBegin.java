package LinkedList.SinglyLL.Deletion;

import LinkedList.SinglyLL.Node;
import LinkedList.SinglyLL.Traverse;

public class AtBegin {
    public static Node deleteAtBegin(Node head){
        Node curr = head;
        head = curr.next;
        curr.next = null;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);

        System.out.print("Original: ");
        Traverse.printLL(head);
        
        System.out.print("New: ");
        head = deleteAtBegin(head);
        Traverse.printLL(head);

    }
}
