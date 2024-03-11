package D_17;

public class C04_MethodOverloading {

    public static void main(String[] args) {

        toplama(4,6); // Iki int Toplami: 10

        toplama(5.3,6); // double ile int toplami: 11.3

        toplama(5, 2.4); // int ile double toplami: 7.4

        toplama(4.3,2.4); // double ile double toplami: 6.699999999999999

        toplama(3.4f,5); // double ile int toplami: 8.400000095367432

        toplama(2.3f, 5f); // double ile double toplami: 7.299999952316284
    }

    public static void toplama(int sayi1, int sayi2) {

        System.out.println("Iki int Toplami: " + (sayi1 + sayi2));
    }

    public static void toplama(int a, double b) {

        System.out.println("int ile double toplami: " + (a + b));
    }

    public static void toplama(double b, int a) {

        System.out.println("double ile int toplami: " + (b + a));
    }

    public static void toplama(double sayi1, double sayi2) {

        System.out.println("double ile double toplami: " + (sayi1 + sayi2));
    }

    /*


    */
}
