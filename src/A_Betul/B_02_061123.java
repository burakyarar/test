package A_Betul;

import java.util.Scanner;

public class B_02_061123 {

    public static void main(String[] args) {

        /*
        int sayi1 = 20;
        int sayi2 = 2;

        if (sayi1 == sayi2) {

            System.out.println("The numbers are equal");

        } else if (sayi1 > sayi2) {

            System.out.println(sayi1 + " is greater than " + sayi2);

        } else System.out.println(sayi2 + " is greater than " + sayi1);

        if (sayi1 % sayi2 == 0) System.out.println(sayi2 + " tam bolenidir " + sayi1);
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("sayi1 icin bir deger giriniz");
        int sayi1 = scanner.nextInt();

        System.out.println("sayi2 icin bir deger giriniz");
        int sayi2 = scanner.nextByte();

        if (sayi1 == sayi2) {

            System.out.println("The numbers are equal");

        } else if (sayi1 > sayi2) {

            System.out.println(sayi1 + " is greater than " + sayi2);

        } else System.out.println(sayi2 + " is greater than " + sayi1);

    }
}
