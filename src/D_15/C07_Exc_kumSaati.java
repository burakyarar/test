package D_15;

import java.util.Scanner;

public class C07_Exc_kumSaati {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Bir Boyut Giriniz");
        int boyut = scanner.nextInt();

        int plus = 0;

        int kum = 3 * boyut / 4;

        int bosluk = 0;

        // System.out.println(kum);

        for (int i = 1; i <= boyut; i++) { // Ust Kisim

            plus++;

            for (int j = i; j >= 1; j--) { // Ust Sol Bosluk
                System.out.print("  ");
            }
            if (i == 1) {
                for (int j = 1; j <= boyut; j++) { // Ust Tepe Cizgisi Sol
                    System.out.print("0 ");
                }
            } else{
                System.out.print("0 "); // Ust Sol Kenar
            }
            if (i == 1) {
                for (int j = 1; j <= boyut + 1; j++) {
                    System.out.print("0 "); // Ust Tepe Cisgisi Sag
                }
            }

            if (i == 1) { // Ust Tepe Hiclik
                System.out.print("");
            } else {
                for (int j = i; j <= boyut; j++) { // Ust Bosluk Sol
                    System.out.print("  ");
                }

                for (int j = i; j <= boyut; j++) { // Ust Bosluk Sag
                    System.out.print("  ");
                }
            }
            System.out.print("0 "); // Ust Sag Kenar

            for (int j = i; j >= 1; j--) {
                System.out.print("  "); // Ust Sag Bosluk
            }

            System.out.println("");

        } // Ust Kisim Sonu

        plus = 0;

        for (int i = boyut; i >= 1; i--) { // Alt Kisim

            plus++;

            if (i >= kum) {
                bosluk += 2;
            }

            for (int j = i; j >= 1; j--) { // Alt Sol Bosluk
                System.out.print("  ");
            }
            if (i == 1) {
                for (int j = 1; j <= boyut; j++) { // Alt Taban Cizgisi Sol
                    System.out.print("0 ");
                }
            } else{
                System.out.print("0 "); // Alt Sol Kenar
            }
            if (i == 1) {
                for (int j = 1; j <= boyut + 1; j++) { // Alt Taban Cisgisi Sag
                    System.out.print("0 ");
                }
            }
            if (i == 1) { // Alt Taban Hiclik
                System.out.print("");
            } else if (i >= kum) { // Alt Bosluk Orani
                    for (int j = 1; j <= bosluk; j++) {
                        System.out.print("  ");
                    }
            } else {
                for (int k = 1; k <= plus; k++) { // Alt Kum Orani Sol
                    System.out.print("* ");
                }

                for (int k = 1; k <= plus; k++) { // Alt Kum Orani Sag
                    System.out.print("* ");
                }
            }
            System.out.print("0 "); // Alt Sag Kenar

            for (int j = i; j >= 1; j--) { // Alt Sag Bosluk
                System.out.print("  ");
            }
            System.out.println("");
        } // Alt Kisim Sonu


    } // Main Method Sonu

} // Class Sonu
