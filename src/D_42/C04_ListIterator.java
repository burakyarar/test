package D_42;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(56);
        sayilar.add(23);
        sayilar.add(45);
        sayilar.add(14);
        sayilar.add(40);

        System.out.println(sayilar); // [2, 13, 56, 23, 45, 14, 40]

        ListIterator lit = sayilar.listIterator();

        while (lit.hasNext()) {

            Integer sayi = (Integer) lit.next();

            if (sayi < 20 || sayi > 40) {
                lit.remove();
            }
        }

        System.out.println(sayilar); // [23, 40]
    }
}
