package SlidingWindow.Revision;

public class KClosestElement {
    public static void main(String[] args){
        int[] arr = {0,1,2,3,4,5};
        int k=4;
        int x=-1;
        int[] nums = new int[k];

        int n = arr.length;
        int l=0;
        int r=n-1;

        while(r-l+1>k ){
            if(Math.abs(arr[l]-x)>Math.abs(arr[r]-x)){
                l++;
            }
            else{
                r--;
            }
        }
        int i=0;
        while(l<=r){
            nums[i++] = arr[l++];

        }

        for (int s : nums) {
            System.out.print(s +" ");
        }
    }
}
