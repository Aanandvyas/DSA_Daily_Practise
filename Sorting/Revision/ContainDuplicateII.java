package Sorting.Revision;

import java.util.HashSet;

public class ContainDuplicateII {
    public static boolean containDuplicate(int[] nums,int k){
        HashSet<Integer> set = new HashSet<>();
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if(r-l>k){
                set.remove(nums[l]);
            }
            if(!set.add(nums[r])){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int k=3;
        int[] nums = {1,0,1,1};
        System.out.println(containDuplicate(nums, k));     
    }
    
}
