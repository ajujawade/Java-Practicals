// Two Different Classes Implementing the Same Interface

interface first {

    float compute();

    void display(float a);

}

class Student implements first {

    int rno;
    String name;
    int age;
    float marks1, marks2;

    Student(String na, int rn, int ag, float mar1, float mar2) {

        name = na;
        rno = rn;
        age = ag;
        marks1 = mar1;
        marks2 = mar2;

    }

    public float compute() {

        float ave = (marks1 + marks2) / 2;
        return ave;

    }

    public void display(float a)

    {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("RollNo : " + rno);
        System.out.println("Average Marks : " + a);

    }

}

class Rectangle implements first {

    float length;
    float breath;

    Rectangle(float a, float b) {

        length = a;
        breath = b;

    }

    public float compute() {

        return (length * breath);

    }

    public void display(float a) {

        System.out.println("Length : " + length);
        System.out.println("Breath : " + breath);
        System.out.println("Area of Rectangle : " + a);

    }

}

public class P12 {

    public static void main(String[] args) {
        Student ajay = new Student("Ajay", 31, 20, 90, 80);
        Rectangle r = new Rectangle(20, 90);
        float ave = ajay.compute();
        ajay.display(ave);
        System.out.println("-----------------------------------------------------------------------------");
        float ar = r.compute();
        r.display(ar);
    }

}
