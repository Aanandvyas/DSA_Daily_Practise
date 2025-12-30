package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BaseballGame {
    public static void main(String[] args){
        String[] nums = {"5","-2","4","C","D","9","+","+"};
        Deque<Integer>dq = new ArrayDeque<>();


        for(String s:nums){
            if(s.equals("C")){
                dq.removeLast();
            }
            else if(s.equals("D")){
                int c = dq.getLast();
                dq.addLast(c*2);
                System.out.println("D: "+dq);
            }
            else if(s.equals("+")){
                int a = dq.getLast();
                dq.pollLast();
                int b = dq.getLast();
                dq.pollLast();
                dq.addLast(b);
                dq.addLast(a);
                dq.add(a+b);
                System.out.println(dq);
            }
            else{
                dq.addLast(Integer.parseInt(s));
            }
        }

        int sum =0;
        while(!dq.isEmpty()){
            sum+=dq.peek();
            dq.poll();
        }
        
        System.out.println(sum);

    }
}
