package D_29;

import java.util.Arrays;

public class Co4_PassByValueCokluElement {

    public static void main(String[] args) {

        int[] arr = {3,4,5};

        // elementleri 2 katina cikar ve yazdir

        System.out.println("method'dan once arr: " + Arrays.toString(arr)); // method'dan once arr: [3, 4, 5]
        elementleriArtir(arr); // method'da degistirilen arr: [6, 8, 10]
        System.out.println("method'dan sonra arr: " + Arrays.toString(arr)); // method'dan sonra arr: [6, 8, 10]

        // array'e 10 degerini element olarak ekleyip yazdir

        int[] arr2 = {3,4,5};

        System.out.println("method'dan once arr2: " + Arrays.toString(arr2)); // method'dan once arr2: [3, 4, 5]
        elementEkle(arr2); // method'da arr2 yeni hali: [3, 4, 5, 10]
        System.out.println("method'dan sonra arr2: " + Arrays.toString(arr2)); // method'dan sonra arr2: [3, 4, 5]

        /*
            pass by value (pbv) method'lar arasinda variable'in kendisinin degil
            value'sunun gecisini saglamak anlamina gelir

            - tek bir element ise
                gittigi method'da yapilan degisiklik KALICI OLMAZ
                kalici olsun istersek mathod call yaptigimizda atama yapmaliyiz

            - coklu element iceren yapi ise
                * objenin kenidisine degil elementlerine atama yapilirsa degisilikli KALICI OLUR (yolcu degisti)
                * objenin kendisinie yeni bir deger atamasi yapilirsa degisiklik KALICI OLMAZ (araba degisti)
        */

    }

    public static void elementEkle(int[] arr) {

        int[] yeniArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] = arr[i];
        }

        yeniArr[yeniArr.length - 1] = 10;

        arr = yeniArr;

        System.out.println("method'da arr2 yeni hali: " + Arrays.toString(arr));
    }

    public static void elementleriArtir(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] *= 2;
        }

        System.out.println("method'da degistirilen arr: " + Arrays.toString(arr));
    }


}
