package D_45;

import D_44.MethodDeposu;

import java.lang.reflect.Method;
import java.util.Map;

public class C03_Update {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        System.out.println(ogrenciMap);

        ogrenciMap = MethodDeposu.ogrenciBolumDegistir(ogrenciMap, "TM", "EA");

        System.out.println(ogrenciMap);
    }
}
