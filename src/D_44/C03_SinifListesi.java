package D_44;

import java.util.Map;

public class C03_SinifListesi {

    public static void main(String[] args) {

        Map<Integer, String > ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        MethodDeposu.sinifSubedekiOgrenciListesiYazdir(ogrenciMap, 10,"K");
        /*
        10. sinif K subesindeki ogrenci listesi
        Veli Cem
        Sevgi Can
         */

    }
}
