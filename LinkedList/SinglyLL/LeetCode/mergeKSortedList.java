package LinkedList.SinglyLL.LeetCode;

import java.util.PriorityQueue;

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
        this.next = next;
    }
}

public class mergeKSortedList {
    public static ListNode mergeKLists(ListNode[] lists){
        ListNode l4 = new ListNode(0);
        ListNode dummy = l4;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i =0;i<lists.length;i++){
            ListNode curr = lists[i];
            while(curr != null){
                System.out.println(curr.val);
                pq.add(curr.val);
                curr = curr.next;
            }
        }

        while(!pq.isEmpty()){

            l4.next = new ListNode(pq.remove());
            l4 = l4.next;
        }
        
        return dummy.next;
    }
    
    public static void printLL(ListNode head){
        while (head != null) {
            System.out.print(head.val);
            if(head.next != null){
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(4);
        ListNode a3 = new ListNode(5);
        a1.next = a2;
        a2.next = a3;

        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(4);
        b1.next = b2;
        b2.next = b3;

        ListNode c1 = new ListNode(2);
        ListNode c2 = new ListNode(6);
        c1.next = c2;

        ListNode[] lists = new ListNode[] { a1, b1, c1 };

        // for (int i = 0; i < lists.length; i++) {
        //     System.out.print("List " + i + ": ");
        //     ListNode cur = lists[i];
        //     while (cur != null) {
        //         System.out.print(cur.val);
        //         if (cur.next != null) System.out.print(" -> ");
        //         cur = cur.next;
        //     }
        //     System.out.println();
        // }

        ListNode head = mergeKLists(lists);
        printLL(head);

    }
}
