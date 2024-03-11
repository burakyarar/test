package D_45;

import D_44.MethodDeposu;

import java.util.Map;

public class C01_Update {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        // 105'in soyismini Han yap

        ogrenciMap.put(105, "Sevgi-Han-11-M-TM");

        // 103'un sinifini T yap

        ogrenciMap.put(103, "Ali-Cem-11-T-TM");

        System.out.println(ogrenciMap);
        /*
            {101=Ali-Can-11-H-MF,
            102=Veli-Cem-10-K-TM,
            103=Ali-Cem-11-T-TM,
            104=Ayse-Can-10-H-MF,
            105=Sevgi-Han-11-M-TM,
            106=Sevgi-Can-10-K-MF}
         */

        /*
            Map'de bir value update etmek istersek
            1 - bilgiye ulasmak icin value'yu array'e cevirmeliyiz
                - key ile value cagirilir
                - value array'e cevirilir
                - array uzerinden istenen update yapilir
            2 - parcaladigimiz value'yu yeni haliyle birlestiririz
            3 - key ve yeni value kullanarak Map'i update ederiz
         */

    }
}
