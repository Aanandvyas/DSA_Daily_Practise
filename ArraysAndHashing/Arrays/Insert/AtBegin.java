package ArraysAndHashing.Arrays.Insert;

import java.util.ArrayList;
import java.util.Arrays;

public class AtBegin {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,4,8,6,3,1));
        arr.add(0, 9);
        System.out.print("Array: ");
        System.out.print(arr);

    }
}
