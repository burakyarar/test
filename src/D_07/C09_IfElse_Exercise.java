package D_07;

import java.util.Scanner;

public class C09_IfElse_Exercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi Kadin veya Erkek olarak giriniz");

        char ch1 = scanner.next().charAt(0);

        int karakter = ch1;

        System.out.println("Lutfen yasinizi giriniz");

        int yas = scanner.nextInt();

        boolean gecersiz = yas < 0 || yas >100;

        if (gecersiz == true) {
            System.out.println("Gecersiz yas girdiniz");
            } else
                    if (karakter == 75 || karakter == 107) {
                        if (yas >=60) {
                         System.out.println("Emekli Olabilirsiniz");
                        } else {
                        System.out.println("Emekli olmak icin " + (60 - yas) + " yiliniz var");
            }
            } else {
                if (yas >= 65) {
                System.out.println("Emekli Olabilirsiniz");
                 } else {
                System.out.println("Emekli olmak icin " + (65 - yas) + " yiliniz var");
            }
        }
    }
}
