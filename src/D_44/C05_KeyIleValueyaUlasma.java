package D_44;

import java.util.Map;

public class C05_KeyIleValueyaUlasma {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        System.out.println(ogrenciMap.get(102));
        System.out.println(ogrenciMap.get(105));
        System.out.println(ogrenciMap.get(123)); // null

        MethodDeposu.numaraIleOgrenciBilgisiYazdirma(ogrenciMap,103);
        // Isim: Ali, Soyisim: Cem, Sinif: 11, Sube: K
    }
}
