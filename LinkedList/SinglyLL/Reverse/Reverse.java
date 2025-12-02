package LinkedList.SinglyLL.Reverse;
import LinkedList.SinglyLL.Node;
import LinkedList.SinglyLL.Traverse;

public class Reverse {
    static Node reverse(Node head){
        Node curr = head;
        Node prev = null;

        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        System.out.print("Original: ");
        Traverse.printLL(head);

        head = reverse(head);
        System.out.print("New: ");
        Traverse.printLL(head); 
    }
}
