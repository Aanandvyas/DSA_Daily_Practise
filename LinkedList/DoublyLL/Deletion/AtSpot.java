package LinkedList.DoublyLL.Deletion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import LinkedList.DoublyLL.Node;
import LinkedList.DoublyLL.Traverse;

public class AtSpot {
    static Node createDLL(List<Integer>list,int n){
        Node head = new Node(list.get(0));
        Node current = head;
        for(int i=1;i<n;i++){
            Node newNode = new Node(list.get(i));
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }
        return head;
    }
    static Node deleteAtEnd(Node head,int pos,int n){
        Node curr = head;
        if(pos == 1){
            head = head.next;
            curr.next = null;
            head.prev = null;
            return head;
        }
        if(pos == n){
            while(curr.next.next != null){
                curr = curr.next;
            }
            curr.next.prev = null;
            curr.next = null;
            return head;
        }
        for(int i=1;i<pos-1;i++){
            curr = curr.next;
        }
        curr.next.next.prev = curr;
        curr.next = curr.next.next;
        return head;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = scanner.nextInt();
        List<Integer>list = new ArrayList<>();
        System.out.println("Enter number: ");

        for(int i=0;i<n;i++){
            list.add(scanner.nextInt());
        }
        System.out.println("Enter postn to remove: ");
        int pos = scanner.nextInt();
        scanner.close();
        Node head = createDLL(list, n);

        System.out.print("Original");
        Traverse.printF(head);

        head = deleteAtEnd(head, pos,n);
        System.out.print("New: ");
        Traverse.printF(head);
    }
}
