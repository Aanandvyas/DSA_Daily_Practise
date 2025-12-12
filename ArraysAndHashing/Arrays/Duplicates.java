package ArraysAndHashing.Arrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Duplicates {
    
    static void removeDup(ArrayList<Integer>arr){
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=1;i<arr.size();i++){
            if(arr.get(i) != arr.get(i-1)){
                nums.add(arr.get(i));
            }
        }
        System.out.print(nums+" ");
    }

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            arr.add(val);
        }
        sc.close();
        Collections.sort(arr);
        removeDup(arr);
    }
}
