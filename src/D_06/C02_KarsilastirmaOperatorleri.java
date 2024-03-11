package D_06;

public class C02_KarsilastirmaOperatorleri {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        b = 2 * a;

        // Esitligi kontrol etmek icin == kullanilir
        // Esitligin sol tarafinda islem olmaz
        // Karsilastirma operatorlerinde iki tarafta da islem olabilir

        System.out.println(b == 2 * a); // 20 = 20 ==> true

        System.out.println(3 * b > 5 * a); // 3 * 20 > 5 * 10 ==> true

        System.out.println(b >= b - a); // 20 >= 20 - 10 ==> true

        System.out.println(a <= b - a); // 10 <= 20 - 10 ==> true

        System.out.println("Second Part");

        a = 10;
        b = 15;

        System.out.println(a == b); // Is a = b ==> false
        System.out.println(a == b - 5); // Is a = b - 5 ==> true

        boolean c;

        System.out.println(c = 15==b); // Is b = 15? ==> true

        c = 15 * a == 10 * b;

        System.out.println(c); // Is 15 * a = 10 * b? ==> true

        // Karsilastirma operatorlerinde kullanilan ! boolean degeri tersine cevirir

        System.out.println(a < b); // Is 10 < 15? ==> true

        System.out.println( ! (a < b)); // 10 is not < 15 ==> false

        System.out.println(a != b); // 10 is not = 15 ==> true

    }
}
