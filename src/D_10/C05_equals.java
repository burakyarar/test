package D_10;

import java.util.Scanner;

public class C05_equals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str1 = "Mehmet";
        String str2 = "MEHMET";
        String str3 = "mehmet";
        String str4 = "MEHmet";

        System.out.println(str1 == str2); // false

        System.out.println(str3 == str4.toLowerCase()); // false

        System.out.println(str2 == str3.toUpperCase()); // false

        System.out.println(" "); // Ayirmak icin

        System.out.println(str1.equals(str2)); // false

        System.out.println(str3.equals(str4.toLowerCase())); // true

        System.out.println(str2.equals(str3.toUpperCase())); // true

        System.out.println(" "); // Ayirmak icin

        System.out.println(str3.equalsIgnoreCase(str4)); // true

        System.out.println(str2.equalsIgnoreCase(str3)); // true

        System.out.println(str1.equalsIgnoreCase(str2)); // true

        System.out.println("\t1. Bir");

    }

}
