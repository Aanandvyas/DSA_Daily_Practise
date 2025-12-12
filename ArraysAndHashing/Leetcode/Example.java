package ArraysAndHashing.Leetcode;

class Example {
    static public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2*n];
 
        for(int i=0;i<n;i++){
            arr[i] = nums[i];
            arr[i+n] = nums[i];
        }

        return arr;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int[] nums = arr;
        int n = nums.length;
        
        nums = getConcatenation(nums);

        for (int i = 0; i < 2*n; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
