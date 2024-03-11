package D_42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {

    public static void main(String[] args) {

        /*
            Collection icerisindeki tum yapilar index'i desteklemez
            Index olmadan tum elementleri manipule edecegimiz for-each loop
            kullanabiliriz, ancak yapilan degisiklikler kalici olmaz

            Tum elementleri bize getirebilecek ve
            bizim tum elementleri manipule edebilmemize
            izin verecek Iterator ve ListIterator interface'leri var
         */

        int[] arr = {3,4,5,6};

        // index kullanmadan tum elementleri 2'ser artir

        System.out.println(Arrays.toString(arr));

        for (int each : arr
             ) {
            each += 2;
        }

        System.out.println(Arrays.toString(arr));

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(1);

        System.out.println(sayilar); // [5, 23, 2, 13, 1]

        Iterator itr = sayilar.iterator();

        itr.next();
        itr.remove();

        System.out.println(sayilar); // [23, 2, 13, 1]

        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        System.out.println(sayilar); // []


    }
}
