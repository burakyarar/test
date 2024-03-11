package D_26;

import java.util.*;

public class C05_Runner {

    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        Set<Integer> ogrenciListesi = new HashSet<>();

        String str = new String("Java Candir");

                   C04             obje      =            new        C04();
        // classAdi / dataTuru   isim   atama isareti   keyword   constructor

        System.out.println(obje.hiz); // 0
        System.out.println(obje.kapaiste); // 0
        System.out.println(obje.ogernciIsmi); // null
        System.out.println(obje.sayi); // 10
        obje.method1(); // method1 calisti


    }
}
