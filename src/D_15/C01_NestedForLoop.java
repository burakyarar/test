package D_15;

public class C01_NestedForLoop {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            System.out.print((i * 1) + "  "); // 1  2  3  4
        }

        System.out.println("");

        for (int i = 1; i <= 4; i++) {
            System.out.print((i * 2) + "  "); // 2  4  6  8
        }

        System.out.println("");

        for (int i = 1; i <= 4; i++) {
            System.out.print((i * 3) + "  "); // 3  6  9  12
        }

        System.out.println("");

        for (int j = 1; j <= 3; j++) {

            System.out.println("");

            for (int i = 1; i <= 4; i++) {
                System.out.print(i * j + "  ");
            }
        }

    }
}
