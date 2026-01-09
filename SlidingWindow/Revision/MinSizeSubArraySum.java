package SlidingWindow.Revision;

public class MinSizeSubArraySum {
    public static int minSizArr(int[] nums,int target){
        int sum =0;
        int minSize= Integer.MAX_VALUE;
        int l=0;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            while(sum>=target){
                minSize = Math.min(minSize, i-l+1);
                sum -= nums[l];
                l++;
            }
        }
        
        return minSize==Integer.MAX_VALUE?0:minSize;

    }
    public static void main(String[] args){
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSizArr(nums, target));

    }
}
