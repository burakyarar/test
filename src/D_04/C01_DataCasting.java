package D_04;

public class C01_DataCasting {

    public static void main(String[] args) {

        String str = "Java Candir";

        // int sayi1 = str;

        int sayi2 = 's';
        double dbl1 = sayi2;

        int sayi3 = 10;
        double dbl2 = 4.5;
        short sh1 = 3;
        byte by1 = 7;

        dbl2 = sayi3;
        dbl2 = sh1;
        dbl2 = by1;

        // sayi3 = dbl2;
        sayi3 = sh1;
        sayi3 = by1;

        sayi3 = (int) dbl2;

        //sh1 = dbl2;
        //sh1 = sayi3;
        sh1 = by1;

        sh1 = (short) dbl2;
        sh1 = (short) sayi3;

        // by1 = dbl2;
        // by1 = sayi3;
        // by1 = sh1;

        by1 = (byte) dbl2;
        by1 = (byte) sayi3;
        by1 = (byte) sh1;







    }
}
