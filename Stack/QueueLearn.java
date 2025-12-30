package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLearn {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(9);
        q.add(71);
        q.add(21);
        System.out.println(q);
        
        Deque<Integer> dq = new ArrayDeque<>();
        dq.push(4);
        dq.push(34);
        dq.push(21);
        dq.add(3);
        dq.poll();

        System.out.println(dq);
    }
}
