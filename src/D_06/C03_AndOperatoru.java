package D_06;

public class C03_AndOperatoru {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        System.out.println((a & b) <= 25); // true

        System.out.println(5 > 3 && 6 > 4); // true & true ==> true

        System.out.println(5 < 3 && 6 > 4); // false & true ==> false

        System.out.println(5 > 3 && 6 < 4); // true & false ==> false

        System.out.println(5 < 3 && 6 < 4); // false & false ==> false

        /*

            && ile baglanan ifadelerin true olabilmesi icin butun ifadelerin true olmasi gerekir
            Bunun disindaki tum durumlarda false olur

            1 * 1 * 1 * 1 = 1
            1 * 1 * 1 * 0 = 0
            1 * 1 * 0 * 0 = 0
            1 * 0 * 0 * 0 = 0
            0 * 0 * 0 * 0 = 0

         */

        int sayi = 24;

        System.out.println(sayi % 2 == 0 && sayi % 3 == 0 && sayi % 5 == 0); // true & true & false ==> false

        // sayi 0 veya daha buyuk ve 100 veya daha kucuk olmalidir
        // sayi 0 ile 100 arasinda olmalidir (0 ve 100 dahil)

        System.out.println(sayi >= 0 && sayi <= 100); // true & true ==> true



    }
}
