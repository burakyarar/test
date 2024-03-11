package D_44;

import java.util.Map;

public class C06_NumaraliOgrenciListesi {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        MethodDeposu.numaraliOgrenciListesiYazdir(ogrenciMap);
        /*
        101 Ali Can
        102 Veli Cem
        103 Ali Cem
        104 Ayse Can
        105 Sevgi Cem
        106 Sevgi Can
         */
    }
}
