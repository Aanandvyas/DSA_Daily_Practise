package LinkedList.CircularLL.Insertion;

import LinkedList.CircularLL.Node;

public class AtEnd {
    static void printll(Node head){
        Node currNode = head;
        do{
            System.out.print(currNode.data);
            currNode = currNode.next;
            if(currNode != head){System.out.print(" -> ");}
        }
        while(currNode != head);
        System.out.println();
    }

    static Node insertAtEnd(Node head){
        Node curNode = head;
        Node newNode = new Node(8);
        while(curNode.next != head){
            curNode = curNode.next;
        }
        curNode.next = newNode;
        newNode.next =head;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        Node secNode = new Node(3);
        Node thiNode = new Node(4);

        head.next = secNode;
        secNode.next = thiNode;
        thiNode.next = head;

        head = insertAtEnd(head);
        printll(head);
    }
}
