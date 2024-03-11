package D_18;

import java.util.Scanner;

public class C02_GirilenSayilariToplama {

    public static void main(String[] args) {

        /*
            Toplamak uzere sayilar al

            Toplam 500'u gecerse "Bu kadar sayi yeter, toplam ... oldu" yazdir

            10'dan fazla sayi girilirse "10'dan fazla sayi giremezsin, girilen sayilar toplami ... oldu" yazdir

         */

        Scanner scanner;
        int sayac = 0;
        int toplam = 0;
        int sayi;

        while (sayac <= 10 && toplam <500) {

            scanner = new Scanner(System.in);
            System.out.println("Lutfen toplamak uzere sayi giriniz");
            sayi = scanner.nextInt();

            toplam += sayi;
            sayac++;
        }

        if (sayac >= 10) {

            System.out.println("10'dan fazla sayi giremezsin, girilen sayilar toplami " + toplam + " oldu");
        }

        if (toplam > 500) {

            System.out.println("Bu kadar sayi yeter, toplam " + toplam + " oldu");
        }
    }
}
