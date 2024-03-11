package D_11;

import java.time.chrono.MinguoDate;

public class C07_IndexOf {
    public static void main(String[] args) {

        String str = "Ali topu at, at ali at";

        System.out.println(str.indexOf("Ali")); // 0

        System.out.println(str.indexOf("ali")); // 16

        System.out.println(str.indexOf("at")); // 9

        System.out.println(str.indexOf("op")); // 5

        System.out.println(str.indexOf("a",10)); // 13

        System.out.println(str.indexOf("ss")); // -1

    }
}
