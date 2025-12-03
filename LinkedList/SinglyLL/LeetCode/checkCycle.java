package LinkedList.SinglyLL.LeetCode;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class checkCycle {
    static Boolean check(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

       while (fast.next !=null || fast != null ) {
          fast = fast.next.next;
          slow = slow.next;
          if(fast == slow) return true;
       }
       return false; 
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode secNode = new ListNode(2);
        ListNode thiNode = new ListNode(0);
        ListNode fourNode = new ListNode(4);

        head.next = secNode;
        secNode.next = thiNode;
        thiNode.next = fourNode;
        fourNode.next = secNode;

        Boolean res = check(head);
        System.out.print(res);
    }
}
