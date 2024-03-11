package AAA;

import java.util.Scanner;

public class Exc_RG05 {

    public static void main(String[] args) {

        /*5-----
    Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yarim Elmas Uzunlugu: ");
        int yarimUzunluk = scanner.nextInt();

        // elmas1(yarimUzunluk);

        /*

        int count = 1;
        for (int i = 1; i <= yarimUzunluk * 2 - 1; i++) {//hem ust ucgen hem alt ucgen var o yuzden "uznluk*2-1" bu sekilde belirleedik.7 ustte 6 altta =>7+6=13
            for (int j = count; j <= yarimUzunluk; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= count * 2 - 1; k++) {
                System.out.print("*");
            }
            if (i < yarimUzunluk) {// ust ucgen
                count++;
            } else count--;
            System.out.println();

         */

        int sayac = 0;
        int i = 0;
        int j = 1;

        while (sayac < yarimUzunluk) {

            while (i < yarimUzunluk) {
                System.out.print("-");
                i++;
            }

            sayac++;
            i = sayac;

            while (j <= 2*i-1) {
                System.out.print("*");
                j++;
            }

            j = 1;

            System.out.println();

        }

    }

    public static void elmas1(int yarimUzunluk) {

        for (int i = 1; i <= yarimUzunluk; i++) {

            for (int j = yarimUzunluk; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        for (int i = yarimUzunluk - 1; i >= 1; i--) {

            for (int j = i; j <= yarimUzunluk; j++) {
                System.out.print(" ");
            }

            for (int j = 2*i-1; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println("");

        }


    }

    public static void elmas2(int yarimUzunluk) {

    }


}
