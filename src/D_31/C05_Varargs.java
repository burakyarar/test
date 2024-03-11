package D_31;

public class C05_Varargs {

    public static void main(String[] args) {

        toplama(3,5); // Iki int sayi toplami: 8    ==> Verilen int sayilar toplami: 8
        toplama(3,5,7); // Uc int sayi toplami: 15  ==> Verilen int sayilar toplami: 15
        toplama(3,5,7,9); // Verilen int sayilar toplami: 24

    }

    /*


    public static void toplama(int sayi1, int sayi2) {

        System.out.println("Iki int sayi toplami: " + (sayi1 + sayi2));
    }

    public static void toplama(int sayi1, int sayi2, int sayi3) {

        System.out.println("Uc int sayi toplami: " + (sayi1 + sayi2 + sayi3));
    }

     */

    public static void toplama(int... sayi1) {

        int toplam = 0;

        for (int i = 0; i < sayi1.length; i++) {

            toplam += sayi1[i];
        }

        System.out.println("Verilen int sayilar toplami: " + toplam);
    }
}
