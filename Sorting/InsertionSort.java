package Sorting;

public class InsertionSort {
    static int[] insertSort(int[] nums){
        int n = nums.length;
        for(int i=1;i<n;i++){
            int j = i-1;
            int key = nums[i];

            while(j>=0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        return nums;
    }

    static void printArr(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[] {3,4,7,6,9,2};
        insertSort(nums);
        printArr(nums);
    }
}
