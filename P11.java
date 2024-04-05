// Abstract Class   

abstract class Figure {

    float dim1;
    float dim2;

    Figure(float a, float b) {

        dim1 = a;
        dim2 = b;

    }

    abstract double area();

}

class Rectangle extends Figure {

    Rectangle(float a, float b) {

        super(a, b);

    }

    double area() {

        return (dim1 * dim2);

    }

}

class Triangle extends Figure {

    Triangle(float a, float b) {
        super(a, b);
    }

    double area() {

        return (dim1 * dim2) / 2;

    }

}

public class P11 {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 20);
        Triangle t = new Triangle(15, 20);
        double arr = r.area();
        double arrt = t.area();
        System.out.println("Area Of Rectangle : " + arr);
        System.out.println("Area Of Triangle : " + ar);
    }
}
