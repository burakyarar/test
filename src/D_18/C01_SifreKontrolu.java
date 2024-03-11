package D_18;

import java.util.Scanner;

import static D_17.C07_WhileLoop.sifreKontrolEt;

public class C01_SifreKontrolu {

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

            /*
                Scanner scanner = new Scanner(System.in);
                String sifre = scanner.nextLine();

                Bunlari loop'dan once olusturup
                loop icinde sadece atama yapilabilir
             */

            boolean sonuc = false;
            Scanner scanner;
            String sifre;

            while (!sonuc) {

                scanner = new Scanner(System.in);

                System.out.println("Lutfen Sifrenizi Giriniz");
                sifre = scanner.nextLine();

                sonuc = sifreKontrolEt(sifre);
            }

            System.out.println("Sifre basariyla kaydedildi");
        }

}
