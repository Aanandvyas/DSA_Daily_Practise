package LinkedList.DoublyLL.Reverse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import LinkedList.DoublyLL.Node;
import LinkedList.DoublyLL.Traverse;

public class Reverse {
    static Node createDLL(List<Integer>list,int n){
        Node head = new Node(list.get(0));
        Node current = head;
        for (int i = 1; i < n; i++) {
            Node newNode = new Node(list.get(i));
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }
        return head;
    }

    static Node reverseDLL(Node head){
        Node curr = head;
        Node last = null;
        
        while(curr !=null){
            last = curr.prev;
            curr.prev = curr.next;
            curr.next = last;
            curr = curr.prev;
        }
        head = last.prev;

        return head;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter size: ");
        int n = scanner.nextInt();
        System.out.print("enter numbers: ");
        List<Integer>list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(scanner.nextInt());
        }
        scanner.close();

        Node head = createDLL(list, n);
        System.out.print("reverse: ");
        head = reverseDLL(head);
        Traverse.printF(head);

    }
}
