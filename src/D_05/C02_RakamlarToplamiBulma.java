package D_05;

import java.util.Scanner;

public class C02_RakamlarToplamiBulma {

    public static void main(String[] args) {

        // Kullanicidan 3 basamakli bir sayi alip sayinin rakamlarini toplayip yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("3 basamakli bir sayi giriniz.");

        int sayi1 = scanner.nextInt();

        int birler = sayi1 % 10;
        int onlar = (sayi1 / 10) % 10;
        int yuzler = (sayi1 / 100) % 10;

        // System.out.println((sayi1 % 10) + ((sayi1 / 10) % 10) + ((sayi1 / 100) % 10));
        // System.out.println(birler + onlar + yuzler);

        int toplam = birler + onlar + yuzler;

        System.out.println("Rakamlarin Toplami: " + toplam);


    }
}
