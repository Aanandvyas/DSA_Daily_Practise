package LinkedList.DoublyLL.Insertion;

import LinkedList.DoublyLL.Node;
import LinkedList.DoublyLL.Traverse;

public class AtEnd {
    static Node insertAtEnd(Node head){
        Node curr = head;
        Node newNode = new Node(5);
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
        return head;

    }
    public static void main(String[] args) {
        Node head = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);
        
        head.next = second;
        second.next = third;
        second.prev = head;
        third.prev =second;

        System.out.print("Original: ");
        Traverse.printF(head);

        head = insertAtEnd(head);
        System.out.print("New: ");
        Traverse.printF(head);

    }
}
