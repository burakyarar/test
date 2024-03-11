package A_Betul;

import java.util.Scanner;

public class B_04_151123 {

    public static void main(String[] args) {

        /*
            Her seyde %10 indirim
            150 uzerine %15 indirim
            aboneligin varsa %10 indirim daha
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Aldiginiz urunlerin toplam fiyatini giriniz");
        double fiyat = scanner.nextDouble(); // fiyat neyse

        System.out.println("Magazamiza abone misiniz?");
        String abonelik = scanner.next(); // evet veya hayir

        fiyat = fiyat - (fiyat* 10 / 100); // fiyat * 90 / 100
        System.out.println("%10 indirimli fiyat: " + fiyat);

        if (fiyat >= 150) {
            fiyat = fiyat * 85 / 100;
            System.out.println("150 uzeri oldugu icin %15 daha indirimli fiyat: " + fiyat);
        }

        if (abonelik.equalsIgnoreCase("evet")) {
            fiyat = fiyat * 90 / 100;
            System.out.println("Abone oldugunuz icin %10 daha indirimli fiyat: " + fiyat);
        }

        System.out.println("Indirimlerden sonraki fiyat: " + fiyat);

    }
}
