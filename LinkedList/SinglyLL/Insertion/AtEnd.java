package LinkedList.SinglyLL.Insertion;
import LinkedList.SinglyLL.*;

public class AtEnd {
    public static Node insertAtEnd(Node head,int data){
        Node curr = head;
        Node newNode = new Node(data);
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);

        System.out.print("Original: ");
        Traverse.printLL(head);
        head = insertAtEnd(head, 5);
        System.out.print("new: ");
        Traverse.printLL(head);
        
    }
}
