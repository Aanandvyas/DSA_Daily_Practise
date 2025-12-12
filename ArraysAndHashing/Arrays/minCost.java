package ArraysAndHashing.Arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class minCost {
    static int miniCst(ArrayList<Integer>arr,int n){
        int i =0;
        int j = n-1;
        int cost = 0;
        while(i!=j){
            if(arr.get(i)>arr.get(j)){
                
                cost +=arr.get(j);
                i++;
            }
            else{
                
                cost +=arr.get(i);
                j--;
            }
        }
        return cost;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            arr.add(val);
        }
        sc.close();
        System.out.println(miniCst(arr, n));
    }
}
