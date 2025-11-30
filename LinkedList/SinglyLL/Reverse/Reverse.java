package LinkedList.SinglyLL.Reverse;

import java.util.Stack;

import LinkedList.SinglyLL.Node;
import LinkedList.SinglyLL.Traverse;

public class Reverse {
    static Node reverse(Node head){
        Node curr = head;
        Stack<Node>st = new Stack<>();
        while(curr != null){
            st.push(curr);
            curr = curr.next;
        }
        
        head = st.pop();
        curr = head;
        while(!st.isEmpty()){   
            curr.next = st.pop();
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

        head = reverse(head);
        System.out.print("New: ");
        Traverse.printLL(head); 
    }
}
