package D_22;

import java.util.Arrays;

public class C05_varOlanArrayeYeniDegerAtama {

    public static void main(String[] args) {

        int[] arr = {3,4,5,6,8,1};

        System.out.println(arr.length); // 6

        arr = new int[8];

        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0, 0, 0]

        String[] harfler = {"a","n","y"};
        String[] yeniHarfler = {"k","l","m","n"};

        harfler = yeniHarfler;

        System.out.println(Arrays.toString(harfler)); // [k, l, m, n]

        harfler = new String[]{"x"};

        System.out.println(Arrays.toString(harfler)); // [x]

    }
}
