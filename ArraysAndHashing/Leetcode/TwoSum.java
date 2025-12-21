package ArraysAndHashing.Leetcode;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums,int target){
        int l,r;
        l=0;
        r=nums.length-1;
        Arrays.sort(nums);
        while(l<r){
            int sum = nums[l]+nums[r];
            if(sum == target){
                return new int[]{nums[l],nums[r]};
            }
            else if(sum<target){
                l++;
            }
            else{
                r--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int[] nums = {2,11,15,7,9};
        int target = 9;
        int[] ans = twoSum(nums,target);
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}
