package LinkedList.DoublyLL.Insertion;

import LinkedList.DoublyLL.Node;
import LinkedList.DoublyLL.Traverse;

public class AtBegin {
    static Node inserAtBegin(Node head) {
        Node newNode = new Node(5);
        newNode.next = head;
        head.prev = newNode;
        return newNode;
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);

        head.next = second;
        second.next = third;
        second.prev = head;
        third.next = null;
        third.prev = second;

        System.out.print("Original: ");
        Traverse.printF(head);

        head = inserAtBegin(head);
        System.out.print("New: ");
        Traverse.printB(third);
        Traverse.printF(head);

    }
}
