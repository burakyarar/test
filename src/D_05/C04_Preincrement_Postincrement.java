package D_05;

public class C04_Preincrement_Postincrement {

    public static void main(String[] args) {

        int a = 20;

        int b = 10;

        System.out.println(b = 2 * a); // 40

        System.out.println(a = b - 5); // 35

        a = 10;

        b = ++a;

        System.out.println("a : " + a + " b : " + b);

        /*

            Bu kullanim sadece a++, a--, ++a, ve --a icin gecerlidir

            Burada ++ vey --'yi once mi yoksa sonra mi kullanacapimiza bizden istenen duruma gore karar veririz.

            Artirma once ise ++a
            Artirma sonra is a++

         */

        a = 20;

        System.out.println(a++); // 20

        System.out.println(a); // 21

        a = 20;

        System.out.println(--a); // 19

        System.out.println(a); // 19

        a = 10;
        b = a++;

        System.out.println(a); // 11
        System.out.println(b); // 10

        a = 10;

        System.out.println("a: " + + ++a); // 11

        b = a++;

        System.out.println("b: " + b); // 11

        int c = b++ + a;

        System.out.println("c: " + c); // 23

        System.out.println("Toplam: " + (a+b+c)); // 47



    }
}
