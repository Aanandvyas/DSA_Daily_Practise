package ArraysAndHashing.Leetcode;

public class TrapWater {
    public static int maxWater(int[] height){
        int n = height.length;
        int l=0;
        int r=n-1;
        int leftMax = height[l];
        int rightMax = height[r];
        int water = 0;

        while(l<r){
            if(height[l]<height[r]){
                if(height[l]>=leftMax){
                    leftMax = height[l];
                }
                else{
                    water +=leftMax-height[l];
                }
                l++;
            }
            else{
                if(height[r]>=rightMax){
                    rightMax = height[r];
                }
                else{
                    water +=rightMax-height[r];
                }
                r--;
            }
        }
        return water;
    }
    public static void main(String[] args){
        int[] height = {4,2,0,3,2,5};
        int res = maxWater(height);
        System.out.println(res);
    }
}
