package D_09;

import java.util.Scanner;

public class C02_IndirimHesaplama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Aldiginiz Urun Adedini Giriniz");

        int adet = scanner.nextInt();

        System.out.println("Lutfen Urunlerin Liste Fiyatini Giriniz");

        double fiyat = scanner.nextDouble();

        System.out.println("Musteri Kartiniz Var mi?");

        char kart = scanner.next().toUpperCase().charAt(0);

        int harf = kart;

        if (kart == 'V') { // karti olanlar

            if (adet > 10) {
                System.out.println("%20 indirimli toplam fiyat: " + (adet * fiyat * 0.8));
            } else {
                System.out.println("%15 indirimli toplam fiyat: " + (adet * fiyat * 0.85));
            }
        } else if (kart == 'Y') { // karti olmayanlar

            if (adet > 10) {
                System.out.println("%15 indirimli toplam fiyat: " + (adet * fiyat * 0.85));
            } else {
                System.out.println("%10 indirimli toplam fiyat: " + (adet * fiyat * 0.9));
            }
        } else { // hatali kart biligisi
            System.out.println("Hatali Kart Bilgisi");
        }
    }
}
