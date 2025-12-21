package ArraysAndHashing.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n =nums.length;
        for(int i=0;i<n-1;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum = nums[l]+nums[r]+nums[i];
                if(sum == 0){
                    list.add(Arrays.asList(nums[l],nums[r],nums[i]));
                    while(l<r && nums[l] == nums[l+1]) l++;
                    while(l<r && nums[r] == nums[r-1]) r--;
                    l++;
                    r--;
                }
                else if(sum<0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return list;
    }
    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSum(nums);
        System.out.println(list);
    }
}
