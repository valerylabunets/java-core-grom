package lesson8HW.students;

public class Demo {



    public static Object createHighestParent() {

        Object object = new Object();
        return object;
    }

    public static SpecialStudent createLowestChild() {


        SpecialStudent specialStudent = new SpecialStudent();
        //SpecialStudent specialStudent = new SpecialStudent("100", 3, 123456789, 987654321, "colleg@gmail.com");
        return specialStudent;
    }

    public static void main(String[] args) {
        System.out.println(createHighestParent().toString());
        System.out.println(createLowestChild().toString());

    }
}
