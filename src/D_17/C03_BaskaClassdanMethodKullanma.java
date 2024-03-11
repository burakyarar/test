package D_17;

import D_16.C01_methodOlusturma;
import D_16.C03_methodOlusturma;

public class C03_BaskaClassdanMethodKullanma {

    public static void main(String[] args) {

        C01_methodOlusturma.altString("Method budur...",7,8); // b

        System.out.println(C03_methodOlusturma.isimDuzenle("Burak", "YARAR")); // Burak Yarar

        System.out.println(C01_AsalSayiBulma.asalSayiMi(59)); // true

        System.out.println(C02_TamBolenlerSayisiniBulma.tamBolenlerSayisi(12)); // 6

    }
}
