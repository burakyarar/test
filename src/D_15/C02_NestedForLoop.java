package D_15;

import java.util.Scanner;

public class C02_NestedForLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Satir ve sutun sayilari alarak tablo olustur

        System.out.println("Satir Sayisini Giriniz");
        int satir = scanner.nextInt();

        System.out.println("Sutun Sayisi Giriniz");
        int sutun = scanner.nextInt();

        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <= sutun; j++) {
                System.out.print("*  ");
            }

            System.out.println("");
        }

    }
}
