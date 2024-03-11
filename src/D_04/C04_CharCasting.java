package D_04;

import java.util.Scanner;

public class C04_CharCasting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir Char Giriniz");

        // scanner.nextChar() olmadigindan once scanner.next() ile String olarak alip
        // o String'in ilk karakterini alalim

        char girilenChar1 = (char) scanner.next().charAt(0);
        // char girilenChar2 = (char) scanner.next().charAt(1);
        // char girilenChar3 = (char) scanner.next().charAt(2);

        System.out.println("Girilen Char ve Sonraki Char: " + (char)(girilenChar1) + (char)(girilenChar1 + 1));

        /*

        System.out.println("Char 1: " + girilenChar1);
        System.out.println("Char 2: " + girilenChar2);
        System.out.println("Char 3: " + girilenChar3);

        */
        // System.out.println("Char 1: " + girilenChar1 + 1); a1


    }
}
