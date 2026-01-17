package Stack.Revision;

import java.util.Deque;
import java.util.ArrayDeque;

public class Asteroids {
    public static void main(String[] args) {
        int[] aestroids = {3,5,-6,2,-1,4};
        Deque<Integer> dq = new ArrayDeque<>();
        

        for(int aestroid : aestroids){
            boolean destroyed = false;
            while (!dq.isEmpty() && dq.peek()>0 && aestroid<0) {
                int top = Math.abs(dq.peek());
                int curr = Math.abs(aestroid);

                if(top<curr){
                    dq.pop();
                }
                else if(top == curr){
                    destroyed = true;
                    dq.pop();
                    break;
                }
                else{
                    destroyed = true;
                    break;
                }
            }
            if(!destroyed){
                dq.push(aestroid);
            }
        }
        System.out.println(dq);
    }
}
