// Using Recursion Generate N Terms Of Fibonaci Sequence

class fib {

    void gen(int n, int n1, int n2) {

        if (n < 3)
            return;
        else {

            int n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
            gen(n - 1, n1, n2);

        }

    }
}

/**
 * P6
 */
public class P6 {

    public static void main(String[] args) {

        fib f = new fib();
        int n1 = 1;
        int n2 = 1;
        System.out.println("Fibonacci Series : ");
        System.out.println(n1 + "\n" + n2);
        f.gen(8, n1, n2);

    }

}