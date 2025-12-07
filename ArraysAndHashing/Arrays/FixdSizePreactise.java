class Student{
    public int roll;
    public String name;

    public Student(int roll,String name){
        this.roll = roll;
        this.name = name;
    }
}

public class FixdSizePreactise {
    public static void main(String[] args) {
        Student arr[];
        arr = new Student[5];

        arr[0] = new Student(1,"anand");
        arr[1] = new Student(2, "vedanshi");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println("student : " + arr[i].name);
            }
        }

    }
}
