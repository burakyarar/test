package D_17;

import java.util.Scanner;

public class C07_WhileLoop {

    public static void main(String[] args) {

        // main method'da bir sifre al
        // sartlari kontrol etmek icin method olustur
        // true/false olarak donustur
        // Ilk harf kucuk harf olmali
        // son karakter rakam olmali
        // sifre bosluk icermemeli
        // uzunlugu en az 10 karakter olmali
        // tum sartlar karsilasincaya kadar tekrar iste
        // sartlar saglaninca "Sifre basariyla kaydedildi" yazdir



        boolean sonuc = false;

        while (sonuc == false) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Lutfen Sifrenizi Giriniz");
            String sifre = scanner.nextLine();

            sonuc = sifreKontrolEt(sifre);
        }

        System.out.println("Sifre basariyla kaydedildi");
    }

    public static boolean sifreKontrolEt(String sifre) {

        int sayac = 0; // hatalari saysin

        char ilkHarf = sifre.charAt(0);
        if (!(ilkHarf >= 'a' && ilkHarf <= 'z')) {
            System.out.println("Ilk karakter kucuk harf olmali");

            sayac++;
        }

        char sonKarakter = sifre.charAt(sifre.length() - 1);
        if (!(sonKarakter >= '0' && sonKarakter <= '9')) {
            System.out.println("Son karakter rakam olmali");

            sayac++;
        }

        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk icermemeli");

            sayac++;
        }

        if (sifre.length()<10) {
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");

            sayac++;
        }

        if (sayac == 0) {
            return true;
        } else return false;

    }
}
