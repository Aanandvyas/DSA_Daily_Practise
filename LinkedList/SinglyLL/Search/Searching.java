package LinkedList.SinglyLL.Search;

import LinkedList.SinglyLL.Node;

public class Searching {
    public static String Search(Node head,int val){
        Node curr = head;
        while(curr != null){
            if(curr.data == val) return "yes";
            curr = curr.next;
        }
        return "NO";
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        System.out.print("Found: ");
        System.out.print(Search(head, 4));
        

    }
}
