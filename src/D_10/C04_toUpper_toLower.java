package D_10;

import java.util.Locale;
import java.util.Scanner;

public class C04_toUpper_toLower {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = "Java Candır";

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        str = str.toUpperCase(); // JAVA CANDIR

        System.out.println(str.toLowerCase()); //java candir

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr"))); // java candır

    }
}
