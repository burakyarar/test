package D_25;

import java.util.ArrayList;
import java.util.List;

public class C03_TamBolenlerListesi {

    public static void main(String[] args) {



        int sayi = 20;

        System.out.println(pozitifTamBolenlerListesi(sayi)); // [1, 2, 4, 5, 10, 20]

    }

    public static List<Integer> pozitifTamBolenlerListesi(int sayi) {

        List<Integer> tamBolenlerListesi = new ArrayList<>();

        String asal = "Sayi bir asal sayi";

        for (int i = 1; i <= sayi; i++) {

            if (sayi % i == 0) {
                tamBolenlerListesi.add(i);
            }
        }

        if (tamBolenlerListesi.size() == 2) {
            System.out.println(asal);
            return tamBolenlerListesi;
        } else return tamBolenlerListesi;
    }
}
