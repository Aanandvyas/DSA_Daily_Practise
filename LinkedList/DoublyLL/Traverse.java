package LinkedList.DoublyLL;

public class Traverse {

    public static void printF(Node head){
        Node curr = head;
        System.out.print("Forward: ");
        while(curr != null){
            System.out.print(curr.data);
            if(curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void printB(Node last){
        Node curr = last;
        System.out.print("Backward: ");
        while(curr != null){
            System.out.print(curr.data);
            if(curr.prev != null) System.out.print(" <- ");
            curr = curr.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);

        head.next = second;
        second.next = third;
        second.prev = head;
        third.next = null;
        third.prev = second;

        printF(head);
        printB(third);
    }
}
