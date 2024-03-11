package D_17;

public class C05_MethodOverloading {

    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        /*
            method overloading olan bir class'ta hangi method'un calisacagina
            asagidaki siralamaya gore method'lar incelenir
            1 - isim
            2 - parametre sayisi
            3 - argument - parametre uyumu
         */

        toplama('s'); // tek int girilirse 2 kati yazilir : 230

        toplama(3,4); // Iki int Toplami: 7

        toplama('a','b'); // Iki int Toplami: 195

        toplama(5,6,5.3); // 3 double'in toplami : 16.3
    }

     public static void toplama(int sayi1, int sayi2) {

        System.out.println("Iki int Toplami: " + (sayi1 + sayi2));
    }

    public static void toplama(double b, int a) {

        System.out.println("double ile int toplami: " + (b + a));
    }

    public static void toplama(double sayi1, double sayi2) {

        System.out.println("double ile double toplami: " + (sayi1 + sayi2));
    }

    public static void toplama(int sayi) {

        System.out.println("tek int girilirse 2 kati yazilir : " + 2 * sayi);
    }

    public static void toplama(int a, int b, int c) {

        System.out.println("3 int'in toplami : " + (a + b + c));
    }

    public static void toplama(double a, double b, double c) {

        System.out.println("3 double'in toplami : " + (a + b + c));
    }
}
