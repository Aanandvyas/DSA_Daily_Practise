package ArraysAndHashing.Arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class minIncrement {
    static int[] findmax(ArrayList<Integer> arr){
        int max = arr.get(0);
        int min = arr.get(0);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i) > max){
                max = arr.get(i);
            }
            if (arr.get(i)< min) {
                min = arr.get(i);
            }
        }
        return new int[]{max,min};
    }

    static int toatlInc(ArrayList<Integer> arr,int max,int min){
        for (int i = 0; i < arr.size(); i++) {
            if((max-arr.get(i))%3 != 0) return -1;
        }

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            
            sum += (max-arr.get(i))/3;
          
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            arr.add(val);
        }
        sc.close();
        int[] temp = findmax(arr);
        int max = temp[0];
        
        int min = temp[1];
       
        System.out.print(toatlInc(arr, max, min));

    }

}
