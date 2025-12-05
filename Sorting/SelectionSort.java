package Sorting;

public class SelectionSort {
    public static int[] selectionSort(int[] nums){
        int n = nums.length;
        for(int i=0;i<n;i++){
            int min_indx = i;
            for(int j=i+1;j<n;j++){
                if(nums[j] < nums[min_indx]) min_indx = j;
            }
            int temp = nums[min_indx];
            nums[min_indx] = nums[i];
            nums[i] = temp;
        }

        return nums;
    }
    
    public static void main(String[] args) {
        int[] nums = new int[] {3,6,4,7,9,2};
        selectionSort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
