package D_14;

import java.util.Scanner;

public class C02_forLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Baslangic Degeri Icin Pozitif Bir Tam Sayi Giriniz");

        int bas = scanner.nextInt();

        boolean iptal = true;

        if (bas < 0) {
            System.out.println("Baslangic Degeri Pozitif Olmali");
            iptal = false;
        }

        if (iptal) {

            System.out.println("Lutfen Bitis Degeri Icin Pozitif Bir Tam Sayi Giriniz");

            int bit = scanner.nextInt();

            if (bit < bas) {
                System.out.println("Baslangic Bitisten Buyuk Olamaz");
            } else {

                int toplam = 0;

                for (int i = bas; i <= bit; i++) {
                    toplam += i;
                }

                System.out.println("Araliktaki Tam Sayilarin Toplami: " + toplam);
            }
        }






    }
}
