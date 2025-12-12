package ArraysAndHashing.Arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class ShiftZeroes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            arr.add(val);
        }
        sc.close();

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr.get(i) != 0){
                nums.add(arr.get(i));
            }
        }
        int m = nums.size();
        while(m != n){
            nums.add(m,0);
            m++;
        }

        System.out.print(nums);

    }
}
