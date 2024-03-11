package D_21;

import java.util.Arrays;

public class C02_ArrayinElementleriniIstenenKadarArtirma {

    public static void main(String[] args) {

        int[] arr = {3,5,2,7};
        int artis = 3;

        for (int i = 0; i < arr.length; i++) {

            arr[i] += artis;
        }

        System.out.println(Arrays.toString(arr)); // [6, 8, 5, 10]

        int[] sayilar = {5,8,2};

        System.out.println(Arrays.toString(elementleriArtir(sayilar,5))); // [10, 13, 7]
    }

    public static int[] elementleriArtir(int[] arr, int artis) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] += artis;

        }

        return arr;
    }
}
