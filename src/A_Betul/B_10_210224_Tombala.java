package A_Betul;

import java.util.*;

public class B_10_210224_Tombala {

    public static void main(String[] args) {

        /*
            * Her turda 1'den 49'a kadar rasgele 6 adet sayi ureten bir program

            * Bu 6 sayi birbirinden farkli olacak

            * Sayilar kucukten buyuge sirali olsun

            * Maksimum 10 tur olacak

            * Bir sayi 4 tur ciktiysa, oyun o tur bitecek
         */

        Random rasgeleSayi = new Random();

        Scanner scanner = new Scanner(System.in);

        int sayac = 0;

        int sayi;

        List<Integer> tekrarlar = new ArrayList<>();

        for (int i = 0; i < 48; i++) {
            tekrarlar.add(i , 0);
        }

        List<Integer> torba = new ArrayList<>(49);

        for (int i = 0; i <= 48; i++) {
            torba.add( i ,i+1);
        }

        // System.out.println(torba.toString());

        boolean flag = true;

        List<Integer> sayilar = new ArrayList<>(6);

        List<Integer> kullanilmayanlar = new ArrayList<>();

        for (int i = 0; i <= 48; i++) {
            kullanilmayanlar.add( i ,i+1);
        }

        List<Integer> dokunulmamis = new ArrayList<>();

        for (int i = 0; i <= 48; i++) {
            dokunulmamis.add( i ,i+1);
        }

        int tombala;

        while (flag) {

            for (int i = 1; i < 7; i++) {

                tombala = rasgeleSayi.nextInt(torba.size());
                sayilar.add(torba.get(tombala));
                torba.remove(tombala);

            }

            Collections.sort(sayilar);

            System.out.println(sayilar.toString());

            sayac++;
            if (sayac == 10) flag = false;

            flag = tamamDevam();

            for (int i = 1; i < 49; i++) {
                if (sayilar.contains(i)) {
                    sayi = tekrarlar.get(i - 1);
                    sayi++;
                    tekrarlar.add(i - 1, sayi);
                    if (sayi == 4) flag = false;
                }
            }

            sayilar.clear();
            torba.clear();

            for (int i = 0; i <= 48; i++) {
                torba.add( i ,i+1);
            }

        }

        int yeter = 0;

        for (int i = 0; i < 48; i++) {
            if (tekrarlar.get(i) != 0) {
                kullanilmayanlar.remove(i - yeter);
                yeter++;
            }
        }

        System.out.println("Kullanilmayanlar: " + "\n" + kullanilmayanlar.toString());

        for (int i = 0; i < 48; i++) {

            if (tekrarlar.get(i) != 0) {
                System.out.println(dokunulmamis.get(i) + " sayisi " + tekrarlar.get(i) + " kez tekrarlanmis");
            }
        }

    }

    public static boolean tamamDevam() {

        boolean flag = true;

        Scanner scanner = new Scanner(System.in);
        String tamamDevam = scanner.next();

        if (tamamDevam.equals("0")) {
            flag = false;
        }

        return flag;
    }
}
