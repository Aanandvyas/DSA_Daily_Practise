package LinkedList.SinglyLL.LeetCode;

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class AddTwoLL {
    static ListNode addTwoLL(ListNode l1,ListNode l2){
        if(l1 == null && l2 ==null) return null;
        if(l1 == null) return l2;
        if(l2 == null) return l1; 
        ListNode l3 = new ListNode(3);
        ListNode dummy = l3;
        int carry = 0;

        while(l1 != null && l2 != null){
            int sum = l1.val+l2.val+carry;
            int digit = sum%10;
            carry = sum/10;
            l3.next = new ListNode(digit);
            l3 = l3.next;
            if (l1.next == null && l2.next != null) {
                l1.next = new ListNode(0);
            }

            if (l2.next == null && l1.next != null) {
                l2.next = new ListNode(0);
            }

            l1 = l1.next;
            l2 = l2.next;

        }
        if(carry != 0){
            l3.next = new ListNode(carry);
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
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);

        ListNode l3 = addTwoLL(l1, l2);
        printLL(l3);    
    }
}
