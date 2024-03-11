package D_18;

import java.util.Scanner;

public class C06_DoWhileLoop {

    public static void main(String[] args) {

        // toplanmak uzere pozitif sayilar iste
        // islemi bitirmek icin 0'a basmali
        // 0'a bastiginda kac sayi girdigini ve toplamlarini yazdir

        /*

        Scanner scanner;
        int sayac = 0;
        int toplam = 0;
        int girilenSayi = 99999;

        while (girilenSayi != 0) {

            scanner = new Scanner(System.in);
            System.out.println("Toplanmak uzere bir sayi gir");
            girilenSayi = scanner.nextInt();

            if (girilenSayi != 0) {
                toplam += girilenSayi;
                sayac++;
            }

        }

        System.out.println("Girilen " + sayac + " adet sayinin toplami: " + toplam);

         */

        Scanner scanner;
        int sayac = 0;
        int toplam = 0;
        int girilenSayi;

        do {

            scanner = new Scanner(System.in);
            System.out.println("Toplanmak uzere bir sayi gir");
            girilenSayi = scanner.nextInt();

            if (girilenSayi != 0) {
                toplam += girilenSayi;
                sayac++;
            }
        } while (girilenSayi != 0);

        System.out.println("Girilen " + sayac + " sayinin toplami: " + toplam);
    }
}
