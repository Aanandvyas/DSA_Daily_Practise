package LinkedList.SinglyLL.Modification;

import java.util.ArrayList;
import java.util.List;

// The task is to modify the value of the first half of nodes such that 1st node's
// new value is equal to the value of the last node minus the first node's current
// value, 2nd node's new value is equal to the second last node's value minus 2nd 
// nodes current value, likewise for first half nodes, then replace the second half 
// of nodes with the initial values of the first half of nodes (values before
// modifying the nodes).

import LinkedList.SinglyLL.Node;
import LinkedList.SinglyLL.Traverse;

public class Modify {
    static int count(Node head){
        Node curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }

    static void linkedListToList(Node head,List<Integer>list){
        Node curr = head;
        while(curr != null){
            list.add(curr.data);
            curr = curr.next;
        }
    }

    static void logic(List<Integer>list,int n){
        for(int i=0;i<n/2;i++){
            int x = list.get(i);
            list.set(i, list.get(n-i-1)-x);
            list.set(n-i-1, x);
        }
    }

    static void listToLinkedList(Node head,List<Integer>list,int n){
        Node curr = head;
        for (int i = 0; i < n; i++) {
            curr.data = list.get(i);
            curr = curr.next;
        }
    }

    static Node modification(Node head){
        Node curr = head;
        if(head == null) return head;

        int n = count(curr);
        List<Integer>list = new ArrayList<>();
        linkedListToList(head, list);
        logic(list,n);
        listToLinkedList(head, list, n);

        return head;

    }
    public static void main(String[] args) {
        Node head = new Node(12);
        head.next = new Node(14);
        head.next.next = new Node(7);
        head.next.next.next = new Node(8);

        System.out.print("Original: ");
        Traverse.printLL(head);

        head = modification(head);
        Traverse.printLL(head);

    }
}
