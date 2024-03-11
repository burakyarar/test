package D_25;

import java.util.ArrayList;
import java.util.List;

public class C02_IstenmeyenIsimleriSil {

    public static void main(String[] args) {

        String[] arr = {"Mehmet","Ramazan","Ozan","Berk","Nergiz","Ayfer","Bugra"};

        List<String> isimler = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            isimler.add(arr[i]);
        }

        System.out.println("Isimler Listesi: " + isimler);
        // Isimler Listesi: [Mehmet, Ramazan, Ozan, Berk, Nergiz, Ayfer, Bugra]

        System.out.println(istenmeyenleriSil(isimler, "e"));
        // [Ramazan, Ozan, Bugra]

        isimler = istenmeyenleriSil(isimler,"a");

        System.out.println(isimler);
        // [Mehmet, Berk, Nergiz, Ayfer]
    }

    public static List<String> istenmeyenleriSil(List<String> isimler, String istenmeyenHarf) {

        List<String> yeniList = new ArrayList<>();



        for (int i = 0; i < isimler.size(); i++) {

            if (!isimler.get(i).contains(istenmeyenHarf)) {
                yeniList.add(isimler.get(i));
            }
        }

        return yeniList;
    }
}
