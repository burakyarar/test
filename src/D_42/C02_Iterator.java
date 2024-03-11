package D_42;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(1);

        /*

        for (Integer each : sayilar
             ) {
            if (each > 10) {
                sayilar.remove(each);
            }
        }

        System.out.println(sayilar); // ConcurrentModificationException

         */

        System.out.println(sayilar); // [5, 23, 2, 13, 1]

        Iterator itr = sayilar.iterator();

        while (itr.hasNext()) {

            Integer sayi = (Integer) itr.next();

            if (sayi > 10) {
                itr.remove();
            }
        }

        System.out.println(sayilar); // [5, 2, 1]

        sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(1);

        for (int i = 0; i < sayilar.size(); i++) {

            if (sayilar.get(i) > 10) {
                sayilar.remove(i);
            }
        }

        System.out.println(sayilar); // [5, 2, 1]

    }
}
