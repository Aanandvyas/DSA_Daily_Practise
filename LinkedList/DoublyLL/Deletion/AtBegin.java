package LinkedList.DoublyLL.Deletion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import LinkedList.DoublyLL.Node;
import LinkedList.DoublyLL.Traverse;

public class AtBegin {
    static Node createDLL(List<Integer>list,int n){
        Node head = new Node(list.get(0));
        Node curr = head;

        for(int i=1;i<n;i++){
            Node newNode = new Node(list.get(i));
            curr.next = newNode;
            newNode.prev = curr;
            curr = newNode;
        }
        return head;
    }

    static Node deleteAtBegin(Node head){
        Node curr = head;
        head = head.next;
        curr.next.prev = null;
        curr.next = null;
        

        return head;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = scanner.nextInt();

        List<Integer>list = new ArrayList<>();
        System.out.print("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        scanner.close();

        Node head = createDLL(list, n);

        System.out.print("Original: ");
        Traverse.printF(head);

        head = deleteAtBegin(head);
        System.out.print("New: ");
        Traverse.printF(head);

    }
}
