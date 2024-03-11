package D_18;

import java.util.Scanner;

public class C04_RakamlarToplamiBulma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Sayi Giriniz");

        int girilenSayi = scanner.nextInt();

        int sayi = girilenSayi;
        int birler = 0;
        int rakamlarToplami = 0;

        while (sayi > 0) {

            birler = sayi % 10;
            rakamlarToplami += birler;
            sayi /= 10;

        }

        System.out.println("Girilen " + girilenSayi + " sayisinin rakamlar toplami: " + rakamlarToplami);
    }

}
