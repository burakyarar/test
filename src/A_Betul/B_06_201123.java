package A_Betul;

import java.util.Scanner;

public class B_06_201123 {

    public static void main(String[] args) {

        /*
        This program prints a
        quote from the Gettysburg Address.
        "Four score and seven years ago,
        our 'fore fathers' brought forth on
        this continent a new nation."
         */

        /*
        System.out.println("This program print a " +
                "\nquote from the Gettysburg Adress " +
                "\n " +
                "\n\"Four score and seven years ago, " +
                "\nour 'fore fathers' brought forth on " +
                "\nthis continent a new nation.\"");

        B_06_201123.SayiTekMiCiftMi(0);

        System.out.println();

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Karesini bulmak istediginiz bir sayi giriniz");
        int sayi = scanner.nextInt();

        int yeniSayi = KaresiniBulma(sayi);

        System.out.println("Yeni sayi: " + yeniSayi);
    }

    public static void SayiTekMiCiftMi (int sayi) {

        Scanner in = new Scanner(System.in);

        System.out.println("Bir Sayi Giriniz");
        sayi = in.nextInt();

        if ((sayi % 2) == 0) {
            System.out.println("Sayi bir cift sayidir");
        } else System.out.println("Sayi bir tek sayidir");
    }

    public static int KaresiniBulma (int sayi) {

        sayi = sayi * sayi;

        return sayi;
    }
}
