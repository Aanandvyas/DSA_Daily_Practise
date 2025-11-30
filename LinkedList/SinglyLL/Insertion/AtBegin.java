package LinkedList.SinglyLL.Insertion;

import LinkedList.SinglyLL.Traverse;
import LinkedList.SinglyLL.Node;

public class AtBegin {
    public static Node insertAtBegin(Node head,int data){
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }
    
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);

        System.out.print("Original: ");
        Traverse.printLL(head);

        head = insertAtBegin(head,5);
        System.out.print("New: ");
        Traverse.printLL(head);
    }
}
