package D_13;

public class C06_forLoop {

    public static void main(String[] args) {

        for (int i = 0; i > 10; i++) {
            System.out.println(i); // forLoop calisti ancak forLoop body si devreye girmedi
        }

        /*
            for (int i = 0; i >= 0 ; i++) {
                System.out.print(i);
            }

            Sonsuz loop olusur
        */

        int bas = 201;
        int bit = 237;

        int aranan = 43;

        // bas ve bit degerleri dahil olarak bu sayilar arasinda aranan'a tam bolunebilen
        // bir sayi varsa "tam bolunebilen bir sayi var" yazdir

        for (int i = bas; i < bit; i++) {
            System.out.print(i + " "); // 201 202 203 204 205 206 207 208 209 210 211 212 213 214 215
            if (i % aranan == 0) {
                System.out.print("\nTam bolunebilen bir sayi var"); // Tam bolunebilen bir sayi var
                System.out.println("\nSayi: " + i); // Sayi: 215
                break;
            }
        }








    }
}
