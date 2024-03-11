package D_22;

import java.util.Arrays;

public class C06_ArreyeBirElemanEkleme {

    public static void main(String[] args) {

        int[] arr = {3,7,8};

        int eklenecekSayi = 10;

        int[] yeniArr = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] = arr[i];

        }

        System.out.println(Arrays.toString(yeniArr)); // [3, 7, 8, 0]

        yeniArr[yeniArr.length-1] = eklenecekSayi;

        System.out.println(Arrays.toString(yeniArr)); // [3, 7, 8, 10]

        arr = yeniArr;

        System.out.println("arr'nin son hali: " + Arrays.toString(arr)); // arr'nin son hali: [3, 7, 8, 10]

    }

    public static int[] arrayeBirElemanEkle(int[] eskiArr, int eklenecekSayi) {

        int[] yeniArr = new int[eskiArr.length+1];

        for (int i = 0; i < eskiArr.length; i++) {

            yeniArr[i] = eskiArr[i];

        }

        yeniArr[yeniArr.length-1] = eklenecekSayi;

        eskiArr = yeniArr;

        return eskiArr;

    }
}
