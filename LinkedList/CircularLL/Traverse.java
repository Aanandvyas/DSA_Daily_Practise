package LinkedList.CircularLL;

public class Traverse {
    public static void printCLL(Node thNode){
        Node head = thNode.next;
        Node cuNode = head;
        do{
            System.out.print(cuNode.data);
            cuNode = cuNode.next;
            if(cuNode != head) System.out.print(" -> ");
        }
        while(cuNode != head);
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        Node secNode = new Node(3);
        Node thNode = new Node(4);
        

        head.next = secNode;
        secNode.next = thNode;
        thNode.next = head;

        printCLL(thNode);
    }
}
