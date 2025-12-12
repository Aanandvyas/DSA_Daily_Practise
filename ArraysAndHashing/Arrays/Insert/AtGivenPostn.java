package ArraysAndHashing.Arrays.Insert;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class AtGivenPostn {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size: ");
        int n = sc.nextInt();
        System.out.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            arr.add(val);
        }
        
        System.out.print("enter postn: ");
        int pos = sc.nextInt();
        System.out.print("enter elem: ");
        int elem = sc.nextInt();

        arr.add(pos-1,elem);

        System.out.print("array: ");
        System.out.print(arr);
    }
}
