package D_15;

import java.util.Scanner;

public class C04_NestedForLoop {

    public static void main(String[] args) {

        // Kullanicidan satir sayisi olarak rakam al
        // Ucgen seklinde asagiya dogru indir

        Scanner scanner = new Scanner(System.in);

        System.out.println("Satir Sayisi Giriniz");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <= i; j++) {

                /*
                for (int k = 1; k <= j; k++) {
                    System.out.print("  ");
                }

                 */
                System.out.print("*  ");
            }
            System.out.println("");
        }

        for (int i = satir; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }


    }
}
