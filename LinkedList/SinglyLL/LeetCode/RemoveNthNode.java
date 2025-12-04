package LinkedList.SinglyLL.LeetCode;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class RemoveNthNode {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode curr = head;
        int count = 0;
        int newCount =0;

        while(temp !=null ){
            count++;
            temp = temp.next;
        }
        if(count == n){
            head = head.next;
            return head;
        }
        newCount = count -n;

        while(curr !=null && newCount>1){
            newCount--;
            curr = curr.next;
        }
        if(curr.next.next != null){
            curr.next = curr.next.next;
        }
        else{
            curr.next = null;
        }
        return head;
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
        ListNode head = new ListNode(1);
        ListNode secNode = new ListNode(2);
        ListNode thiNode = new ListNode(3);
        ListNode fourNode = new ListNode(4);

        head.next = secNode;
        secNode.next = thiNode;
        thiNode.next = fourNode;

        head = removeNthFromEnd(head,4);
        printLL(head);
        
    }
}
