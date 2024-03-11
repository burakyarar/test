package D_03;

import java.util.Scanner;

public class D03_Exercise_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayi 1 Gir");

        int sayi1 = scanner.nextInt();

        System.out.println("Sayi 2 Gir");

        int sayi2 = scanner.nextInt();

        /*

        sayi1 = sayi1 - sayi2;
        sayi2 = sayi2 - sayi1;
        sayi1 = sayi1 + sayi2;
        sayi2 = sayi2 - sayi1;

        Works if sayi2 = 2 * sayi1

        */

        /*

        sayi1 = sayi1 - sayi2;
        sayi2 = sayi2 - sayi1;
        sayi1 = sayi1 + sayi2;
        sayi2 = 2 * sayi1 - sayi2;

         */

        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;

        // Works with all integers

        System.out.println( "Sayi 1: " + sayi1);
        System.out.println( "Sayi 2: " + sayi2);


    }
}
