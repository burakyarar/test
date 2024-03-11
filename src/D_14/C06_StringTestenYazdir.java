package D_14;

import java.util.Scanner;

public class C06_StringTestenYazdir {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Metni Giriniz");
        String str = scanner.nextLine();

        // Java Candir
        // ridnaC avaJ

        for (int i = (str.length() - 1); i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println("");

        String tersMetin = "";

        for (int i = (str.length() - 1); i >= 0; i--) {
            tersMetin += str.charAt(i);
        }

        System.out.println("Terse Cevrilen Metin: " + tersMetin);

    }
}
