package D_44;

import java.lang.invoke.SwitchPoint;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MethodDeposu {

    public static Map<Integer, String> ogrenciMapOlustur(){

        Map<Integer, String> ogrenciMap = new TreeMap<>();

        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");

        return  ogrenciMap;
    }

    public static void isimSoyisimListesiYazdir(Map<Integer, String> ogrenciMap){

        Collection<String> valueCollection = ogrenciMap.values();
        System.out.println("Sira No Isim Soyisim");
        System.out.println("====================");

        int siraNo = 1;

        for (String eachValue: valueCollection // "Ali-Can-11-H-MF"
             ) {
            String[] valueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]

            System.out.println(siraNo + " -      " + valueArr[0] + " " + valueArr[1]);
            siraNo++;

        }
    }

    public static void sinifSubedekiOgrenciListesiYazdir(Map<Integer, String> ogrenciMap, int sinif, String sube){

        Collection<String> valueCollection = ogrenciMap.values();
        System.out.println(sinif + ". sinif " + sube + " subesindeki ogrenci listesi");

        for (String eachValue: valueCollection
             ) {
            String[] valueArr = eachValue.split("-");

            String sinifStr = sinif + "";

            if (valueArr[2].equals(sinifStr) && valueArr[3].equalsIgnoreCase(sube)){
                System.out.println(valueArr[0] + " " + valueArr[1]);
            }
        }
    }

    public static void isimSoyisimIleOgrenciBul(Map<Integer, String> ogrenciMap, String isim, String soyIsim){

        Collection<String> valueCollection = ogrenciMap.values();

        for (String eachValue: valueCollection
             ) {
            String[] valueArr = eachValue.split("-");

            if (valueArr[0].equalsIgnoreCase(isim) && valueArr[1].equalsIgnoreCase(soyIsim)){

                System.out.println(valueArr[0] + " " + valueArr[1] + " " + valueArr[2] + " " + valueArr[3]);
            }
        }
    }

    public static void numaraIleOgrenciBilgisiYazdirma(Map<Integer, String> ogrenciMap, int ogrenciNo) {

        String istenenOgrenciValue = ogrenciMap.get(ogrenciNo);

        String[] istenenogrenciArr = istenenOgrenciValue.split("-");

        System.out.println("Isim: " + istenenogrenciArr[0] + ", " +
                            "Soyisim: " + istenenogrenciArr[1] + ", " +
                            "Sinif: " + istenenogrenciArr[2] + ", " +
                            "Sube: " + istenenogrenciArr[3]);
    }

    public static void numaraliOgrenciListesiYazdir(Map<Integer, String> ogrenciMap){

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        for (Integer eachKey: ogrenciKeySeti
             ) {

            System.out.print(eachKey + " ");

            String valueStr = ogrenciMap.get(eachKey);
            String[] valueArr = valueStr.split("-");

            System.out.println(valueArr[0] + " " + valueArr[1]);

        }

    }

    public static Map<Integer, String> yilSonuSinifArtir(Map<Integer, String> ogrenciMap) {

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        for (Integer eachKey: ogrenciKeySeti
             ) {
            String eachValue = ogrenciMap.get(eachKey);

            String[] valueArr = eachValue.split("-");

            switch (valueArr[2]){
                case "9" :
                    valueArr[2] = "10";
                    break;
                case "10" :
                    valueArr[2] = "11";
                    break;
                case "11" :
                    valueArr[2] = "12";
                    break;
                case "12" :
                    valueArr[2] = "Mezun";
                    break;
            }
            String yeniValue = valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] + "-" + valueArr[3] + "-" +valueArr[4];

            ogrenciMap.put(eachKey,yeniValue);
        }

        return ogrenciMap;
    }

    public static Map<Integer, String> ogrenciBolumDegistir(Map<Integer, String> ogrenciMap, String eskiBolum, String yeniBolum) {

        Set<Integer> ogrenciKeySet = ogrenciMap.keySet();

        for (Integer eachKey: ogrenciKeySet
             ) {

            ogrenciMap.get(eachKey);

            String eachValue = ogrenciMap.get(eachKey);

            String[] valueArr = eachValue.split("-");

            if (valueArr[4].equalsIgnoreCase(eskiBolum)){
                valueArr[4] = yeniBolum;
            }

            String yeniValue = valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] + "-" + valueArr[3] + "-" +valueArr[4];

            ogrenciMap.put(eachKey,yeniValue);

        }

        return ogrenciMap;
    }
}
