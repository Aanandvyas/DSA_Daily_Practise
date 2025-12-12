package ArraysAndHashing.Arrays;

import java.util.Scanner;
import java.util.ArrayList;


public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            arr.add(val);
        }
        sc.close();
        int target =50;
        
        ArrayList<ArrayList<Integer>> pair = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr.get(i)+arr.get(j) == target){
                    ArrayList<Integer> curpair = new ArrayList<>();
                    curpair.add(i);
                    curpair.add(j);
                    pair.add(curpair);

                }
            }
        }
        System.out.println(pair);
    }
}
