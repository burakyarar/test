package A_Betul;

public class B_09_130124 {

    public static void main(String[] args) {

        /*
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

                for (int k = 1; k <= j; k++) {
                    System.out.print("-");
                }
            }

            System.out.println();
        }
         */

        // System.out.println(stringDondur(5,10));

        sakinDondurme(5, 10);

    }

    public static String stringDondur(int a, int b) {

        int c = 0;

        c = (a * a) + (b * b);

        return ("Bitti " + c);

    }

    public static void sakinDondurme(int a, int b) {

        System.out.println(stringDondur(a,b));

    }

}
