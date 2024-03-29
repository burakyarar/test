package D_44;

import java.util.Map;
import java.util.TreeMap;

public class C02_IsimListesi {

    public static void main(String[] args) {

        /*
            1 - tum value'leri bir Collection olarak kaydet
            2 - bir for-each olustur her bir value'yu ele almak icin
            3 - value'lar belirli bir ayirac ile birlestirilen String'lerden
                olustugu icin bu ayirac kullanlilarak split() ile
                bir array'e donusturulebilir
            4 - artik bir array icerisinde value'yu olusturan bilgiler mevcut
                istenen bilgiyi array'den index ile alabiliriz

         */

        Map<Integer, String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        ogrenciMap.put(110, "Kaan-Can-12-K-MF");

        System.out.println(ogrenciMap);
        /*
        {101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF,
        110=Kaan-Can-12-K-MF}
         */

        MethodDeposu.isimSoyisimListesiYazdir(ogrenciMap);
        /*
        Sira No Isim Soyisim
        ====================
        1 -      Ali Can
        2 -      Veli Cem
        3 -      Ali Cem
        4 -      Ayse Can
        5 -      Sevgi Cem
        6 -      Sevgi Can
        7 -      Kaan Can
         */
    }
}
