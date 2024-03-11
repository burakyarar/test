package D_45;

import D_44.MethodDeposu;

import java.util.Map;

public class C02_SiniflariBirArtirma {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        System.out.println(ogrenciMap);

        ogrenciMap = MethodDeposu.yilSonuSinifArtir(ogrenciMap);

        System.out.println(ogrenciMap);
    }
}
