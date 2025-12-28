package SlidingWindow;

import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class MaxSlidingWindow {
    public static int[] maxSlidWindow(int[] nums,int k){
        int n =nums.length;
        Deque<Integer> dq =new ArrayDeque<>();
        int[] res = new int[n-k+1];
        int j=0;

        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && nums[dq.getLast()]<nums[i]){
                dq.pollLast();
            }
            dq.addLast(i);
            if(dq.getFirst()+k == i){
                dq.removeFirst();
            }
            if(i>=k-1){
                res[j++] = nums[dq.getFirst()];
            }
        }
        return res;


    }
    public static void main(String[] args){
        int nums[] ={1,3,-1,-3,5,3,6,7};
        int k=3;

        int[] arr = maxSlidWindow(nums,k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
