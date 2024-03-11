package A_Betul;

import java.util.Scanner;

public class B_03_131123 {

    public static void main(String[] args) {

        // If ve Scanner kullanarak
        // girilen sayinin tek mi cift mi
        // oldugunu gosteren bir kod yaziniz

        Scanner in = new Scanner(System.in);

        System.out.println("Bir Sayi Giriniz");
        int sayi = in.nextInt();

        if ((sayi % 2) == 0) {
            System.out.println("Sayi bir cift sayidir");
        } else System.out.println("Sayi bir tek sayidir");

    }
}
