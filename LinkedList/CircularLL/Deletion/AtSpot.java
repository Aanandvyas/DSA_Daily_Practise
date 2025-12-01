package LinkedList.CircularLL.Deletion;

import LinkedList.CircularLL.Node;

public class AtSpot {
    static void printLL(Node head){
        Node currNode = head;
        do{
            System.out.print(currNode.data);
            currNode = currNode.next;
            if(currNode != head) System.out.print(" -> ");
        }
        while(currNode != head);
    }
    static Node deletAtSpot(Node head,int pos){
        Node currNode = head;
        if(pos == 1){
            while(currNode.next != head){
                currNode = currNode.next;
            }
            currNode.next = head.next;
            head = head.next;
            return head;
        }
        for(int i = 1;i<pos-1;i++){
            currNode = currNode.next;
        }
        currNode.next = currNode.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        Node secNode = new Node(3);
        Node thiNode = new Node(4);
        Node fourNode = new Node(5);

        head.next = secNode;
        secNode.next = thiNode;
        thiNode.next = fourNode;
        fourNode.next = head;

        head = deletAtSpot(head, 4);
        printLL(head);
    }
}
