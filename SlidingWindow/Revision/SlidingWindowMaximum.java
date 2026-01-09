package SlidingWindow.Revision;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static int[] maxSliding(int[] nums,int k){
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] res = new int[n-k+1];
        int j =0;

        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && nums[i]>nums[dq.getLast()]){
                dq.pollLast();
            }
            dq.addLast(i);
            if(dq.getFirst()+k == i) dq.pollFirst();
            if(i>=k-1){
                res[j++] = nums[dq.getFirst()];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k =3;

        int[] arr = maxSliding(nums,k);
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
