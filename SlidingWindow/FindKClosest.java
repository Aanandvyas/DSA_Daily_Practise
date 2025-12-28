package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FindKClosest {
    public static List<Integer> closestElements(int[] nums,int k,int x){
        int l=0;
        int n=nums.length;
        int r=n-1;

        while(r-l+1>k){
            if(Math.abs(nums[l]-x)<Math.abs(nums[r]-x)){
                r--;
            }
            else{
                l++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i=l;i<=r;i++){
            list.add(nums[i]);
        }

        return list;

    }
    public static void main(String[] args){
        int[] nums = {1,1,2,3,4,5};
        int k=4;
        int x=-1;

        List<Integer> list = closestElements(nums, k, x);
        System.out.println(list);

    }
}
