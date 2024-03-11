package D_10;

import java.util.Scanner;

public class C03_StringManipulations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = "Java Candir";

        System.out.println(str.charAt(0)); // J

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        str = str.toLowerCase(); // Atama yapildi

        System.out.println(str); // java candir

    }
}
