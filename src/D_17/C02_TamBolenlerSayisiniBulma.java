package D_17;

import java.util.Scanner;

public class C02_TamBolenlerSayisiniBulma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tam Bolenler Sayisi Bulunacak Sayiyi Giriniz");
        int sayi = scanner.nextInt();

        System.out.println(tamBolenlerSayisi(sayi));
    }

    public static int tamBolenlerSayisi(int sayi) {

        int sayac = 0;

        for (int i = 1; i <= sayi; i++) {

            if (sayi % i == 0) {
                sayac++;
            }
        }

        return sayac;
    }
}
