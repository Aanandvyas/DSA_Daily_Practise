import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Anand");
        arr.add("vedanshi");
        arr.add("skasham");
        System.out.println("Size: " +arr.size());

        arr.remove("Anand");
        arr.remove(arr.get(1));
        arr.add(0, "Dugu");
        System.out.println(arr.get(0));
        arr.set(0, "Tinku");
        System.out.println(arr.get(0));        
        System.out.println("Size: "+arr.size());

        for (int i = 0; i < arr.size(); i++) {
            System.out.println("rno "+i+" : " +arr.get(i));
        }
        String[] names = arr.toArray(new String[0]);
        System.out.println(arr);

        for (int i = 0; i < names.length; i++) {
            System.out.println("name : "+names[i]);
        }
    }
}
