package D_22;

import java.util.Arrays;

public class C02_sort {

    public static void main(String[] args) {

        String[] harfler = {"L","a","P","d","T","t"};

        System.out.println(Arrays.toString(harfler)); // [L, a, P, d, T, t]

        Arrays.sort(harfler);

        System.out.println(Arrays.toString(harfler)); // [L, P, T, a, d, t]

        String[] isimler = {"Ayse","Yusuf","Bugra","Burak","Abdullah","Nergiz","Neslihan"};

        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler)); // [Abdullah, Ayse, Bugra, Burak, Nergiz, Neslihan, Yusuf]

        int[] sayilar = {4,78,4,2,98,3,7,1};

        Arrays.sort(sayilar,3,6);

        System.out.println(Arrays.toString(sayilar)); // [4, 78, 4, 2, 3, 98, 7, 1]

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar)); // [1, 2, 3, 4, 4, 7, 78, 98]
    }
}
