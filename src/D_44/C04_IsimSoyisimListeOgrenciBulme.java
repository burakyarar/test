package D_44;

import java.util.Map;

public class C04_IsimSoyisimListeOgrenciBulme {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        MethodDeposu.isimSoyisimIleOgrenciBul(ogrenciMap, "Ali", "CAN");
        // Ali Can 11 H

    }
}
