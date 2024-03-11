package D_09;

import java.util.Scanner;

public class C01_EmeklilikC2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi Kadin veya Erkek olarak giriniz");

        char ch1 = scanner.next().toUpperCase().charAt(0);

        int karakter = ch1;

        System.out.println("Lutfen yasinizi giriniz");

        int yas = scanner.nextInt();

        if (yas < 10 || yas > 80) {
            System.out.println("Gecersiz Yas");
        } else if (yas < 60) {
            if (ch1 == 'K') {
                System.out.println("Emekli olabilmek icin " + (60 - yas) + " yiliniz var.");
            } else if (ch1 == 'E') {
                System.out.println("Emekli olabilmek icin " + (65 - yas) + " yiliniz var.");
            } else {
                System.out.println("Cinsiyet Hatali");
            }

        } else if (yas < 65) {

            if (ch1 == 'K') {
                System.out.println("Emekli Olabilirsiniz");
            } else if (ch1 == 'E') {
                System.out.println("Emekli olabilmek icin " + (65 - yas) + " yiliniz var.");
            } else {
                System.out.println("Cinsiyet Hatali");
            }

        } else {
            if (ch1 == 'K' || ch1 == 'E') {
                System.out.println("Emekli Olabilirsiniz");
            }
        }

    }
}
