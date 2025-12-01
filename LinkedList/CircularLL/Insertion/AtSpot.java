package LinkedList.CircularLL.Insertion;

import LinkedList.CircularLL.Node;

public class AtSpot {
    static void printLL(Node head) {
        Node currNode = head;

        do {
            System.out.print(currNode.data);
            currNode = currNode.next;
            if (currNode != head)
                System.out.print(" -> ");
        } while (currNode != head);

    }

    static Node insertAtSpot(Node head, int pos) {

        Node currNode = head;
        Node newNode = new Node(8);
        if (pos == 1) {
            while(currNode.next != head){
                currNode = currNode.next;
            }
            newNode.next = head;
            currNode.next = newNode;
            return newNode;
        }

        for (int i = 1; i < pos - 1; i++) {
            currNode = currNode.next;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        Node secNod = new Node(3);
        Node thiNode = new Node(4);
        Node fourNode = new Node(5);

        head.next = secNod;
        secNod.next = thiNode;
        thiNode.next = fourNode;
        fourNode.next = head;

        head = insertAtSpot(head, 1);
        printLL(head);
    }
}
