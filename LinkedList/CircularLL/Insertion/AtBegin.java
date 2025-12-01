package LinkedList.CircularLL.Insertion;

import LinkedList.CircularLL.Node;
import LinkedList.CircularLL.Traverse;

public class AtBegin {
    static Node insertAtBegin(Node head){
        Node cuNode = head;
        Node newNode = new Node(8);

        while(cuNode.next != head){
            cuNode = cuNode.next;
        }
        
        cuNode.next = newNode;
        newNode.next = head;
        return newNode;
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);

        head.next = second;
        second.next = third;
        third.next = head;

        head = insertAtBegin(head);
        Traverse.printCLL(third);
    }
}
