package D_11;

import java.util.Scanner;

public class C02_length {

    public static void main(String[] args) {

        String isim = "Ramazan Uzunkavalaraltindayataruyumazoglu";

        System.out.println("ismin uzunlugu: " + isim.length()); // ismin uzunlugu: 41

        System.out.println("son harf: " + isim.charAt(isim.length() - 1)); // son harf: u

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String ad = scanner.next();

        int uzunluk = ad.length();

        if (uzunluk % 2 != 0) {
            System.out.println("Ortanca Harf: " + ad.charAt((uzunluk - 1) / 2));
        } else {
            System.out.println("Ortadaki iki harf: " + ad.charAt(uzunluk / 2 - 1) + ad.charAt(uzunluk / 2));
        }

    }
}
