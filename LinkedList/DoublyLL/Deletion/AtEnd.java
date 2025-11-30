package LinkedList.DoublyLL.Deletion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import LinkedList.DoublyLL.Node;
import LinkedList.DoublyLL.Traverse;

public class AtEnd {
    public static Node createDLL(List<Integer>list,int n){
        if(list.size() == 0) return null;
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

    static Node deleteAtEnd(Node head){
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter numbers: ");
        for(int i =0;i<n;i++){
            list.add(scanner.nextInt());
        }
        scanner.close();
        Node head = createDLL(list,n);
        System.out.print("Original: ");
        Traverse.printF(head);

        head = deleteAtEnd(head);

        System.out.print("New: ");
        Traverse.printF(head);
    }
}
