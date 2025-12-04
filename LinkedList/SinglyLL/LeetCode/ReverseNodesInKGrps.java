package LinkedList.SinglyLL.LeetCode;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class ReverseNodesInKGrps {
    
    public static ListNode reverseLLFromKth(ListNode head,int k){
        ListNode temp = head;
        ListNode l1 = new ListNode(0);
        ListNode dummy = l1;
        ListNode curr = head;
        Stack<Integer> st = new Stack<>();
        int count = 0;

        while(temp != null){
            temp = temp.next;
            count++;
        }
        System.out.println("cnt: "+ count);

        int totalGrps = count/k ;
        System.out.println("grps: "+totalGrps);

        int tempSize = 0;

        while(tempSize != totalGrps && curr != null){
            for(int i=0;i<k;i++){
                System.out.println("pushing: "+curr.val);
                st.push(curr.val);
                curr = curr.next;
            }
            while(!st.isEmpty()){
                l1.next = new ListNode(st.pop());
                l1 = l1.next;
                System.out.println("l1.next: "+l1.val);
            }
            tempSize++;
        }
        l1.next = curr;
        
    
        return dummy.next;
    }

    public static void printLL(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val);
            if(curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode secNode = new ListNode(2);
        ListNode thiNode = new ListNode(3);
        ListNode fourNode = new ListNode(4);
        ListNode fifthNode = new ListNode(5);
        


        head.next = secNode;
        secNode.next = thiNode;
        thiNode.next = fourNode;
        fourNode.next = fifthNode;
        

        ListNode l1 = reverseLLFromKth(head, 3);
        printLL(l1);
        
    }
}
