package LinkedList.SinglyLL.Insertion;

import LinkedList.SinglyLL.Node;
import LinkedList.SinglyLL.Traverse;

public class AtSpot {
    public static Node inserAtSpot(Node head,int data,int pos){
        Node newNode = new Node(data);
        if(pos == 1){
            newNode.next = head;
            return newNode;
        }
        Node curr = head;
        for(int i=1;i<pos-1;i++){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        System.out.print("Original: ");
        Traverse.printLL(head);

        System.out.print("New: ");
        int pos = 1;
        head = inserAtSpot(head, 6,pos);
        Traverse.printLL(head);
        
    }
}
