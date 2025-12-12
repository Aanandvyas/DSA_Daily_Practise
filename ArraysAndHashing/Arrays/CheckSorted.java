package ArraysAndHashing.Arrays;

import java.util.Scanner;
import java.util.ArrayList;


public class CheckSorted {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            arr.add(val);
        }
        boolean sorted = true;

        for(int i=0;i<n-1;i++){
            if(arr.get(i) > arr.get(i+1)){
                sorted = false;
                break;
            }
        }

        if(sorted == false){
            System.out.println("Not Sorted");
        }
        else System.out.println("Sorted");
    }
}
