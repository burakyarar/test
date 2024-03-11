package D_14;

import java.util.Scanner;

public class C04_RakamlarToplami {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Rakamlari Toplanacak Sayiyi Giriniz");
        
        int sayi = scanner.nextInt();

        int girilen = sayi;
        int birler = 0;
        int rakTop = 0;

        int basamakSay = (girilen + "").length();

        for (int i = 1; i <= basamakSay ; i++) {

            birler = girilen % 10;
            rakTop += birler;
            girilen /= 10;
        }

        System.out.println("Girilen Sayi: " + sayi + "\nRakamlar Toplami: " + rakTop);

    }
}
