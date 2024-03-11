package D_23;

import java.util.Arrays;

public class C04_OrtakIndexliSayilarinToplami {

    public static void main(String[] args) {

        int[][] arr = {{3,4,5},{2,3,6,7}};

        int uzunluk = arr[0].length < arr[1].length ? arr[0].length : arr[1].length;

        // int uzunluk = Math.min(arr[0].length, arr[1].length);

        int[] yeniArr = new int[uzunluk]; // [0,0,0]

        for (int i = 0; i < yeniArr.length; i++) {

            yeniArr[i] = arr[0][i] + arr[1][i];

        }


        System.out.println(Arrays.toString(yeniArr)); // [5, 7, 11]
    }
}
