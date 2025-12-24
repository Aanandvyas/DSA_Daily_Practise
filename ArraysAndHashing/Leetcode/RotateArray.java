package ArraysAndHashing.Leetcode;

public class RotateArray {
    public static int[] reverse(int[] nums,int l,int r){
        while(l<r){
            int temp = nums[r];
            nums[r] = nums[l];
            nums[l] = temp;
            l++;
            r--;
        }
        return nums;
    }

    public static int[] rotateArray(int[] nums,int k){
        int n = nums.length;
        k = k%n;
        int l=0;
        int r = n-1;
        reverse(nums, l, r);
        l=0;
        r=k-1;
        reverse(nums, l, r);
        l=k;
        r=n-1;
        reverse(nums, l, r);
        return nums;
    } 
    public static void main(String[] args){
        int[] nums ={1,2,3,4,5,6,7};
        int k =3;
        nums = rotateArray(nums, k);
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}
