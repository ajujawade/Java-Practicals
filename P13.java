// Arithmetic Exception

class number {

    int first, second;

    number() {
        first = 0;
        second = 0;
    }

    number(int a, int b) {
        first = a;
        second = b;
    }

    void except() {

        try {

            int c = first / second;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Zero Division Error");
        }

    }

}

public class P13 {

    public static void main(String[] args) {
        number n = new number();
        number n1 = new number(20, 10);
        System.out.println("Result of First Set Of Number : ");
        n.except();
        System.out.println("-----------------------------");
        System.out.println("Result Of Second Set Of Number : ");
        n1.except();
    }
}
