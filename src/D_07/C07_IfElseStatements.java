package D_07;

import java.util.Scanner;

public class C07_IfElseStatements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yasinizi Giriniz");

        int yas = scanner.nextInt();

        if (yas >= 65) {
            System.out.println("Emekli Olabilirsiniz");
        } else {
            System.out.println("Emekli Olmak icin " + (65 - yas) + " yiliniz var");
        }



    }
}
