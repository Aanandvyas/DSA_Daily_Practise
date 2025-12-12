package ArraysAndHashing.Arrays.Insert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AtEnd {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size: ");
        int n = sc.nextInt();
        System.out.print("Array: ");
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            arr.add(val);
        }
        arr.add(n,8);
        System.out.print("array: ");
        System.out.print(arr);
    }
}
