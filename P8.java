class box {

    int width;
    int height;
    int length;

    box() {

        width = 1;
        height = 1;
        length = 1;

    }

    box(int a, int b, int c) {

        width = a;
        height = b;
        length = c;

    }

    box(box bo) {

        width = bo.width;
        height = bo.height;
        length = bo.length;

    }

    void volume() {

        System.out.println("\n\n" + width * height * length);

    }
}

public class P8 {

    public static void main(String[] args) {

        box b[] = new box[5];
        System.out.println("Volume of The Boxes : ");
        for (int i = 0; i < b.length; i++) {

            b[i] = new box(i, i + 2, i + 3);
            b[i].volume();

        }

    }

}
