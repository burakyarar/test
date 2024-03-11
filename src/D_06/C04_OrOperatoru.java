package D_06;

public class C04_OrOperatoru {

    public static void main(String[] args) {

        System.out.println(5 > 3 || 6 > 4); // true || true ==> true
        System.out.println(5 > 3 || 6 < 4); // true || false ==> true
        System.out.println(5 < 3 || 6 > 4); // false || true ==> true
        System.out.println(5 < 3 || 6 < 4); // false || false ==> false

        /*

            Or operatoru toplama islemi gibidir
            Toplanan sayilardan birisi bile 0 olmayan bir sayiysa
            sonuc 0 olmaz

            1 + 1 + 1 != 0
            1 + 0 + 0 != 0
            1 + 0 + 0 != 0
            0 + 0 + 0  = 0

         */

        // sayi 3'e veya 5'e bolunmelidir

        int sayi = 24;

        System.out.println(sayi % 3 == 0 || sayi % 5 == 0); // true || false ==> true

        // sayi 0'dan buyuk veya 100'den kucuk olmailidir

        System.out.println(sayi > 0 || sayi < 100); // true || true ==> true

    }
}
