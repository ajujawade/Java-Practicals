// Multilevel Inheritance

class Person {

    private String name;
    private int age;

    Person(String na, int ag) {
        name = na;
        age = ag;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

class Student extends Person {

    private int rollno;
    private float marks;

    Student(String na, int ag, int rno, float mark) {
        super(na, ag);
        rollno = rno;
        marks = mark;
    }

    void display() {
        super.display();
        System.out.println("RollNo : " + rollno);
        System.out.println("Marks : " + marks);
    }
}

class Teacher extends Student {

    private String subject;
    private double salary;

    Teacher(String na, int ag, int rno, float mark, String sub, double sal) {
        super(na, ag, rno, mark);
        subject = sub;
        salary = sal;
    }

    void display() {
        super.display();
        System.out.println("Subject : " + subject);
        System.out.println("Salary : " + salary);
    }
}

public class P10 {

    public static void main(String[] args) {

        Student tony = new Student("Tony", 20, 23, 90);
        tony.display();

        Teacher ajay = new Teacher("Ajay Jawade", 21, 2014, 90, "Computer", 100000);
        ajay.display();
    }
}
