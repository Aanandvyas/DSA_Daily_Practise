package Stack.Revision;

import java.util.Deque;
import java.util.ArrayDeque;

public class BaseBallGame {
    public static void main(String[] args){
        String[] ops = {"5","-2","4","C","D","9","+","+"};

        Deque<Integer> dq = new ArrayDeque<>();
        for(String s:ops){
            if(s.equals("C")){
                dq.pollLast();
            }
            else if(s.equals("D")){
                int a = dq.getLast();
                dq.addLast(a*2);
            }
            else if(s.equals("+")){
                int a = dq.pollLast();
                int b = dq.pollLast();
                int c = a+b;
                dq.addLast(b);
                dq.addLast(a);
                dq.addLast(c);
            }
            else{
                dq.addLast(Integer.parseInt(s));
            }
        }

        int sum = 0;
        while(!dq.isEmpty()){
            sum+=dq.poll();
        }
        System.out.println(sum);
    }
}
