package D_14;

import java.util.Scanner;

public class C05_FizzBuzz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Pozitif Bir Tamsayi Giriniz");

        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi ; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("fizzBuzz\n");
            } else if (i % 3 == 0) {
                System.out.print("fizz ");
            } else if (i % 5 == 0) {
                System.out.print("buzz ");
            } else {
                System.out.print(i + " ");
            }
        }


    }
}
