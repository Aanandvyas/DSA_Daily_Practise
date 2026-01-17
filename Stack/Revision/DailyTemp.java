package Stack.Revision;
import java.util.Deque;
import java.util.ArrayDeque;

public class DailyTemp {
    public static void main(String[] args){
        int[] temp = {73,74,75,71,69,72,76,73};
        int n = temp.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && temp[i] > temp[dq.peek()]){
                int prevIndx = dq.pop();
                arr[prevIndx] = i-prevIndx;
            }
            dq.push(i);
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
