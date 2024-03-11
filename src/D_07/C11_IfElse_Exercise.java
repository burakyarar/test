package D_07;

import java.util.Scanner;

public class C11_IfElse_Exercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Aldiginiz Urun Adedini Giriniz");

        int adet = scanner.nextInt();

        System.out.println("Lutfen Urunlerin Liste Fiyatinin Toplamini Giriniz");

        double fiyat = scanner.nextDouble();

        System.out.println("Musteri Kartiniz Var mi?");

        char ch1 = scanner.next().charAt(0);

        int harf = ch1;

        boolean kart;

        double yuzde20 = 0.8;
        double yuzde15 = 0.85;
        double yuzde10 = 0.9;

        if (harf == 86 || harf == 118) {
            kart = true;
        } else kart = false;

        // System.out.println(kart);

        if (kart == true) {
            if (adet > 10) {
                System.out.println("Toplam Odenecek Miktar: " + (fiyat * yuzde20));
            } else {
                System.out.println("Toplam Odenecek Miktar: " + (fiyat * yuzde15));
            }
        } else {
            if (adet > 10) {
                System.out.println("Toplam Odenecek Miktar: " + (fiyat * yuzde15));
            } else {
                System.out.println("Toplam Odenecek Miktar: " + (fiyat * yuzde10));
            }
        }



    }
}
