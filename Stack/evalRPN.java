package Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class evalRPN {
    public static void main(String[] args) {
        String[] tokens = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        Deque<Integer> dq = new ArrayDeque<>();

        for (String s : tokens) {
            if (s.equals("+")) {
                int a = dq.pop();
                int b = dq.pop();
                dq.push(a + b);
            } else if (s.equals("*")) {
                int a = dq.pop();
                int b = dq.pop();
                dq.push(a * b);
            } else if (s.equals("/")) {
                int a = dq.pop();
                int b = dq.pop();
                dq.push(b / a);
            } else if (s.equals("-")) {
                int a = dq.pop();
                int b = dq.pop();
                dq.push(b - a);
            } else {
                dq.push(Integer.parseInt(s));
            }
        }
        System.out.println(dq.getFirst());
        
    }
}
