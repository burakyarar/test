package D_04;

public class C02_ExplicitNarrowing {

    public static void main(String[] args) {

        double dbl1 = 123.6;

        int sayi1 = (int) dbl1;

        System.out.println("Int 1: " + sayi1); // 123

        byte by1 = (byte) sayi1;

        System.out.println("Byte 1: " + sayi1); // 123

        int sayi2 = 130;
        byte by2 = (byte) sayi2;

        System.out.println("Byte 2: " + by2); // -126
        // 125, 126, 127, -128, -127, -126
        // 125, 126, 127,  128,  129,  130






    }
}
