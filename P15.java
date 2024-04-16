// Creating Threads Using Thread Class
class threadCreate extends Thread {

    threadCreate() {

        start();

    }

    public void run() {

        System.out.println("to the World of Thread");

    }

}

public class P15 {

    public static void main(String[] args) throws Exception {
        new threadCreate();
        System.out.println("Welcome");
    }

}
