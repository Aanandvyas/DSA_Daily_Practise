package Sorting;

public class BubbleSort {
    public static int[] bubbleSort(int[] nums){
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

    public static void printArr(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3,6,4,7,9,2};
        bubbleSort(nums);
        printArr(nums);

    }
}
