package ArraysAndHashing.Leetcode;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] nums = {0,0,1,1,2,3,2,4};
        Arrays.sort(nums);
        int n = nums.length;
        int r=1;
        int w=1;

        while(r<n){
            if(nums[r] != nums[r-1]){
                nums[w] = nums[r];
                w++;
            }
            r++;
        }
        System.out.println(w);

    }
}
