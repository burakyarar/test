package D_09;

import java.util.Scanner;

public class C03_Ternary {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tam sayi al
        // Sayinin tek mi cift mi oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pozitif bir tam sayi giriniz");

        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Sayi bir cift sayi");
        } else {
            System.out.println("Sayi bir tek sayi");
        }

        /*
            if else ile yapabilecegimiz basit islemleri daha kisa olarak
            yazabilmek icin Ternary kullanilir
         */

        System.out.println(sayi % 2 == 0 ? "Cift Sayi" : "Tek Sayi");

        System.out.println(sayi % 3 == 0 ? "3'e tam bolunuyor" : "3'e tam bolunmuyor");

        String sonuc = sayi % 5 == 0 ? "5'e tam bolunuyor" : "5'e tam bolunmuyor";

        System.out.println(sonuc);

    }
}
