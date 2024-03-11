package AAA;

import java.util.Scanner;

public class Baski01_Kalp {

    public static void main(String[] args) {

        int bosluk;
        int kalp;

        int genislik = 7;
        int x = 9;
        int y = 0;

        // 5-6-7-8-17-18-19-20 ∞

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yazdirmak istediginiz seyi girin");
        String str = scanner.next();

        if (str.equalsIgnoreCase("kalp")) {
            for (int i = 0; i < 25; i++) {

                if (i >= 5 && i <= 8 || i >= 17 && i <= 20) {
                    System.out.print("♥");
                } else System.out.print("-");
            }
            System.out.println("");

            for (int i = 0; i < 25; i++) {
                if (i >= 3 && i <= 10 || i >= 15 && i <= 22) {
                    System.out.print("♥");
                } else System.out.print("-");
            }
            System.out.println("");

            for (int i = 0; i < 25; i++) {
                System.out.print("♥");
            }
            System.out.println("");

            for (int i = 7; i > 0; i--) {

                for (int j = 0; j < y; j++) {

                    System.out.print("-");
                }

                for (int j = 0; j < i*2 + x ; j++) {

                    System.out.print("♥");
                }

                for (int j = y; j >= 0; j--) {
                    System.out.print("-");
                }

                y += 2;
                x -= 2;
                System.out.println("");
            }
            System.out.println("");

        } else System.out.println("Henuz boyle bir fonksyon yok");

    }
}
