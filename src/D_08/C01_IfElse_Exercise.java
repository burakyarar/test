package D_08;

import java.util.Scanner;

public class C01_IfElse_Exercise {

    public static void main(String[] args) {

        /*
            Goz numarani giriyorsun, cihazadaki uygulamalari ona gore boyutlandiriyor
         */



        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir Sayi Giriniz");

        double sayi = scanner.nextDouble();

        if (sayi >= 0) {
            System.out.println("Sayi Pozitif");
        } else {
            System.out.println("Sayi Negatif");
        }

        if (sayi % 10 == 0) {
            System.out.println("Sayi 10'un Kati");
        } else {
            System.out.println("Sayi 10'un Kati Degil");
        }

        if (sayi % 2 == 0) {
            System.out.println("Sayi 2'nin Kati");
        } else {
            System.out.println("Sayi 2'nin Kati Degil");
        }

        if (sayi % 3 == 0) {
            System.out.println("Sayi 3'un Kati");
        } else {
            System.out.println("Sayi 3'un Kati Degil");
        }

        if (sayi % 5 == 0) {
            System.out.println("Sayi 5'in Kati");
        } else {
            System.out.println("Sayi 5'in Kati Degil");
        }
    }
}
