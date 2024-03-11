package D_05;

public class C01_MatematikselIslemler {

    public static void main(String[] args) {

        int a = 19;
        int b = 6;

        System.out.println(a / b); // 3 (Sonuc int turunden)

        double c = 28;

        System.out.println(c / b); // 4.666666666666667 (Sayilardan birisi bile double ise sonuc da double olur.)

        System.out.println(2567 / 10); // 256.7 ==> 256

        System.out.println(2567 % 10); // 7

        double sonuc1 = a / b; // 19 / 6 {int / int}

        System.out.println("Sonuc1: " + sonuc1); // 3.0

        double sonuc2 = (double) (a / b); // (19 / 6) {int / int}

        System.out.println("Sonuc2: " + sonuc2); // 3.0

        double sonuc3 = (double) a / b; // 19.0 / 6 {double / int}

        System.out.println("Sonuc3: " + sonuc3); // 3.1666666666666665

        System.out.println( (2567 % 10) + (256 % 10) + (25 % 10) + (2 % 10));




    }
}
