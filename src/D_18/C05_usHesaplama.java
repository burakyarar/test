package D_18;

import D_17.C02_TamBolenlerSayisiniBulma;

import java.util.Scanner;

public class C05_usHesaplama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ussu hesaplanacak pozitif sayi gir");
        double sayi = scanner.nextDouble();

        System.out.println("Hesaplanacak us icin pozitif sayi gir");
        int us = scanner.nextInt();

        usHesapla(sayi,us);

        System.out.println(C02_TamBolenlerSayisiniBulma.tamBolenlerSayisi(123));

    }

    public static void usHesapla(double sayi, int us) {

        double sonuc = 1;

        while (us > 0) {

            sonuc *= sayi;
            us--;

        }

        System.out.println("Sonuc: " + sonuc);

    }

}
