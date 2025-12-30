package Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class AestroidCollapse {
    public static int[] asteroidCollision(int[] asteroids) {
        Deque<Integer>dq = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        for(int i:asteroids){
            if(dq.isEmpty()){
                dq.push(i);
            }
            else if(!dq.isEmpty() && Math.abs(dq.peek()+i)<=Math.abs(dq.peek())){
                while(Math.abs(dq.peek())<Math.abs(i)){
                    dq.pop();
                }
                if(!dq.isEmpty()){
                    list.add(i);
                }
                else{
                    list.add(i);
                    while(!dq.isEmpty()){
                        dq.pop();
                    }
                }
            }
            else{
                dq.push(i);
            }
        }
        while(!dq.isEmpty()){
            list.add(dq.pop());
        }
        int n = list.size();
        int[] res = new int[n];
        int i=0;
        for (Integer integer : list) {
            res[i++] = integer;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] asteroids = {3,5,-6,2,-1,4};
        int[] nums = asteroidCollision(asteroids);

        for (int i : nums) {
            System.out.print(i);
        }

    }
}
