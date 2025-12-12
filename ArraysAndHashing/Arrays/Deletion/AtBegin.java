package ArraysAndHashing.Arrays.Deletion;
import java.util.ArrayList;
import java.util.Arrays;


public class AtBegin {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,6,4,8,5));
        System.out.print(arr.indexOf(5));
        arr.remove(3-1);
        System.out.println();
        System.out.print(arr);
        
    }
}
