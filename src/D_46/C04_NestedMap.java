package D_46;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class C04_NestedMap {

    public static void main(String[] args) {

        Map<Integer, Map<String, Object>> ogrenciMap = new HashMap<>();

        Map<String, Object> ogrenci101Bilgileri = new HashMap<>();
        ogrenci101Bilgileri.put("isim","Ali");
        ogrenci101Bilgileri.put("soyisim","Can");
        ogrenci101Bilgileri.put("sinif",11);
        ogrenci101Bilgileri.put("sube","H");
        ogrenci101Bilgileri.put("bolum","MF");

        Map<String ,Object> ogrenci102Bilgileri = new HashMap<>();
        ogrenci102Bilgileri.put("isim","Veli");
        ogrenci102Bilgileri.put("soyisim","Cem");
        ogrenci102Bilgileri.put("sinif",10);
        ogrenci102Bilgileri.put("sube","K");
        ogrenci102Bilgileri.put("bolum","TM");

        Map<String ,Object> ogrenci103Bilgileri = new HashMap<>();
        ogrenci103Bilgileri.put("isim","Ali");
        ogrenci103Bilgileri.put("soyisim","Cem");
        ogrenci103Bilgileri.put("sinif",11);
        ogrenci103Bilgileri.put("sube","K");
        ogrenci103Bilgileri.put("bolum","TM");

        ogrenciMap.put(101, ogrenci101Bilgileri);
        ogrenciMap.put(102,ogrenci102Bilgileri);
        ogrenciMap.put(103,ogrenci103Bilgileri);

        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.get(103).get("soyisim")); // Cem

        System.out.println(ogrenciMap.get(101).get("isim")); // Ali



    }

}
