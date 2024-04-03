// Addition of Complex Numbers

class Complex {

    float real;
    float img;

    Complex() {

        real = 0;
        img = 0;

    }

    Complex(int a, int b) {

        real = a;
        img = b;

    }

    Complex(Complex co) {

        real = co.real;
        img = co.img;

    }

    Complex add(Complex co) {

        Complex temp = new Complex();
        temp.real = real + co.real;
        temp.img = img + co.img;
        return temp;
    }

}

public class P7 {

    public static void main(String[] args) {

        Complex c1 = new Complex(10, 20);
        Complex c2 = new Complex(0, 50);
        Complex c3 = c1.add(c2);
        System.out.println("Sum of Complex Numbers : " + c3.real + " + i " + c3.img);

    }

}
