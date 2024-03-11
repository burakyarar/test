package D_20;

import java.util.Arrays;

public class C01_ArrayOlusturma {

    public static void main(String[] args) {

        int[] sayilar = {2,4,6,7,8};

        String harfler[] = {"a","f","e"};

        System.out.println(sayilar[1]); // 4
        System.out.println(harfler[2]); // e

        String[] ogrenciList = {"Burhan","Ramazan","Samet","Senol"};

        System.out.println(ogrenciList[1]); // Ramazan

        String[] sinifListesi1 = {null,null,null,null,null};
        String[] sinifListesi2 = new String[5];

        // sinifListesi = new String[5];

        System.out.println(sayilar); // [I@3ac3fd8b

        for (int i = 0; i < sayilar.length; i++) {

            System.out.print(sayilar[i] + " "); // 24678
        }
        System.out.println(" ");

        System.out.println(Arrays.toString(sayilar)); // [2, 4, 6, 7, 8]

        System.out.println(Arrays.toString(harfler)); // [a, f, e]

        System.out.println(Arrays.toString(sinifListesi1)); // [null, null, null, null, null]
        System.out.println(Arrays.toString(sinifListesi2)); // [null, null, null, null, null]

        int[] notlar = new int[4];

        System.out.println(Arrays.toString(notlar)); // [0, 0, 0, 0]

        boolean[] blList = new boolean[8];

        System.out.println(Arrays.toString(blList)); // [false, false, false, false, false, false, false, false]

    }
}
