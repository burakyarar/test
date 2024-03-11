package D_13;

import java.util.Scanner;

public class C05_forLoop {

    public static void main(String[] args) {

        int input = 20;

        for (int i = input; i < input + 10; i++) {
            System.out.print(i + " "); // 20 21 22 23 24 25 26 27 28 29
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nBir Sayi Giriniz");

        int girdi = scanner.nextInt();

        for (int i = girdi; i <= 100 ; i += 5) {
            System.out.print(i + " ");
        }

        System.out.println("");

        for (int i = girdi; i >= 1 ; i --) {

            if (i % 7 == 0){
                System.out.print(i + " ");
            }

        }



    }
}
