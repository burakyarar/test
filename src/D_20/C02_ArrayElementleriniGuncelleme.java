package D_20;

import java.util.Arrays;

public class C02_ArrayElementleriniGuncelleme {

    public static void main(String[] args) {

        int[] sayilar = new int[6];

        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0, 0, 0, 0]

        sayilar[2] = 5;

        System.out.println(Arrays.toString(sayilar)); // [0, 0, 5, 0, 0, 0]

        sayilar[2] = 7;

        System.out.println(Arrays.toString(sayilar)); // [0, 0, 7, 0, 0, 0]

        sayilar[5] = 8;

        System.out.println(Arrays.toString(sayilar)); // [0, 0, 7, 0, 0, 8]

        sayilar[6] = 20; // ArrayIndexOutOfBoundsException (Run Time Error)


    }
}
