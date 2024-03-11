package D_07;

import java.util.Scanner;

public class C08_IfElseStatements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir Karakter Giriniz");

        char ch1 = scanner.next().charAt(0);

        /*
            if (ch1 >= 'A' && ch1 <= 'Z') {
                System.out.println("Girilen karakter buyuk harf");
            } else {
                System.out.println("Girilen karakter kucuk harf");
            }
         */


        if (Character.isUpperCase(ch1)) {
            System.out.println("Karakter: " + ch1);
        } else {
            System.out.println("Karakter: " + Character.toUpperCase(ch1));
        }



    }
}
