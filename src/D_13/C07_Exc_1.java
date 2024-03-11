package D_13;

import java.lang.invoke.SwitchPoint;
import java.util.Locale;
import java.util.Scanner;

public class C07_Exc_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir Metin Giriniz");

        String metin = scanner.nextLine().toLowerCase();

        /*
        switch (metin) {

            case "ev":
                System.out.println("Home Sweet Home");
                break;

            case "is":
                System.out.println("Calismak Guzeldir");
                break;

        }
        */

        if (!metin.contains("ev") & !metin.contains("is")) {
            System.out.println("Cok Calisman Lazim");
        } else if (metin.contains("is") & metin.contains("ev")) {
            System.out.println("Hem Ev Lazim Hem Is");
        } else if (metin.contains("ev")) {
            System.out.println("Home Sweet Home");
        } else if (metin.contains("is")) {
            System.out.println("Calismak Guzeldir");
        }
    }
}
