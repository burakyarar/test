package D_08;

import java.util.Locale;
import java.util.Scanner;

public class C03_Exercise_CoffeeShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Asagidaki Seceneklerden Birini Yaziniz: " +
                "\n - kahve" +
                "\n - cay" +
                "\n - su");

        String icecek = scanner.nextLine();

        boolean seker = false;
        boolean sut = false;

        seker = icecek.equals("kahve") || icecek.equals("cay");
        sut = icecek.equals("kahve");

        boolean iptal = true;

        boolean kahveler = icecek.equals("kahve");
        boolean blck = false;
        boolean ltte = false;
        boolean amrk = false;
        boolean esp = false;

        boolean eks = false;

        boolean caylar = icecek.equals("cay");
        boolean syh = false;
        boolean ysl = false;
        boolean ppt = false;
        boolean ihl = false;

        boolean sular = icecek.equals("su");

        if (kahveler) {
            System.out.println("Lutfen Asagidaki Kahvelerden Birini Yaziniz:" +
                    "\n - siyah kahve" +
                    "\n - latte" +
                    "\n - amerikano" +
                    "\n - espresso");
            String kahve = scanner.next();
            blck = kahve.equals("siyah kahve");
            ltte = kahve.equals("latte");
            amrk = kahve.equals("amerikano");
            esp = kahve.equals("espresso");
            eks = kahve.equals("ekspresso");

            if (blck == false && ltte == false && amrk == false && esp == false) {
                System.out.println("Uzgunum, elimizde o kahveden yok maalesef.");
                iptal = false;
                if (eks){
                    System.out.println("Lutfen Gidin Burdan!");
                    iptal = false;
                }
            }
        }

        if (caylar) {
            System.out.println("Lutfen Asagidaki Caylardan Birini Yaziniz: " +
                    "\n  - siyah cay" +
                    "\n  - yesil cay" +
                    "\n  - papatya" +
                    "\n  - ihlamur");
            String cay = scanner.next();
            syh = cay.equals("siyah cay");
            ysl = cay.equals("yesil cay");
            ppt = cay.equals("papatya");
            ihl = cay.equals("ihlamur");

            if (syh == false && ysl == false && ppt == false && ihl == false) {
                System.out.println("Uzgunum, elimizde o caydan yok maalesef.");
                iptal =false;
            }
        }

        double toplam = 0;

        if (iptal) {
            if (seker) {
                System.out.println("Seker ister misiniz?");
                String skrr = scanner.next().toLowerCase();
                boolean skr = skrr.equals("evet");
                if (skr) toplam += 0.25;
            }

            if (sut) {
                System.out.println("Sut ister misiniz?");
                String stt = scanner.next().toLowerCase();
                boolean st = stt.equals("evet");
                if (st) toplam += 0.25;
            }

            if (blck) toplam += 1.5;
            if (ltte) toplam += 2;
            if (amrk) toplam += 3.5;
            if (esp) toplam += 1.75;

            if (syh) toplam += 1.25;
            if (ysl) toplam += 1.5;
            if (ppt) toplam += 2;
            if (ihl) toplam += 2;

            if (sular) toplam += 0.5;

            System.out.println("Toplam Tutariniz: " + toplam);
            System.out.println("Lutfen Kac Paraniz Oldugunu Giriniz.");
            double para = scanner.nextDouble();

            if (para < toplam) {
                System.out.println("Uzgunum, paraniz yetmiyor.");
            } else {
                System.out.println("Para Ustunuz: " + (para - toplam));
            }
        }
    }
}
