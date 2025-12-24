package ArraysAndHashing.Leetcode;

public class MaxArea {
    public static int maxArea(int[] height){
        int n=height.length;
        int l=0;
        int r=n-1;
        int max=0;

        while (l<r) {
            int temp = (r-l)*Math.min(height[l], height[r]);
            max = Math.max(max, temp);

            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    };
    public static void main(String[] args){
        int[] nums = {1,8,6,2,5,4,8,3,7};
        int area = maxArea(nums);
        System.out.println(area);
    }
}
