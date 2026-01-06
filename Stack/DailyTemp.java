package Stack;

import java.util.*;

public class DailyTemp {
    public static void main(String[] args){
        int[] temperatures = {73,74,75,71,69,72,76,73};
        Deque<Integer> dq = new ArrayDeque<>();
        int n = temperatures.length;
        int[] res = new int[n];

        
        for (int i = 0; i < temperatures.length; i++) {
            while(!dq.isEmpty() && temperatures[dq.peek()] < temperatures[i]){
                int prevind = dq.pop();
                res[prevind] = i-prevind;
            }
            dq.push(i);
        }

        for(int i=0;i<n;i++){
            System.out.print(res[i]);
        }
    }
}
