package D_05;

public class C03_Increment_Decrement {

    public static void main(String[] args) {

        int sayi = 10;

        // sayi = 2 * sayi + 5;

        sayi *= 2;
        sayi += 5;

        System.out.println(sayi); // 25

        sayi = 10;

        sayi--;
        sayi /= 3;
        sayi *= 2;
        sayi += 3;

        System.out.println(sayi); // 9

        int a = 10;

        int b = a;
        a++;

        System.out.println("a : " + a + " b : " + b); // a : 11 b : 10

        a = 10;

        a++;
        b = a;

        System.out.println("a : " + a + " b : " + b); // a : 11 b : 11



    }
}
