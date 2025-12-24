package ArraysAndHashing.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums,int target){
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1;j<n-2;j++){
                if(i>j+1 && nums[j] == nums[j+1]) continue;
                int l=j+1;
                int r=n-1;
                while(l<r){
                    int sum = nums[l]+nums[r]+nums[i]+nums[j];
                    if(sum == target){
                        list.add(Arrays.asList(nums[l],nums[r],nums[i],nums[j]));
                        while(l<r && nums[l]==nums[l+1]) l++;
                        while(l<r && nums[r] == nums[r-1]) r--;
                        l++;
                        r--;
                    }
                    else if(sum<target){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
            }
        }
        return list;
    }
    public static void main(String[] args){
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> list = fourSum(nums, target);
        System.out.println(list);

    }
}
