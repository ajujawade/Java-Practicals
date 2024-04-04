// To Demonstrate Inheritance

class Person {

    private String name;
    private int age;

    Person(String na, int ag) {
        name = na;
        age = ag;
    }

    void dispdet() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

    }

}

class Student extends Person {

    private int rno;
    private float marks;

    Student(String na, int ag, int no, float mark) {

        super(na, ag); // Call the Constructor of Super Class

        rno = no;
        marks = mark;

    }

    void dispdet() {

        super.dispdet();
        System.out.println("RollNo : " + rno);
        System.out.println("Marks : " + marks);

    }

}

public class P9 {

    public static void main(String[] args) {

        Student ajay = new Student("Ajay", 20, 440945, 80);
        System.out.println("Student Details : ");
        System.out.println("********************************\n");
        ajay.dispdet();
    }

}
