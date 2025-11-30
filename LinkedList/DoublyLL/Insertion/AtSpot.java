package LinkedList.DoublyLL.Insertion;

import LinkedList.DoublyLL.Node;
import LinkedList.DoublyLL.Traverse;

public class AtSpot {
    static Node insertAtSpot(Node head,int val,int pos){
        Node curr = head;
        Node newNode = new Node(val);
        for (int i = 1; i < pos-1; i++) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next.prev = newNode;
        curr.next = newNode;

        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);
        Node fourth = new Node(5);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;

        System.out.print("Original: ");
        Traverse.printF(head);

        head = insertAtSpot(head, 6, 3);
        System.out.print("New: ");
        Traverse.printF(head);
    }
}
