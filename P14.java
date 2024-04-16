import java.io.*;

public class P14 {
    public static void main(String[] args) {
        try {
            FileReader i = new FileReader("sj1.java");
            FileWriter o = new FileWriter("ragh.txt");
            BufferedReader br = new BufferedReader(i);
            BufferedWriter bo = new BufferedWriter(o);
            String line;
            while ((line = br.readLine()) != null) {
                bo.write(line);
                bo.write("\n");
            }
            br.close();
            bo.close();
            i.close();
            o.close();
        } catch (Exception e) {

            System.out.println("File Does Not Exist");

        }

    }

}
